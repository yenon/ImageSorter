/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagesorter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Game
 */
public class ImageSorterMainThread extends Thread {
    
    private File in;
    private String out;
    private boolean copy;
    private final String[] extensions = {".jpg", ".png", ".jpeg"};
    private final ImageSorterMainView ismv;

    public ImageSorterMainThread(ImageSorterMainView _ismv, String inpDir, String outpDir, boolean _copy) throws FileNotFoundException {
        ismv=_ismv;
        in = new File(inpDir);
        out = outpDir;
        copy = _copy;
        if (!in.isDirectory() && !new File(out).isDirectory()) {
            throw new FileNotFoundException();
        }
    }
    
    public void setFileProgress(int p){
        ismv.setFileProgress(p);
    }
    
    
    @Override
    public void run() {
        File[] picIn, picOut;
        File pic,fout;
        ArrayList pl = new ArrayList(), cl = new ArrayList();
        int i = 0, ecount,pcount,ipcount;
        pcount=0;
        boolean isPic;
        picIn = in.listFiles();
        while (i < picIn.length) {
            isPic = false;
            ecount=0;
            while (!isPic && ecount < extensions.length) {
                isPic = picIn[i].getName().toLowerCase().endsWith(extensions[ecount]);
                ecount++;
            }
            if (isPic) {
                pcount++;
            }
            i++;
        }
        pcount--;
        i=0;
        ipcount=0;
        while (i < picIn.length) {
            isPic = false;
            ecount = 0;
            while (!isPic && ecount < extensions.length) {
                isPic = picIn[i].getName().toLowerCase().endsWith(extensions[ecount]);
                ecount++;
            }
            if (isPic) {
                Calendar cal = Calendar.getInstance();
                cal.setTimeInMillis(picIn[i].lastModified());
                pic = picIn[i];
                if (!new File(out + "/" + String.valueOf(cal.get(Calendar.YEAR)) + "/" + String.valueOf(cal.get(Calendar.MONTH)+1) + "/" + String.valueOf(cal.get(Calendar.DATE))).isDirectory()) {
                    if (!new File(out + "/" + String.valueOf(cal.get(Calendar.YEAR)) + "/" + String.valueOf(cal.get(Calendar.MONTH)+1) + "/" + String.valueOf(cal.get(Calendar.DATE))).mkdirs()) {
                        System.out.println("Error!");
                    }
                }
                fout = new File(out + "/" + String.valueOf(cal.get(Calendar.YEAR)) + "/" + String.valueOf(cal.get(Calendar.MONTH)+1) + "/" + String.valueOf(cal.get(Calendar.DATE) + "/" + pic.getName()));
                ismv.setFullProgress(Math.round(((float)ipcount/(float)pcount)*100));
                ismv.setFileTextLabel("Kopiere "+pic.getName());
                ismv.setFullProgressText("Gesamt: ("+String.valueOf(ipcount)+"/"+String.valueOf(pcount)+")");
                if (copy) {
                    CopyPic cp = new CopyPic(this, pic, fout);
                    cp.copy();
                } else {
                    pic.renameTo(fout);
                }
                ipcount++;
            }
            i++;
        }
ismv.setFileTextLabel("Alle Dateien kopiert!");
ismv.setFullProgressText("Vorgang abgeschlossen!");
    }
}

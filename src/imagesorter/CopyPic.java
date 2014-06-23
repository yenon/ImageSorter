/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagesorter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Game
 */
public class CopyPic {

    private File psrc, pout;
    private ImageSorterMainThread ismt;

    public CopyPic(ImageSorterMainThread _ismt,File _psrc, File _pout) {
        ismt=_ismt;
        psrc = _psrc;
        pout = _pout;
    }

    public void copy() {
        InputStream input = null;
        OutputStream output = null;
        long i=0,len;
        len=psrc.length();
        try {
            input = new FileInputStream(psrc);
            output = new FileOutputStream(pout);
            byte[] buf = new byte[16384];
            int bytesRead;
            while ((bytesRead = input.read(buf)) > 0) {
                output.write(buf, 0, bytesRead);
                i=i+bytesRead;
                ismt.setFileProgress(Math.round(((float)i/(float)len)*100));
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                input.close();
                output.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

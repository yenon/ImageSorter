/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imagesorter;

import java.io.FileNotFoundException;

/**
 *
 * @author Game
 */
public class ImageSorterMainView extends javax.swing.JFrame {

    /**
     * Creates new form ImageSorterMainView
     */
    public ImageSorterMainView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        InputDir = new javax.swing.JTextField();
        OutputDir = new javax.swing.JTextField();
        SetInputDir = new javax.swing.JButton();
        SetOutputDir = new javax.swing.JButton();
        RadioBtnPanel = new javax.swing.JPanel();
        RadioBtnCopy = new javax.swing.JRadioButton();
        RadioBtnMove = new javax.swing.JRadioButton();
        StartButton = new javax.swing.JButton();
        FileDescLabel = new javax.swing.JLabel();
        FileProgress = new javax.swing.JProgressBar();
        FullDescLabel = new javax.swing.JLabel();
        FullProgress = new javax.swing.JProgressBar();

        jFileChooser1.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InputDir.setText("Eingabeverzeichnis");

        OutputDir.setText("Ausgabeverzeichnis");

        SetInputDir.setText("Wählen");
        SetInputDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetInputDirActionPerformed(evt);
            }
        });

        SetOutputDir.setText("Wählen");
        SetOutputDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetOutputDirActionPerformed(evt);
            }
        });

        RadioBtnPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup1.add(RadioBtnCopy);
        RadioBtnCopy.setSelected(true);
        RadioBtnCopy.setText("Kopieren");

        buttonGroup1.add(RadioBtnMove);
        RadioBtnMove.setText("Verschieben");

        javax.swing.GroupLayout RadioBtnPanelLayout = new javax.swing.GroupLayout(RadioBtnPanel);
        RadioBtnPanel.setLayout(RadioBtnPanelLayout);
        RadioBtnPanelLayout.setHorizontalGroup(
            RadioBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RadioBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioBtnCopy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioBtnMove)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RadioBtnPanelLayout.setVerticalGroup(
            RadioBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RadioBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RadioBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioBtnCopy)
                    .addComponent(RadioBtnMove))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        StartButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        StartButton.setText("Start!");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        FileDescLabel.setText(" ");

        FullDescLabel.setText("Gesamt:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(InputDir, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OutputDir, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SetOutputDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SetInputDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(FullProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FileProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FullDescLabel)
                            .addComponent(FileDescLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RadioBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StartButton, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetInputDir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SetOutputDir)
                    .addComponent(OutputDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RadioBtnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FileDescLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FileProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FullDescLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FullProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setFullProgress(int p){
        FullProgress.setValue(p);
    }
    public void setFileProgress(int p){
        FileProgress.setValue(p);
    }
    public void setFullProgressText(String t){
        FullDescLabel.setText(t);
    }
    public void setFileTextLabel(String t){
        FileDescLabel.setText(t);
    }
    
    private void SetInputDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetInputDirActionPerformed
        jFileChooser1.showOpenDialog(null);
        if(jFileChooser1.getSelectedFile().isDirectory()){
            InputDir.setText(jFileChooser1.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_SetInputDirActionPerformed

    private void SetOutputDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetOutputDirActionPerformed
        jFileChooser1.showOpenDialog(null);
        if(jFileChooser1.getSelectedFile().isDirectory()){
            OutputDir.setText(jFileChooser1.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_SetOutputDirActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        if(!"".equals(OutputDir.getText())&&!"".equals(InputDir.getText())){
            try{
                ImageSorterMainThread ismt = new ImageSorterMainThread(this,InputDir.getText(),OutputDir.getText(),RadioBtnCopy.isSelected());
                ismt.start();
            }catch(FileNotFoundException ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_StartButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ImageSorterMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageSorterMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageSorterMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageSorterMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageSorterMainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FileDescLabel;
    private javax.swing.JProgressBar FileProgress;
    private javax.swing.JLabel FullDescLabel;
    private javax.swing.JProgressBar FullProgress;
    private javax.swing.JTextField InputDir;
    private javax.swing.JTextField OutputDir;
    private javax.swing.JRadioButton RadioBtnCopy;
    private javax.swing.JRadioButton RadioBtnMove;
    private javax.swing.JPanel RadioBtnPanel;
    private javax.swing.JButton SetInputDir;
    private javax.swing.JButton SetOutputDir;
    private javax.swing.JButton StartButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
}

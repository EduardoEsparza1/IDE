/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author eduar
 */
public class Proyecto extends javax.swing.JFrame {

    /**
     * Creates new form IDE
     */
    public Proyecto() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        codeTabsPanel = new javax.swing.JTabbedPane();
        mainScrollPane = new javax.swing.JScrollPane();
        codePane = new javax.swing.JTextPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newFileBtn = new javax.swing.JMenuItem();
        openFileBtn = new javax.swing.JMenuItem();
        saveFileBtn = new javax.swing.JMenuItem();
        saveAsBtn = new javax.swing.JMenuItem();
        closeFileBtn = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 400, 690));
        setMinimumSize(new java.awt.Dimension(1000, 600));

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(47, 800));

        jScrollPane2.setViewportView(jTextPane2);

        jTabbedPane1.addTab("Resultados", jScrollPane2);

        jScrollPane7.setViewportView(jTextPane7);

        jTabbedPane1.addTab("Errores", jScrollPane7);

        mainScrollPane.setViewportView(codePane);

        codeTabsPanel.addTab("Nuevo Archivo*", mainScrollPane);

        jTextPane4.setEditable(false);
        jScrollPane1.setViewportView(jTextPane4);

        jTabbedPane3.addTab("Léxico", jScrollPane1);

        jTextPane5.setEditable(false);
        jScrollPane5.setViewportView(jTextPane5);

        jTabbedPane3.addTab("Sintáctico", jScrollPane5);

        jTextPane3.setEditable(false);
        jScrollPane3.setViewportView(jTextPane3);

        jTabbedPane3.addTab("Semántico", jScrollPane3);

        jTextPane6.setEditable(false);
        jScrollPane6.setViewportView(jTextPane6);

        jTabbedPane3.addTab("Código Intermedio", jScrollPane6);

        jMenu1.setText("Archivo");

        newFileBtn.setText("Nuevo");
        newFileBtn.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/pressed/icons8_code_file_48px_p.png"))); // NOI18N
        newFileBtn.setSelected(true);
        newFileBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/On Layer/icons8_code_file_48px_on.png"))); // NOI18N
        newFileBtn.setVerifyInputWhenFocusTarget(false);
        newFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileBtnActionPerformed(evt);
            }
        });
        jMenu1.add(newFileBtn);

        openFileBtn.setText("Abrir");
        openFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileBtnActionPerformed(evt);
            }
        });
        jMenu1.add(openFileBtn);

        saveFileBtn.setText("Guardar");
        jMenu1.add(saveFileBtn);

        saveAsBtn.setText("Guardar Como...");
        saveAsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsBtnActionPerformed(evt);
            }
        });
        jMenu1.add(saveAsBtn);

        closeFileBtn.setText("Cerrar");
        closeFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeFileBtnActionPerformed(evt);
            }
        });
        jMenu1.add(closeFileBtn);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Formato");

        jMenuItem8.setText("Fuente");
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Proyecto");

        jMenuItem6.setText("Compilar");
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Compilar y Ejecutar");
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codeTabsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codeTabsPanel)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileBtnActionPerformed

        this.newFile("Nuevo Archivo*", "");        
        
    }//GEN-LAST:event_newFileBtnActionPerformed

    public void newFile(String name, String text) {
        javax.swing.JScrollPane newScrollPane = new javax.swing.JScrollPane();
        newScrollPane.setAutoscrolls(true);
        newScrollPane.setBounds(this.mainScrollPane.getBounds());
        
        javax.swing.JTextPane newPane = new javax.swing.JTextPane();
        newPane.setBounds(this.mainScrollPane.getBounds());
        newPane.setText(text);
        
        newScrollPane.setViewportView(newPane);
        
        codeTabsPanel.addTab(name, newScrollPane);
        
        //System.out.println(this.codeTabsPanel.getTabCount()-1);
        //this.codeTabsPanel.getTabComponentAt(this.codeTabsPanel.getTabCount()-1).requestFocus();
        //System.out.println(this.codeTabsPanel.getSelectedIndex());
        this.codeTabsPanel.setSelectedIndex(this.codeTabsPanel.getTabCount()-1);
        
    }
    
    private void openFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileBtnActionPerformed
        // TODO add your handling code here:
        Scanner entrada = null;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);
        
        try {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();
            File f = new File(ruta);
            entrada = new Scanner(f);
            String texto = "";
            String nombre = f.getName();
            
            while (entrada.hasNext()) {
                texto+=entrada.nextLine()+'\n';
            }
            
            this.newFile(nombre, texto);
            
            System.out.println(texto);
            
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("No se ha seleccionado ningún fichero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
    }//GEN-LAST:event_openFileBtnActionPerformed

    private void saveAsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsBtnActionPerformed
        // Guardar Como

        JFileChooser guardar = new JFileChooser();
        guardar.showSaveDialog(null);
        guardar.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        File archivo = guardar.getSelectedFile();
        

        guardarFichero(this.codePane.getText(), archivo);

    }//GEN-LAST:event_saveAsBtnActionPerformed

    private void closeFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeFileBtnActionPerformed
        if(this.codeTabsPanel.getTabCount() > 1) {
            this.codeTabsPanel.remove(this.codeTabsPanel.getSelectedIndex());
        } else {
            System.out.println("Ya es toda wey xD");   
        }
    }//GEN-LAST:event_closeFileBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void guardarFichero(String cadena, File archivo){

    FileWriter escribir;
    try {

        escribir = new FileWriter(archivo, true);
        escribir.write(cadena);
        escribir.close();

    } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar, ponga nombre al archivo");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar, en la salida");
    }
}
    
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
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem closeFileBtn;
    private javax.swing.JTextPane codePane;
    private javax.swing.JTabbedPane codeTabsPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JScrollPane mainScrollPane;
    private javax.swing.JMenuItem newFileBtn;
    private javax.swing.JMenuItem openFileBtn;
    private javax.swing.JMenuItem saveAsBtn;
    private javax.swing.JMenuItem saveFileBtn;
    // End of variables declaration//GEN-END:variables
}

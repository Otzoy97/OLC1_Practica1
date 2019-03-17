/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import analizador.Scanner;
import analizador.parser;
import java.awt.Desktop;
import org.jfree.chart.ChartUtilities;
/**
 *
 * @author otzoy
 */
public class OLC_Practica extends javax.swing.JFrame {
    
    private String nameFile;
    JFileChooser jchoose = new JFileChooser();
    JFileChooser jsave = new JFileChooser();
    File errores = null;
    //Scanner scan = null;
    ///parser pr = null;
    /**
     * Creates new form OLC_Practica
     */
    public OLC_Practica() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnAnalizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemAbrir = new javax.swing.JMenuItem();
        itemGuardar = new javax.swing.JMenuItem();
        itemGuardarC = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemErrores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        btnAnalizar.setText("Analizar");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnAnalizar, gridBagConstraints);

        jMenu1.setText("Archivo");

        itemAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        itemAbrir.setText("Abrir...");
        itemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(itemAbrir);

        itemGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        itemGuardar.setText("Guardar...");
        itemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(itemGuardar);

        itemGuardarC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemGuardarC.setText("Guardar como...");
        itemGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGuardarCActionPerformed(evt);
            }
        });
        jMenu1.add(itemGuardarC);
        jMenu1.add(jSeparator1);

        itemErrores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        itemErrores.setText("Reporte de Errores");
        itemErrores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemErroresActionPerformed(evt);
            }
        });
        jMenu1.add(itemErrores);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        // TODO add your handling code here:
        Scanner scan = new analizador.Scanner(new BufferedReader(new StringReader(this.jTextArea1.getText())));
        parser pr = new analizador.parser(scan);
        try {
            Scanner.Err +="<h4>Errores sintácticos</h4>";
            pr.parse();
            generarGaleria(pr);
            this.makeErrores(Scanner.Err);
        } catch (Exception ex) {
            showMessageDialog(this, ex.getMessage() + " " + ex.getLocalizedMessage() + " " , "[OLC1] Practica 1 - Parser", JOptionPane.ERROR_MESSAGE);
        } finally {
            System.out.println(Scanner.Err);
            
        }
        Scanner.Err = "";
    }//GEN-LAST:event_btnAnalizarActionPerformed
    /**
     * 
     * @param evt 
     */
    private void itemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAbrirActionPerformed
        // TODO add your handling code here:
        
        jchoose.setDialogTitle("Seleccionar archivo...");
        FileNameExtensionFilter ext = new FileNameExtensionFilter("Archivo de graficado",new String[]{"gu","GU"});
        jchoose.setAcceptAllFileFilterUsed(false);
        jchoose.setFileFilter(ext);
        int resultChoose = jchoose.showOpenDialog(this);
        if (resultChoose== JFileChooser.APPROVE_OPTION) {
            this.nameFile = jchoose.getSelectedFile().getAbsolutePath();
            String nombreArchivo = jchoose.getSelectedFile().getName();
            String linea,output = "";
            try {
                FileReader fileReader = new FileReader(nameFile);
                try (BufferedReader bfReader = new BufferedReader(fileReader)) {
                    while((linea=bfReader.readLine())!=null){
                        output+=linea + "\n";
                    }
                    this.setTitle("[OLC1] - Practica 1 : "+nombreArchivo);
                    this.jTextArea1.setText(output);
                    jchoose.setCurrentDirectory(new File(nameFile));
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Ocurrió un error al leer el archivo.\n"+ex.getMessage(), "[OLC1] - Practica 1", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se cargó el archivo", "[OLC1] - Practica 1", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_itemAbrirActionPerformed
    /**
     * 
     * @param evt 
     */
    private void itemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGuardarActionPerformed
        // TODO add your handling code here:
        if (!this.nameFile.isEmpty()) {
            this.guardar();
        } else {
            this.guardarComo();
        }
    }//GEN-LAST:event_itemGuardarActionPerformed
    /**
     * 
     * @param evt 
     */
    private void itemGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGuardarCActionPerformed
        // TODO add your handling code here:
        this.guardarComo();
    }//GEN-LAST:event_itemGuardarCActionPerformed

    private void itemErroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemErroresActionPerformed
        // TODO add your handling code here:
        try{
            Desktop.getDesktop().open(errores);
        } catch(IOException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage(), "[OLC1] - Practica 1", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_itemErroresActionPerformed
    /**
     * Guarda un nuevo archivo .gu
     */
    private void guardarComo(){
        jsave.setDialogTitle("Guardar como...");
        FileNameExtensionFilter ext = new FileNameExtensionFilter("Archivo de graficado",new String[]{"gu"});
        jsave.setAcceptAllFileFilterUsed(false);
        jsave.setFileFilter(ext);
        int resultSave = jsave.showSaveDialog(this);
        if (resultSave == JFileChooser.APPROVE_OPTION) {
            this.nameFile = jsave.getSelectedFile().getAbsolutePath()+".gu";
            String nombreArchivo = jchoose.getSelectedFile().getName()+".gu";
            FileWriter fileWriter = null;
            BufferedWriter bfWriter = null;
             File fileSave = null;
            try {
                
                fileSave = new File(this.nameFile);
                fileWriter = new FileWriter(fileSave);
                bfWriter = new BufferedWriter(fileWriter);
                bfWriter.write(this.jTextArea1.getText());
                this.setTitle("[OLC1] - Practica 1 : "+nombreArchivo);
                jchoose.setCurrentDirectory(fileSave);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Ocurrió un error al escribir el archivo.\n"+ex.getMessage(), "[OLC1] - Practica 1", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    bfWriter.close();
                    fileWriter.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "[OLC1] - Practica 1", JOptionPane.ERROR_MESSAGE);
                }
            }
        } 
    }
    /**
     * Guarda el archivo en el directorio actual
     */
    private void guardar(){
        if (!this.nameFile.isEmpty()) {
            FileWriter fileWriter = null;
            BufferedWriter bfWriter = null;
             File fileSave = null;
            try {
                fileSave = new File(this.nameFile);
                fileWriter = new FileWriter(fileSave);
                bfWriter = new BufferedWriter(fileWriter);
                bfWriter.write(this.jTextArea1.getText());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Ocurrió un error al escribir el archivo.\n"+ex.getMessage(), "[OLC1] - Practica 1", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    bfWriter.close();
                    fileWriter.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "[OLC1] - Practica 1", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    /**
     * Obtiene un directorio y una lista de imagenes a buscar
     */
    private void generarGaleria(parser pr){
        //Recorrerá la lista de gráficas
        pr.listaGaleria.forEach((e)->{
            //Crea el directorio
            File dir = new File(e.getCarpeta());
            dir.mkdir();
            String absPath = dir.getAbsolutePath();
            //Recorre la lista de gráficas de gráficas
            e.getGraficas().forEach((b)->{
                //Buscará el id en la lista de gráficas
                pr.listaGrafica.forEach((c)->{
                    if (b.equals(c.getId())){
                        try {
                            File jpg =  new File(absPath + "\\"+c.getId()+".jpeg");
                            ChartUtilities.saveChartAsJPEG(jpg, c.graficar(), 800, 600);
                        } catch (IOException ex) {
                            showMessageDialog(this, ex.getMessage()+"aber pvtos", "[OLC1]8888 Practica 1", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });
            });
            
        });
    }
    
    private void makeErrores(String ERR){
            FileWriter fileWriter = null;
            BufferedWriter bfWriter = null;
            try {
                this.errores = new File("ReporteErrores.html");
                fileWriter = new FileWriter(this.errores);
                bfWriter = new BufferedWriter(fileWriter);
                bfWriter.write("<html><head> <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" /> <title>Reporte de errores sintáctico y léxicos</title></head><body>"+ERR+"<body></html>");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Ocurrió un error al escribir el archivo.\n"+ex.getMessage(), "[OLC1] - Practica 1", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    bfWriter.close();
                    fileWriter.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "[OLC1] - Practica 1", JOptionPane.ERROR_MESSAGE);
                }
            }
    }
    
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
            java.util.logging.Logger.getLogger(OLC_Practica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OLC_Practica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OLC_Practica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OLC_Practica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OLC_Practica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JMenuItem itemAbrir;
    private javax.swing.JMenuItem itemErrores;
    private javax.swing.JMenuItem itemGuardar;
    private javax.swing.JMenuItem itemGuardarC;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

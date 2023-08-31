/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import clases.Archivo;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 *
 * @author diego
 */
public class inicioNormal extends javax.swing.JFrame {

    /**
     * Creates new form inicioNormal
     */
    private DefaultTableModel model;
    private TableModel original;
    private String ruta;
    
    public inicioNormal() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Menu Inicial");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cargarbn = new javax.swing.JButton();
        exportarbn = new javax.swing.JButton();
        addrowbn = new javax.swing.JButton();
        deleterowbn = new javax.swing.JButton();
        addcolumnbn = new javax.swing.JButton();
        deletecolumnbn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Menu Usuario");

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        cargarbn.setText("importar");
        cargarbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarbnActionPerformed(evt);
            }
        });

        exportarbn.setText("exportar");
        exportarbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarbnActionPerformed(evt);
            }
        });

        addrowbn.setText("add Row");
        addrowbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrowbnActionPerformed(evt);
            }
        });

        deleterowbn.setText("delete Row");
        deleterowbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleterowbnActionPerformed(evt);
            }
        });

        addcolumnbn.setText("add Column");
        addcolumnbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcolumnbnActionPerformed(evt);
            }
        });

        deletecolumnbn.setText("delete Column");
        deletecolumnbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletecolumnbnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cargarbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exportarbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(addrowbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addcolumnbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(deletecolumnbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleterowbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cargarbn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exportarbn)
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addrowbn)
                            .addComponent(deleterowbn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addcolumnbn)
                            .addComponent(deletecolumnbn))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        Login ventana = new Login();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cargarbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarbnActionPerformed
        
        try {
            JFileChooser escojerArchivo = new JFileChooser();
            int eleccion = escojerArchivo.showOpenDialog(this);
            
            if(eleccion == JFileChooser.APPROVE_OPTION) {
                File archivo = escojerArchivo.getSelectedFile();
                ruta = archivo.getPath();
                Archivo clasearchivo = new Archivo(ruta);
                ArrayList<String[]> datos = new ArrayList<>();
                
                if (archivo.getName().endsWith("csv")) {
                    datos = clasearchivo.leer();
                    model = new DefaultTableModel();
                    model.setColumnIdentifiers(datos.get(0));
                    for (int i = 1; i < datos.size(); i++) {
                        model.addRow(datos.get(i));
                    }
                    jTable1.setModel(model);
                }
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_cargarbnActionPerformed

    private void exportarbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarbnActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) jTable1.getModel();
        int numrows = model.getRowCount();
        int numcols = model.getColumnCount();
        
        String datos = "";
        
        for (int i = 0; i < 10; i++) {
            datos += model.getColumnName(i);
            if (i != (numcols -1)) {
                datos += ",";
            }
        }
        
        datos += "\n";
        
        for (int row = 0; row < numrows; row++) {
            for (int col = 0; col < numcols; col++) {
                Object value = model.getValueAt(row, col);
                if(value != null) {
                    datos += value;
                }
                if(col != (numcols - 1)) {
                    datos += ",";
                }
            }
            datos += "\n";
        }
        Archivo clase = new Archivo(ruta);
        clase.escribir(datos);
    }//GEN-LAST:event_exportarbnActionPerformed

    private void addrowbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrowbnActionPerformed
        model = (DefaultTableModel) jTable1.getModel();
        Object[] newRow = new Object[model.getColumnCount()];
        model.addRow(newRow);
        jTable1.setModel(model);
    }//GEN-LAST:event_addrowbnActionPerformed

    private void deleterowbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleterowbnActionPerformed
        // TODO add your handling code here:
        try {
            int fila = jTable1.getSelectedRow();
            model = (DefaultTableModel) jTable1.getModel();
            model.removeRow(fila);
            jTable1.setModel(model);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_deleterowbnActionPerformed

    private void addcolumnbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcolumnbnActionPerformed
        
        String title = JOptionPane.showInputDialog("Ingrese titulo para la columna");
        model = (DefaultTableModel) jTable1.getModel();
        model.addColumn(title);
    }//GEN-LAST:event_addcolumnbnActionPerformed

    private void deletecolumnbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletecolumnbnActionPerformed
        try {
            int columna = jTable1.getSelectedColumn();
            TableColumn column = jTable1.getColumnModel().getColumn(columna);
            jTable1.removeColumn(column);
            model = (DefaultTableModel) jTable1.getModel();
            jTable1.setModel(model);

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_deletecolumnbnActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcolumnbn;
    private javax.swing.JButton addrowbn;
    private javax.swing.JButton cargarbn;
    private javax.swing.JButton deletecolumnbn;
    private javax.swing.JButton deleterowbn;
    private javax.swing.JButton exportarbn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

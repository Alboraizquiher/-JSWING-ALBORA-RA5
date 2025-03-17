/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package frames;

import java.io.IOException;
import static javaapplication33.Biblio.loadData;
import static javaapplication33.Biblio.saveData;
import javaapplication33.Student;
import static javaapplication33.StudentRegister.students;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario 1
 */
public class SearchStudent extends javax.swing.JInternalFrame {
    
private DefaultListModel<String> listModel;
    
    public SearchStudent() {
        initComponents();
        
             listModel = new DefaultListModel<>();
       
        lista.setModel(listModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        texto = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        listaEstudiantes = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("SEARCH A STUDENT THROW HIS DNI");

        jLabel1.setText("INTRODUCE EL DNI DE LA PERSONA QUE QUIERES BUSCAR");

        texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoActionPerformed(evt);
            }
        });

        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaEstudiantes.setViewportView(lista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscar)
                    .addComponent(jLabel1)
                    .addComponent(listaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscar)
                .addGap(18, 18, 18)
                .addComponent(listaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
       
    String elDni = texto.getText();
    boolean encontrado = false;
    
    listModel.clear(); 
    
    for (Student s : students) {
        if (s.getDni().equals(elDni)) {
            JOptionPane.showMessageDialog(null, "Se encontró: " + s.getName() + " , " + s.getDni());
            listModel.addElement(s.toString()); 
            encontrado = true;
            break; 
        }
    }
    
    if (!encontrado) {
        JOptionPane.showMessageDialog(null, "No existe");
    }
    
    lista.setModel(listModel); 


    }//GEN-LAST:event_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> lista;
    private javax.swing.JScrollPane listaEstudiantes;
    private javax.swing.JTextField texto;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package frames;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import static javaapplication33.Biblio.Write;
import javax.swing.JTextField;
import javaapplication33.Student;
import javaapplication33.Student;
import static javaapplication33.StudentRegister.students;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario 1
 */
public class CreateUser extends javax.swing.JInternalFrame {

    /**
     * Creates new form CreateUser
     */
    public CreateUser() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        lastName = new javax.swing.JLabel();
        apellidos = new javax.swing.JTextField();
        age = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        course = new javax.swing.JLabel();
        curso = new javax.swing.JTextField();
        Dni = new javax.swing.JLabel();
        DocumentoIdentidad = new javax.swing.JTextField();
        Send = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        muestra = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CREATE A NEW USER");
        setPreferredSize(new java.awt.Dimension(616, 422));

        name.setText("INTRODUCE THE NAME");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        lastName.setText("INTRODUCE THE LAST NAME");

        apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidosActionPerformed(evt);
            }
        });

        age.setText("INTRODUCE THE AGE");

        course.setText("INTRODUCE THE COURSE");

        curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursoActionPerformed(evt);
            }
        });

        Dni.setText("INTRODUCE THE DNI");

        DocumentoIdentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocumentoIdentidadActionPerformed(evt);
            }
        });

        Send.setBackground(new java.awt.Color(153, 153, 255));
        Send.setText("SEND");
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });

        muestra.setColumns(20);
        muestra.setRows(5);
        jScrollPane1.setViewportView(muestra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course)
                    .addComponent(curso, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dni)
                    .addComponent(DocumentoIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Send, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(age)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(course)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Dni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DocumentoIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Send)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidosActionPerformed

    private void cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cursoActionPerformed

    private void DocumentoIdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocumentoIdentidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocumentoIdentidadActionPerformed

    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed

        String elnombre = nombre.getText();
        String losapellidos = apellidos.getText();
        int laedad = 0;
        laedad = Integer.parseInt(edad.getText());
        String elDni = DocumentoIdentidad.getText();
        String loscursos = curso.getText();

        Student student1 = new Student(elnombre, losapellidos, laedad, loscursos, elDni);
        students.add(student1);
        String ls = System.getProperty("line.separator");
        String registerStudent = "";
        for (int i = 0; i < students.size(); i++) {
            if (i == 0) {
                registerStudent += (students.get(i).getName() + "; " + students.get(i).getLastName() + "; " + students.get(i).getAge() + "; " + students.get(i).getCourse() + "; " + students.get(i).getDni());
            } else {
                registerStudent += ls + (students.get(i).getName() + "; " + students.get(i).getLastName() + "; " + students.get(i).getAge() + "; " + students.get(i).getCourse() + "; " + students.get(i).getDni());
            }
        }

        try {
            Write(registerStudent);
            System.out.println("");
        } catch (IOException ex) {
            System.err.println(" ERROR ");
            System.out.println("--------------------------------");
        }
        System.out.println("--------------------------------");

        String resultado = "Name: " + elnombre + " ; " + " LastName: " + losapellidos + " ; " + "  Age:  " + laedad + " ; " + " Course: " + loscursos + " ; " + " Dni: " + elDni + " ;";
        JOptionPane.showMessageDialog(null, resultado);
        muestra.setText(resultado);
    }//GEN-LAST:event_SendActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dni;
    private javax.swing.JTextField DocumentoIdentidad;
    private javax.swing.JButton Send;
    private javax.swing.JLabel age;
    private javax.swing.JTextField apellidos;
    private javax.swing.JLabel course;
    private javax.swing.JTextField curso;
    private javax.swing.JTextField edad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastName;
    private javax.swing.JTextArea muestra;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}

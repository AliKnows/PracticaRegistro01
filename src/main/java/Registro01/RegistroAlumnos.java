/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Registro01;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 *
 * @author AIAR
 */
public class RegistroAlumnos extends javax.swing.JFrame {

   
    //objeto de table 
    //2. Y despues el modelo pasarselo a la tabla
    DefaultTableModel modelo=new DefaultTableModel();
    // 1. Lista para guardar a los alumnos y despues pasarlo al 'modelo'
    ArrayList<Alumno> listaAlumnos=new ArrayList<Alumno>();
    
    
    public RegistroAlumnos() {
        initComponents();
        this.setTitle("REGISTRO DE ALUMNOS");
        this.setSize(600,800);
        this.setLocationRelativeTo(null);
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Carrera");
        modelo.addColumn("Código");
        modelo.addColumn("Semestre");
        modelo.addColumn("Facultad");
        modelo.addColumn("Promedio");
        
        refrescarTabla();
    
    }

 
    @SuppressWarnings("unchecked")
    
    
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistroAlum = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPromedioAlum = new javax.swing.JTextField();
        txtNombreAlumno = new javax.swing.JTextField();
        txtCodigoAlum = new javax.swing.JTextField();
        txtSemestreAlum = new javax.swing.JTextField();
        cboCarreraAlum = new javax.swing.JComboBox<>();
        cboFacultadAlum = new javax.swing.JComboBox<>();
        spnEdadAlum = new javax.swing.JSpinner();
        btnBorrarAlum = new javax.swing.JButton();
        btnAgregarAlum = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRegistroAlum.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblRegistroAlum);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 530, 195));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Carrera");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Código");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Semestre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Facultad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Promedio");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Edad");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtPromedioAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPromedioAlumActionPerformed(evt);
            }
        });
        getContentPane().add(txtPromedioAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 140, -1));

        txtNombreAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 140, -1));

        txtCodigoAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoAlumActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 140, -1));

        txtSemestreAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSemestreAlumActionPerformed(evt);
            }
        });
        getContentPane().add(txtSemestreAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 140, -1));

        cboCarreraAlum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Data Science", "CiberSecurity", "Ciencias Computacionales", "Desarrollo Web", "Desarrollo Mobile", "IoT", "Cloud Computing", "Desarrollo de Juegos" }));
        cboCarreraAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCarreraAlumActionPerformed(evt);
            }
        });
        getContentPane().add(cboCarreraAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 140, -1));

        cboFacultadAlum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingenieria", "Humanidades", "Ciencia", "Sociales", " " }));
        getContentPane().add(cboFacultadAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 140, -1));

        spnEdadAlum.setModel(new javax.swing.SpinnerNumberModel(15, 15, 100, 1));
        getContentPane().add(spnEdadAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 140, -1));

        btnBorrarAlum.setText("Borrar");
        getContentPane().add(btnBorrarAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 110, 40));

        btnAgregarAlum.setText("Agregar");
        btnAgregarAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlumActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 110, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPromedioAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPromedioAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPromedioAlumActionPerformed

    private void txtNombreAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAlumnoActionPerformed

    private void txtCodigoAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoAlumActionPerformed

    private void txtSemestreAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemestreAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemestreAlumActionPerformed

    private void cboCarreraAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCarreraAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCarreraAlumActionPerformed

    private void btnAgregarAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlumActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
    }//GEN-LAST:event_btnAgregarAlumActionPerformed

    public void refrescarTabla(){
        
        tblRegistroAlum.setModel(modelo);
    
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
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAlumnos().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlum;
    private javax.swing.JButton btnBorrarAlum;
    private javax.swing.JComboBox<String> cboCarreraAlum;
    private javax.swing.JComboBox<String> cboFacultadAlum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnEdadAlum;
    private javax.swing.JTable tblRegistroAlum;
    private javax.swing.JTextField txtCodigoAlum;
    private javax.swing.JTextField txtNombreAlumno;
    private javax.swing.JTextField txtPromedioAlum;
    private javax.swing.JTextField txtSemestreAlum;
    // End of variables declaration//GEN-END:variables
}

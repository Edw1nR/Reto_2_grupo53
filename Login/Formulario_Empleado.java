/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import MODELO.Base_De_Datos;
import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Win10
 */
public class Formulario_Empleado extends javax.swing.JFrame {
    Base_De_Datos conexion = new Base_De_Datos();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel ContenidoTablaEmpleados;
    private String CORREO;
    private String APELLIDOS;
    private String DOCUMENTO;
    private String TIPODEDOCUEMTNO;
    private String NOMBRE;
    /**
     * Creates new form Formulario_Empleado
     */
    public Formulario_Empleado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LineSep = new javax.swing.JSeparator();
        LineSep1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        LineSep2 = new javax.swing.JSeparator();
        LineSep3 = new javax.swing.JSeparator();
        ACEPTAR = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mision.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(61, 100, 169));
        jLabel2.setText("FORMULARIO DE EMPLEADOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NOMBRE:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("TIPO DE DOCUMENTO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CORREO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("APELLIDO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("NUMERO DE DOCUMENTO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        LineSep.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(LineSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 250, 20));

        LineSep1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(LineSep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 220, 20));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "CEDULA DE CIUDADANIA", "CEDULA DE EXTRANJERIA", "PASAPORTE", "LIBRETA MILITAR" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 180, -1));

        LineSep2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(LineSep2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 180, 20));

        LineSep3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(LineSep3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 290, 20));

        ACEPTAR.setBackground(new java.awt.Color(239, 47, 98));
        ACEPTAR.setForeground(new java.awt.Color(255, 255, 255));
        ACEPTAR.setText("ACEPTAR");
        ACEPTAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ACEPTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACEPTARActionPerformed(evt);
            }
        });
        jPanel1.add(ACEPTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jToggleButton2.setBackground(new java.awt.Color(61, 100, 169));
        jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setText("CANCELAR");
        jToggleButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/912214.png"))); // NOI18N
        jLabel8.setText("UNIVERSIDAD  DE  CALDAS ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 300, 130));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("-");
        jTextField1.setBorder(null);
        jTextField1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 250, 20));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("-");
        jTextField2.setBorder(null);
        jTextField2.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 230, -1));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("-");
        jTextField3.setBorder(null);
        jTextField3.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 230, -1));

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(204, 204, 204));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("-");
        jTextField4.setBorder(null);
        jTextField4.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        jTextField1.setText( "CORREO ELECTRONICO DEL EMPLEADO" );
    }//GEN-LAST:event_jTextField2MouseClicked

    private void ACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACEPTARActionPerformed
        
        String queryCrearEmpleado = "INSERT INTO `empleados`(`nombreEmp`, `apellidos`, `tipoDocumento`, `documento`, `correo`) "
        + "VALUES ('"+ NOMBRE +"','"+APELLIDOS+"','"+TIPODEDOCUEMTNO+"','"+DOCUMENTO+"','"+CORREO+"')";
        JOptionPane.showMessageDialog(this, "NO SE PUDO CREAR EL EMPLEADO", "FORMULARIO DE EMPLEADO", JOptionPane.INFORMATION_MESSAGE);
        try{
        cn = conexion.getCConnection();
        st = cn.createStatement();
        st.executeLargeUpdate(queryCrearEmpleado);
        }catch(SQLException e){
        JOptionPane.showMessageDialog(this, "NO SE PUEDE CREAR EL EMPLEADO", CORREO, JOptionPane.ERROR_MESSAGE);
        
        String nombre = jTextField2.getText();
        String apellidos = jTextField3.getText();
        String TipoDeDocumento = (String)jComboBox1.getSelectedItem();
        String Documento = jTextField4.getText();
        String Correo = jTextField1.getText();
            System.out.println("NOMBRE: " + nombre + " " + apellidos +  ", documento: " + TipoDeDocumento + " "
            + Documento + ", Correo:" + Correo);
            
            if (nombre.isEmpty() || apellidos.isEmpty() || Documento.isEmpty() || Correo.isEmpty()){
                JOptionPane.showMessageDialog(this, "FALTAN CAMPOS POR DILIGENCIAR", "NUEVO EMPLEADO", JOptionPane.WARNING_MESSAGE);
                
            }else{
            
            JOptionPane.showMessageDialog(this, "REGISTRO EXITOSO", "NUEVO EMPLEADO", JOptionPane.INFORMATION_MESSAGE);
            
            
            }
    }   
    }//GEN-LAST:event_ACEPTARActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Empleado().setVisible(true);
            }
        });
        }
    public void actulizarEmpleado(){
    
    ///int idEmp = ACEPTAR.parseInt(txtId.getText());
    String documento =jTextField4.getText();
    String nombre = jTextField2.getText();
    String apellidos = jTextField3.getText();
    String correo = jTextField1.getText();
    if (nombre.isEmpty()){
    
    JOptionPane.showMessageDialog(this, "EL NOMBRE DEL EMPLEADO ES UN CAMPO REQUERIDO", "", JOptionPane.WARNING_MESSAGE);
    
    
    }else if (apellidos.isEmpty()){
    
    JOptionPane.showMessageDialog(this, "EL APELLIDO DEL EMPLEADO ES UN CAMPO REQUERIDO", "", JOptionPane.WARNING_MESSAGE);
    
    } else if (correo.isEmpty()){
    
    JOptionPane.showMessageDialog(this, "EL CORREO DEL EMPLEADO ES UN CAMPO REQUERIDO", "", JOptionPane.WARNING_MESSAGE);
    
    }else{
    //String query = "UPDATE 'empleados' SET 'nombreEmp'-" + nombre ", 'apellido'-" + apellido + ",'correo'-" + correo + "'WHERE 'idEmp' - " + idEmp + ";";
    try {
    
    cn = conexion.getCConnection();
    st = cn.createStatement();
    //st.executeUpdate(query);
    JOptionPane.showInternalInputDialog(this, "SE HAN ACTUALIZADO LOS DATOS DEL EMPLEADO.", "", JOptionPane.INFORMATION_MESSAGE);
    
    }catch (SQLException e){
        JOptionPane.showMessageDialog(this, "NO FUE POSIBLE CTUALIZAR LOS DATOS DEL EMPLEADO.", "", JOptionPane.ERROR_MESSAGE);
        }
        this.dispose();
    }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ACEPTAR;
    private javax.swing.JSeparator LineSep;
    private javax.swing.JSeparator LineSep1;
    private javax.swing.JSeparator LineSep2;
    private javax.swing.JSeparator LineSep3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}

package Login;

import MODELO.Base_De_Datos;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TABLA extends javax.swing.JFrame {

    Base_De_Datos conexion = new Base_De_Datos();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel ContenidoTablaEmpleados;

    /**
     * ESTO ES MUY DIFICIL :[
     */
    public TABLA() {
        initComponents();
        ListaDeEmpleados();
    }

    private void ListaDeEmpleados() {
        
        String filtroBusqueda = txtSearch.getText();
        if(filtroBusqueda.isEmpty()){

        String queryConsulta = "SELECT * FROM empleados";

        try {
            cn = conexion.getCConnection();
            st = cn.createStatement();
            rs = st.executeQuery(queryConsulta);
            Object[] empleados = new Object[6];
            ContenidoTablaEmpleados = (DefaultTableModel) tblEmpledos.getModel();
            while (rs.next()) {
                empleados[0] = rs.getInt("idEmp");
                empleados[1] = rs.getString("nombreEmp");
                empleados[2] = rs.getString("apellidos");
                empleados[3] = rs.getString("tipoDocumento");
                empleados[4] = rs.getString("documento");
                empleados[5] = rs.getString("correo");
                ContenidoTablaEmpleados.addRow(empleados);
                System.out.println("id : " + empleados[0] + ", nombre: " + empleados[1] + " " + empleados[2]
                        + ", documento: " + empleados[3] + " " + empleados[4] + ", correo: "
                        + empleados[5]);
                tblEmpledos.setModel(ContenidoTablaEmpleados);
                
            }

        } catch (SQLException e) {
            System.out.println("ERROR");
        }
                
        }else{
                
            String queryConsulta = "SELECT * FROM empleados WHERE nombreEmp LIKE '%"+filtroBusqueda+"%' OR apellidos LIKE '%"+filtroBusqueda+"%'";
                    try {
            cn = conexion.getCConnection();
            st = cn.createStatement();
            rs = st.executeQuery(queryConsulta);
            Object[] empleados = new Object[6];
            ContenidoTablaEmpleados = (DefaultTableModel) tblEmpledos.getModel();
            while (rs.next()) {
                empleados[0] = rs.getInt("idEmp");
                empleados[1] = rs.getString("nombreEmp");
                empleados[2] = rs.getString("apellidos");
                empleados[3] = rs.getString("tipoDocumento");
                empleados[4] = rs.getString("documento");
                empleados[5] = rs.getString("correo");
                ContenidoTablaEmpleados.addRow(empleados);
                System.out.println("id : " + empleados[0] + ", nombre: " + empleados[1] + " " + empleados[2]
                        + ", documento: " + empleados[3] + " " + empleados[4] + ", correo: "
                        + empleados[5]);
                tblEmpledos.setModel(ContenidoTablaEmpleados);
                
            }

        } catch (SQLException e) {
            System.out.println("ERROR");
        }
        }
    }

    private void BorrarDatosTabla() {

        for (int i = 0; i < tblEmpledos.getRowCount(); i++) {

            ContenidoTablaEmpleados.removeRow(i);

            i -= 1;

        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpledos = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setBackground(new java.awt.Color(58, 100, 174));
        jButton1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/retrato.png"))); // NOI18N
        jButton1.setText("AGREGAR EMPLEADO");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblEmpledos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO(S)", "TIPO DOCUMENTO", "DOCUMENTO", "CORREO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpledos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpledosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpledos);

        txtSearch.setBackground(new java.awt.Color(255, 255, 255));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BUSCAR");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("EMPLEADOS", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Formulario_Empleado G1 = new Formulario_Empleado();
        G1.setVisible(true);
        BorrarDatosTabla();
        ListaDeEmpleados();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //NO PROGRAMADO
    }//GEN-LAST:event_jButton1MouseClicked

    private void tblEmpledosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpledosMouseClicked
    int row = tblEmpledos.getSelectedRow();
        System.out.println("FILA SELECCIONADA" + row);
        if  (row < 0){
            JOptionPane.showInputDialog(this, "SELECCIONE UN EMPLEADO", "", JOptionPane.WARNING_MESSAGE);
        }else{
        
        int id = Integer.parseInt(tblEmpledos.getValueAt(row, 0).toString());
        String nombreEmp = (String) tblEmpledos.getValueAt(row, 1);
        String apellido = (String) tblEmpledos.getValueAt(row, 2);
        String TipoDeDocumento = (String) tblEmpledos.getValueAt(row, 3);
        String Documento = (String) tblEmpledos.getValueAt(row, 4);
        String Correo = (String) tblEmpledos.getValueAt(row, 5);
        System.out.println("Id: " + id + ", EMPLEADO: " + nombreEmp + " " + apellido + ", TIPO DE DOCUMENTO: "+ TipoDeDocumento + ", NUMERO: " + Documento + ", CORREO: " + Correo);
        ShowUserForm showUserForm = new ShowUserForm(this, true);
        showUserForm.recibeDatos(id, nombreEmp, apellido, Documento, Correo);
        showUserForm.setVisible(true);
        
        BorrarDatosTabla();
        ListaDeEmpleados();
        
        
      
        }

    }//GEN-LAST:event_tblEmpledosMouseClicked

    
    
    public void bucarPer (String Buscar){

    }
    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
    //
    }//GEN-LAST:event_txtSearchActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        BorrarDatosTabla();
        ListaDeEmpleados();
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TABLA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tblEmpledos;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

}

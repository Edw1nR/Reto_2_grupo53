/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import MODELO.Base_De_Datos;
import java.awt.Color;
public class reto extends javax.swing.JFrame {

    int xMouse, yMouse;

    public reto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        mouse = new javax.swing.JPanel();
        mouse1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ICONO1 = new javax.swing.JLabel();
        USUARIO = new javax.swing.JLabel();
        ingName = new javax.swing.JTextField();
        LineSep = new javax.swing.JSeparator();
        ICON = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        CONTRA = new javax.swing.JPasswordField();
        LineSep2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BARRA = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BG.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BGMouseDragged(evt);
            }
        });
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mouse.setBackground(new java.awt.Color(255, 255, 255));
        mouse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mouseMousePressed(evt);
            }
        });

        mouse1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mouse1.setForeground(new java.awt.Color(0, 0, 0));
        mouse1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mouse1.setText("X");
        mouse1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout mouseLayout = new javax.swing.GroupLayout(mouse);
        mouse.setLayout(mouseLayout);
        mouseLayout.setHorizontalGroup(
            mouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
            .addGroup(mouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mouseLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mouse1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        mouseLayout.setVerticalGroup(
            mouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
            .addGroup(mouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mouseLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mouse1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        BG.add(mouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FONDO.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 400, 360));
        jLabel1.getAccessibleContext().setAccessibleName("");

        ICONO1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ICONO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon.png"))); // NOI18N
        ICONO1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BG.add(ICONO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 40));

        USUARIO.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        USUARIO.setForeground(new java.awt.Color(0, 0, 0));
        USUARIO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        USUARIO.setText("USUARIO: ");
        USUARIO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BG.add(USUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 110, -1));

        ingName.setBackground(new java.awt.Color(255, 255, 255));
        ingName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ingName.setForeground(new java.awt.Color(204, 204, 204));
        ingName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingName.setText("INGRESE SU NOMBRE DE USUARIO");
        ingName.setBorder(null);
        ingName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingNameMousePressed(evt);
            }
        });
        ingName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingNameActionPerformed(evt);
            }
        });
        BG.add(ingName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 220, -1));

        LineSep.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BG.add(LineSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 260, 20));

        ICON.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/candado.png"))); // NOI18N
        ICON.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BG.add(ICON, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, 40));

        password.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 0));
        password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        password.setText("CONTRASEÑA:");
        password.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BG.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 110, -1));

        CONTRA.setBackground(new java.awt.Color(255, 255, 255));
        CONTRA.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CONTRA.setForeground(new java.awt.Color(204, 204, 204));
        CONTRA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CONTRA.setText("***********");
        CONTRA.setToolTipText("");
        CONTRA.setBorder(null);
        CONTRA.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CONTRA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CONTRAMousePressed(evt);
            }
        });
        BG.add(CONTRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 180, -1));

        LineSep2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BG.add(LineSep2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("INGRESAR");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        BG.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 110, -1));

        BARRA.setBackground(new java.awt.Color(255, 255, 255));
        BARRA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BARRAMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout BARRALayout = new javax.swing.GroupLayout(BARRA);
        BARRA.setLayout(BARRALayout);
        BARRALayout.setHorizontalGroup(
            BARRALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        BARRALayout.setVerticalGroup(
            BARRALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        BG.add(BARRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingNameActionPerformed

    private void mouseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_mouseMousePressed

    private void BGMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BGMouseDragged

    }//GEN-LAST:event_BGMouseDragged

    private void mouseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_mouseMouseClicked

    private void mouseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMouseEntered
        mouse.setBackground(Color.red);
    }//GEN-LAST:event_mouseMouseEntered

    private void mouseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMouseExited
        mouse.setBackground(Color.white);
    }//GEN-LAST:event_mouseMouseExited

    private void ingNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingNameMousePressed
        if (ingName.getText().equals("INGRESE SU NOMBRE DE USUARIO:")) {
            ingName.setText("");
        }
        ingName.setForeground(Color.BLACK);

        if (String.valueOf(CONTRA.getPassword()).isEmpty());
        {
            CONTRA.setText("***********");
            CONTRA.setForeground(Color.gray);
        }
    }//GEN-LAST:event_ingNameMousePressed

    private void CONTRAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CONTRAMousePressed
        if (String.valueOf(CONTRA.getPassword()).equals("***********")) {
            CONTRA.setText("");
            CONTRA.setForeground(Color.BLACK);
        }

        if (ingName.getText().isEmpty()) {
            ingName.setText("INGRESE SU NOMBRE DE USUARIO:");
            ingName.setForeground(Color.gray);
        }

    }//GEN-LAST:event_CONTRAMousePressed

    private void BARRAMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BARRAMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BARRAMouseDragged

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        String Usuario = "MisionTic";
        String Contraseña = "Ciclo2";
        String User;
        String Pass;
        User = ingName.getText();
        Pass = CONTRA.getText();
        if (ingName.getText().equals(Usuario)&&CONTRA.getText().equals(Contraseña))
        
        {
        TABLA e2 = new TABLA();
        e2.setVisible(true);
        dispose();
        }
        
        else
        {
        Clave_Incorrecta e = new Clave_Incorrecta();
        e.setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_jPanel3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
    Base_De_Datos conexion = new Base_De_Datos(); 
    conexion.getCConnection();
        java.awt.EventQueue.invokeLater(() -> {
            new reto().setVisible(true);
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BARRA;
    private javax.swing.JPanel BG;
    private javax.swing.JPasswordField CONTRA;
    private javax.swing.JLabel ICON;
    private javax.swing.JLabel ICONO1;
    private javax.swing.JSeparator LineSep;
    private javax.swing.JSeparator LineSep2;
    private javax.swing.JLabel USUARIO;
    private javax.swing.JTextField ingName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel mouse;
    private javax.swing.JLabel mouse1;
    private javax.swing.JLabel password;
    // End of variables declaration//GEN-END:variables

}

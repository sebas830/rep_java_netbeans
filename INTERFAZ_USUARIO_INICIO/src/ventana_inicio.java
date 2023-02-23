
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class ventana_inicio extends javax.swing.JFrame {
    
    int xmouse,ymouse;
    
    
    public ventana_inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        ImageIcon imagen=new ImageIcon (getClass ().getResource("/imagenes/usuario-DE-PERFIL.png"));
        Icon icono_usuario=new ImageIcon(imagen.getImage().getScaledInstance(IMAGEN.getWidth(),IMAGEN.getHeight(),Image.SCALE_DEFAULT));
        IMAGEN.setIcon(icono_usuario);
        
        
        ImageIcon imagen1=new ImageIcon (getClass ().getResource("/imagenes/steam.png"));
        Icon icono_steam=new ImageIcon(imagen1.getImage().getScaledInstance(logo.getWidth(),logo.getHeight(),Image.SCALE_DEFAULT));
        logo.setIcon(icono_steam);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        IMAGEN = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CORREO_USUARIO = new javax.swing.JTextField();
        CONTRASEÑA_USUARIO = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        STEAMLOGO = new javax.swing.JLabel();
        INGRESAR = new javax.swing.JPanel();
        ingresar_texto = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        SALIR = new javax.swing.JPanel();
        salir_texto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INICIO DE SESIÓN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 380, -1));

        IMAGEN.setBackground(new java.awt.Color(255, 153, 51));
        jPanel2.add(IMAGEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 180, 140));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/correo.png"))); // NOI18N
        jLabel3.setText("USUARIO:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        CORREO_USUARIO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CORREO_USUARIO.setForeground(new java.awt.Color(153, 153, 153));
        CORREO_USUARIO.setText("INGRESE SU USUARIO");
        CORREO_USUARIO.setToolTipText("");
        CORREO_USUARIO.setBorder(null);
        CORREO_USUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CORREO_USUARIOActionPerformed(evt);
            }
        });
        jPanel2.add(CORREO_USUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 360, -1));

        CONTRASEÑA_USUARIO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CONTRASEÑA_USUARIO.setForeground(new java.awt.Color(153, 153, 153));
        CONTRASEÑA_USUARIO.setText("CONTRASEÑA");
        CONTRASEÑA_USUARIO.setBorder(null);
        jPanel2.add(CONTRASEÑA_USUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 359, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-con-llave.png"))); // NOI18N
        jLabel4.setText("CONTRASEÑA:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setText("jLabel5");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 180, 140));

        STEAMLOGO.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        STEAMLOGO.setForeground(new java.awt.Color(255, 255, 255));
        STEAMLOGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        STEAMLOGO.setText("STEAM");
        jPanel1.add(STEAMLOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 311, 217, 60));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 310, 550));

        INGRESAR.setBackground(new java.awt.Color(0, 0, 0));

        ingresar_texto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ingresar_texto.setForeground(new java.awt.Color(255, 255, 255));
        ingresar_texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ingresar_texto.setText("INGRESAR");
        ingresar_texto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresar_texto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresar_textoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresar_textoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout INGRESARLayout = new javax.swing.GroupLayout(INGRESAR);
        INGRESAR.setLayout(INGRESARLayout);
        INGRESARLayout.setHorizontalGroup(
            INGRESARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ingresar_texto, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        INGRESARLayout.setVerticalGroup(
            INGRESARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, INGRESARLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ingresar_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(INGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 190, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        SALIR.setBackground(new java.awt.Color(255, 255, 255));

        salir_texto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        salir_texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salir_texto.setText("X");
        salir_texto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir_texto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salir_textoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salir_textoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salir_textoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SALIRLayout = new javax.swing.GroupLayout(SALIR);
        SALIR.setLayout(SALIRLayout);
        SALIRLayout.setHorizontalGroup(
            SALIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SALIRLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salir_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        SALIRLayout.setVerticalGroup(
            SALIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SALIRLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salir_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(SALIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 636, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SALIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 40));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 360, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 360, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CORREO_USUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CORREO_USUARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CORREO_USUARIOActionPerformed

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
xmouse = evt.getX ();
ymouse = evt.getY ();

    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
  
        int x =evt.getXOnScreen();
        int y =evt.getYOnScreen();
        this.setLocation(x-xmouse,y-ymouse);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void salir_textoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir_textoMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salir_textoMouseClicked

    private void salir_textoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir_textoMouseEntered
        SALIR.setBackground(new Color( 51, 51, 51 ));
        salir_texto.setForeground(Color.white);
    }//GEN-LAST:event_salir_textoMouseEntered

    private void salir_textoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir_textoMouseExited
        SALIR.setBackground(Color.white);
        salir_texto.setForeground(Color.black);
    }//GEN-LAST:event_salir_textoMouseExited

    private void ingresar_textoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresar_textoMouseEntered
        INGRESAR.setBackground(new Color( 51, 51, 51 ));
    }//GEN-LAST:event_ingresar_textoMouseEntered

    private void ingresar_textoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresar_textoMouseExited
        INGRESAR.setBackground(Color.black);
    }//GEN-LAST:event_ingresar_textoMouseExited

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
            java.util.logging.Logger.getLogger(ventana_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CONTRASEÑA_USUARIO;
    private javax.swing.JTextField CORREO_USUARIO;
    private javax.swing.JLabel IMAGEN;
    private javax.swing.JPanel INGRESAR;
    private javax.swing.JPanel SALIR;
    private javax.swing.JLabel STEAMLOGO;
    private javax.swing.JLabel ingresar_texto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel salir_texto;
    // End of variables declaration//GEN-END:variables
}

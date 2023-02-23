/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author SEBASTIAN
 */
public class TIENDITA extends javax.swing.JFrame {

    /**
     * Creates new form TIENDITA
     */
    public TIENDITA() {
        initComponents();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
        
        ImageIcon imagen=new ImageIcon (getClass ().getResource("/imagen/HOLIWIS.jpg"));
        Icon icono=new ImageIcon(imagen.getImage().getScaledInstance(ibimagen.getWidth(),ibimagen.getHeight(),Image.SCALE_DEFAULT));
        ibimagen.setIcon(icono);
        this.repaint();
    }
    //icono Jframe
    @Override
    public Image getIconImage (){
    Image retValue= Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagen/tienda.png"));
    return retValue;
}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        siguiente = new javax.swing.JButton();
        limpiar_campos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ibimagen = new javax.swing.JLabel();
        dato1 = new javax.swing.JTextField();
        dato2 = new javax.swing.JTextField();
        dato3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIENDA LA FLACOFOBIA");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(186, 247, 246));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel2.setText("Por favor digite su peso:");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel3.setText("Por favor ingrese el valor del produto :");

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));

        siguiente.setText("SIGUIENTE");
        siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siguienteMouseClicked(evt);
            }
        });
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        limpiar_campos.setText("LIMPIAR LOS CAMPOS");
        limpiar_campos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_camposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(limpiar_campos, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(limpiar_campos, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel4.setText("Por favor digite el dinero con el que piensa pagar :");

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 153, 153)));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("TIENDA LA FLACOFOBIA");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel5)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        dato1.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                dato1HierarchyChanged(evt);
            }
        });
        dato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dato1ActionPerformed(evt);
            }
        });
        dato1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dato1KeyTyped(evt);
            }
        });

        dato2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dato2ActionPerformed(evt);
            }
        });
        dato2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dato2KeyTyped(evt);
            }
        });

        dato3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dato3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(dato1)
                    .addComponent(dato2, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                    .addComponent(dato3, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ibimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(ibimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dato1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dato2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dato3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteMouseClicked
        recibo siguiente=new recibo();

        double total=0,devuelta=0,Dcliente;
        int peso,Vproducto;

        peso=Integer.parseInt(dato1.getText());
        Vproducto=Integer.parseInt(dato2.getText());
        Dcliente=Double.parseDouble(dato3.getText());

        String info1=dato1.getText();

        if (Vproducto>Dcliente) {
            siguiente.setVisible(false);
            JOptionPane.showMessageDialog(null, "el producto sobrepasa tú presupuesto");
        } else if (Vproducto<=Dcliente) {

            if (peso <= 0) {
                recibo.contextura1.setText("USTED TIENE UN PESO DE : "+info1);
                recibo.contextura2.setText("ESTE PESO NO TIENE DESCUENTO");
                total = Vproducto;        devuelta=Dcliente-Vproducto;

            } else if (1 < peso && peso < 30) {
                recibo.contextura1.setText("USTED TIENE UN PESO DE : "+info1);
                recibo.contextura2.setText("USTED ES PESO PALOMA, POR LO TANTO TIENES UN 15% DE DESCUENTO");
                total=Vproducto-(Vproducto*0.15);      devuelta=Dcliente-total;

            } else if (30 < peso && peso < 60) {
                recibo.contextura1.setText("USTED TIENE UN PESO DE : "+info1);
                recibo.contextura2.setText("USTED ES FLACO, POR LO TANTO TIENES UN 25% DE DESCUENTO");
                total=Vproducto-(Vproducto*0.25);      devuelta=Dcliente-total;

            } else if (60 < peso && peso < 85) {
                recibo.contextura1.setText("USTED TIENE UN PESO DE : "+info1);
                recibo.contextura2.setText("USTED ES GORDITO, POR LO TANTO TIENES UN 38% DE DESCUENTO");
                total=Vproducto-(Vproducto*0.38);      devuelta=Dcliente-total;

            } else if (85 < peso && peso < 100) {
                recibo.contextura1.setText("USTED TIENE UN PESO DE : "+info1);
                recibo.contextura2.setText("USTED ES SOPITO, POR LO TANTO TIENES UN 53% DE DESCUENTO");
                total=Vproducto-(Vproducto*0.53);      devuelta=Dcliente-total;

            } else if (peso >= 100) {
                recibo.contextura1.setText("USTED TIENE UN PESO DE : "+info1);
                recibo.contextura2.setText("USTED ES COMELON, POR LO TANTO TIENES UN 67% DE DESCUENTO");
                total=Vproducto-(Vproducto*0.67);      devuelta=Dcliente-total;
            }
            recibo.total1.setText("EL PRECIO A PAGAR ES DE : "+total);
            recibo.devuelta.setText("SU DEVUELTA ES DE : "+devuelta);
            siguiente.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_siguienteMouseClicked

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        // TODO add your handling code here:
        if (dato1.getText().isEmpty() || dato2.getText().isEmpty() || dato3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "por favor llene todas las casillas");
        }

    }//GEN-LAST:event_siguienteActionPerformed

    private void limpiar_camposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_camposActionPerformed
        // TODO add your handling code here:
        dato1.setText("");
        dato2.setText("");
        dato3.setText("");
    }//GEN-LAST:event_limpiar_camposActionPerformed

    private void dato1HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_dato1HierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_dato1HierarchyChanged

    private void dato1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dato1KeyTyped
        char validar=evt.getKeyChar();
        if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "por favor solo digite datos de tipo numerico");
        }
    }//GEN-LAST:event_dato1KeyTyped

    private void dato2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dato2KeyTyped
        char validar=evt.getKeyChar();
        if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "por favor solo digite datos de tipo numerico");
        }
    }//GEN-LAST:event_dato2KeyTyped

    private void dato3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dato3KeyTyped
        char validar=evt.getKeyChar();
        if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "por favor solo digite datos de tipo numerico");
        }
    }//GEN-LAST:event_dato3KeyTyped

    private void dato2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dato2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dato2ActionPerformed

    private void dato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dato1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dato1ActionPerformed

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
            java.util.logging.Logger.getLogger(TIENDITA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIENDITA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIENDITA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIENDITA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIENDITA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dato1;
    private javax.swing.JTextField dato2;
    private javax.swing.JTextField dato3;
    private javax.swing.JLabel ibimagen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton limpiar_campos;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}

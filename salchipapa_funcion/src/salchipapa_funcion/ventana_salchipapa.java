package salchipapa_funcion;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ventana_salchipapa extends javax.swing.JFrame {
    static int op, cantidad1, pagocliente1, ventafinal, ventadia, cantidadsencilla, pagocliente2, cantidad2, cantidadespecial, cantidadespecialfinal, cantidadsencillafinal;
    static int papas = 35, salchichas = 25,rep=1;

    public ventana_salchipapa() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        ImageIcon imagen=new ImageIcon (getClass ().getResource("/imagen/descarga.jfif"));
        Icon icono=new ImageIcon(imagen.getImage().getScaledInstance(ibimagen.getWidth(),ibimagen.getHeight(),Image.SCALE_DEFAULT));
        ibimagen.setIcon(icono);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        factura = new javax.swing.JButton();
        limpiar_campos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        factura_dia = new javax.swing.JButton();
        ibimagen = new javax.swing.JLabel();
        sencilla = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        especial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        factura.setText("FACTURA");
        factura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facturaMouseClicked(evt);
            }
        });
        factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturaActionPerformed(evt);
            }
        });

        limpiar_campos.setText("LIMPIAR CAMPOS");
        limpiar_campos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_camposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(factura, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(limpiar_campos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(640, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(factura, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(limpiar_campos, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SALCHIPAPAS  EL  CORRAL ");

        factura_dia.setText("MAVIMIENTO DEL DIA");
        factura_dia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                factura_diaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(factura_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(factura_dia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        sencilla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sencilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sencillaActionPerformed(evt);
            }
        });
        sencilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sencillaKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CANTIDAD DE SALCHIPAPAS SENCILLAS :");

        especial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        especial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                especialKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CANTIDAD DE SALCHIPAPAS ESPECIALES :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(especial)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sencilla, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ibimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ibimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sencilla, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(especial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void especialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_especialKeyTyped
        char validar=evt.getKeyChar();
        if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "por favor solo digite datos de tipo numerico");  
        }
    }//GEN-LAST:event_especialKeyTyped

    private void sencillaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sencillaKeyTyped
        char validar=evt.getKeyChar();
        if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "por favor solo digite datos de tipo numerico");
        }
    }//GEN-LAST:event_sencillaKeyTyped

    private void sencillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sencillaActionPerformed

    }//GEN-LAST:event_sencillaActionPerformed

    private void facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturaActionPerformed

    cantidad1=Integer.parseInt(sencilla.getText());
    
    if (cantidad1 != 0)
    {
        pagocliente1=0;
        pagocliente1 = pagocliente1 + (cantidad1 * 5000);
        ventafinal = ventafinal + pagocliente1;

        if (ventafinal < 100001 && cantidad1 <= papas && cantidad1 <= salchichas)
        {
            cantidadsencilla = cantidadsencilla + cantidad1;
            cantidadsencillafinal = cantidadsencillafinal + cantidadsencilla;
            ventadia = ventadia + pagocliente1;
            papas=papas-cantidad2;
            salchichas=salchichas-cantidad2;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "\"No se pudo realizar su compra, no tenemos los ingredientes necesarios\"");
            ventafinal = ventafinal - pagocliente1;
            ventafinal = ventafinal - pagocliente2;
        }
    }

        cantidad2=Integer.parseInt(especial.getText());
        if (cantidad2 != 0 )
        {
            pagocliente2=0;
         
            pagocliente2=pagocliente2+(cantidad2*8000);
            ventafinal=ventafinal+pagocliente2;

            if (ventafinal < 100001 && cantidad2<=papas && cantidad2 <= salchichas)
            {
                cantidadespecial=cantidadespecial+cantidad2;
                cantidadespecialfinal=cantidadespecialfinal+cantidadespecial;
                ventadia=ventadia+pagocliente2;
                papas=papas-(cantidad2*3);
                salchichas=salchichas-(cantidad2*2);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "\"No se pudo realizar su compra, no tenemos los ingredientes necesarios\"");
                ventafinal = ventafinal - pagocliente1;
                ventafinal = ventafinal - pagocliente2;
            }
        }
    }//GEN-LAST:event_facturaActionPerformed

    private void facturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturaMouseClicked
    recibo aceptar=new recibo();
    aceptar.setVisible(true);
    this.dispose(); 
    recibo.salchipapas_sencillas.setText("Cantidad de salchipapas sencillas = "+cantidadsencilla);
    recibo.salchipapas_especial.setText("Cantidad de salchipapas especiales = "+cantidadespecial);
    recibo.total_pagar.setText("Cantidad de salchipapas especiales = "+ventadia);
    cantidadsencilla = 0;
    cantidadespecial = 0;
    ventadia = 0;

    }//GEN-LAST:event_facturaMouseClicked

    private void limpiar_camposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_camposActionPerformed
        sencilla.setText("");
        especial.setText("");       
    }//GEN-LAST:event_limpiar_camposActionPerformed

    private void factura_diaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_factura_diaMouseClicked
     movimiento_dia aceptar=new movimiento_dia();
    aceptar.setVisible(true);
    this.dispose();
    movimiento_dia.venta_dia.setText("La venta del dia fue = "+ventafinal);
    movimiento_dia.sencillas_finales.setText("El total de salchipapas sencillas vendidas el dia de hoy es = "+cantidadsencillafinal);
    movimiento_dia.especiales_finales.setText("El total de salchipapas especial vendidas el dia de hoy es = "+cantidadespecialfinal);
    movimiento_dia.papas_finales.setText("Papas que quedaron en la bodega = "+papas);
    movimiento_dia.salchichas_finales.setText("Salchichas que quedaron en la bodega = "+salchichas);
    
    }//GEN-LAST:event_factura_diaMouseClicked

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_salchipapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new ventana_salchipapa().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField especial;
    private javax.swing.JButton factura;
    private javax.swing.JButton factura_dia;
    private javax.swing.JLabel ibimagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton limpiar_campos;
    private javax.swing.JTextField sencilla;
    // End of variables declaration//GEN-END:variables
}

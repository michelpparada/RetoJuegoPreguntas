package vistas;

import controlador.Juego;

public class FormValidarRespuesta extends javax.swing.JFrame {

    private Juego miJuego;
    private int respuesta;

    public FormValidarRespuesta(int idRespuesta) {
        initComponents();
        if (idRespuesta != 5) {
            miJuego = miJuego.ObtenerMiJuego();
            this.descripcionValidacionRespuesta.setText(validarPregunta(idRespuesta));
            validarContinuarJuego();
            this.miJuego.getAcumulado();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonSiguientePregunta = new javax.swing.JButton();
        valorPremioAcumulado = new javax.swing.JTextField();
        descripcionPremioAcumulado = new javax.swing.JLabel();
        descripcionValidacionRespuesta = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        tituloValidacionRespuesta = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 255));

        botonSiguientePregunta.setBackground(new java.awt.Color(102, 102, 255));
        botonSiguientePregunta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonSiguientePregunta.setForeground(new java.awt.Color(51, 0, 153));
        botonSiguientePregunta.setText("Siguiente ");
        botonSiguientePregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguientePreguntaActionPerformed(evt);
            }
        });

        valorPremioAcumulado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        valorPremioAcumulado.setForeground(new java.awt.Color(204, 204, 204));
        valorPremioAcumulado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorPremioAcumuladoActionPerformed(evt);
            }
        });

        descripcionPremioAcumulado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descripcionPremioAcumulado.setForeground(new java.awt.Color(51, 0, 153));
        descripcionPremioAcumulado.setText("Premio acumulado: $");

        descripcionValidacionRespuesta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descripcionValidacionRespuesta.setForeground(new java.awt.Color(51, 0, 153));
        descripcionValidacionRespuesta.setText("La respuesta seleccionada es");

        botonSalir.setBackground(new java.awt.Color(204, 204, 204));
        botonSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(51, 51, 51));
        botonSalir.setText("x");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        tituloValidacionRespuesta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloValidacionRespuesta.setForeground(new java.awt.Color(51, 0, 153));
        tituloValidacionRespuesta.setText("Validación de respuesta");

        jTextField1.setBackground(new java.awt.Color(153, 153, 255));
        jTextField1.setForeground(new java.awt.Color(51, 0, 153));
        jTextField1.setText("CORRECTA O INCORRECTA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(tituloValidacionRespuesta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(descripcionValidacionRespuesta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(descripcionPremioAcumulado)
                        .addGap(43, 43, 43)
                        .addComponent(valorPremioAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonSiguientePregunta)
                        .addGap(190, 190, 190))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonSalir)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloValidacionRespuesta)))
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcionValidacionRespuesta)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorPremioAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcionPremioAcumulado))
                .addGap(37, 37, 37)
                .addComponent(botonSiguientePregunta)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSiguientePreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguientePreguntaActionPerformed
        FormJuego pantallaJuego = new FormJuego();
        pantallaJuego.setVisible(true);
        dispose();
        this.miJuego.vaciarRespuestas();
    }//GEN-LAST:event_botonSiguientePreguntaActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.miJuego.vaciarRespuestas();
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void valorPremioAcumuladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorPremioAcumuladoActionPerformed
        this.miJuego.getAcumulado();
    }//GEN-LAST:event_valorPremioAcumuladoActionPerformed

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
            java.util.logging.Logger.getLogger(FormValidarRespuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormValidarRespuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormValidarRespuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormValidarRespuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormValidarRespuesta(5).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonSiguientePregunta;
    private javax.swing.JLabel descripcionPremioAcumulado;
    private javax.swing.JLabel descripcionValidacionRespuesta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel tituloValidacionRespuesta;
    private javax.swing.JTextField valorPremioAcumulado;
    // End of variables declaration//GEN-END:variables

    private String validarPregunta(int idRespuesta) {
        this.respuesta = this.miJuego.validarPregunta(idRespuesta);
        return this.respuesta == 1 ? "Verdadero" : "Falso";
    }

    private void validarContinuarJuego() {
        if (this.respuesta == 0) {
            this.descripcionPremioAcumulado.setVisible(false);
            this.descripcionValidacionRespuesta.setText("Fin del Juego");
        }
    }
}

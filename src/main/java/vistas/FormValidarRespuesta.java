package vistas;

import controlador.Juego;
import javax.swing.JOptionPane;

public class FormValidarRespuesta extends javax.swing.JFrame {

    private Juego miJuego;
    private int respuesta_correcta;

    public FormValidarRespuesta(String respuesta) {
        initComponents();
        
            miJuego = miJuego.ObtenerMiJuego();
            this.juegoTerminado.setVisible(false);
            this.irInicio.setVisible(false);
            this.IsRespuesta.setText(validarRespuesta(respuesta));
            validarContinuarJuego();
            //this.miJuego.getAcumulado();
            //this.valorPremioAcumulado.setText(String.valueOf(miJuego.getAcumulado()));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonSiguientePregunta = new javax.swing.JButton();
        descripcionValidacionRespuesta = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        tituloValidacionRespuesta = new javax.swing.JLabel();
        IsRespuesta = new javax.swing.JTextField();
        irInicio = new javax.swing.JButton();
        juegoTerminado = new javax.swing.JLabel();

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

        tituloValidacionRespuesta.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        tituloValidacionRespuesta.setForeground(new java.awt.Color(51, 0, 153));
        tituloValidacionRespuesta.setText("QUIEN QUIERE SER MILLONARIO");

        IsRespuesta.setBackground(new java.awt.Color(153, 153, 255));
        IsRespuesta.setForeground(new java.awt.Color(51, 0, 153));
        IsRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IsRespuestaActionPerformed(evt);
            }
        });

        irInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        irInicio.setForeground(new java.awt.Color(51, 0, 153));
        irInicio.setText("INICIO");
        irInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irInicioActionPerformed(evt);
            }
        });

        juegoTerminado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        juegoTerminado.setForeground(new java.awt.Color(51, 0, 153));
        juegoTerminado.setText("JUEGO TERMINADO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(524, Short.MAX_VALUE)
                .addComponent(botonSalir))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tituloValidacionRespuesta)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(descripcionValidacionRespuesta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IsRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(irInicio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(juegoTerminado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(botonSiguientePregunta)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(botonSalir)
                .addGap(9, 9, 9)
                .addComponent(tituloValidacionRespuesta)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcionValidacionRespuesta)
                    .addComponent(IsRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(juegoTerminado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(irInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonSiguientePregunta)
                .addGap(28, 28, 28))
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
        this.miJuego.incrementarRonda();
        FormJuego pantallaJuego = new FormJuego();
        pantallaJuego.setVisible(true);
        dispose();
        
        this.miJuego.vaciarRespuestas();
    }//GEN-LAST:event_botonSiguientePreguntaActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.miJuego.vaciarRespuestas();
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void IsRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IsRespuestaActionPerformed

    private void irInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irInicioActionPerformed
        FormPrincipal pantallaPrincipal = new FormPrincipal();
        pantallaPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_irInicioActionPerformed

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
                new FormValidarRespuesta("5").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IsRespuesta;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonSiguientePregunta;
    private javax.swing.JLabel descripcionValidacionRespuesta;
    private javax.swing.JButton irInicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel juegoTerminado;
    private javax.swing.JLabel tituloValidacionRespuesta;
    // End of variables declaration//GEN-END:variables

    private String validarRespuesta(String respuesta) {
        respuesta_correcta =Integer.parseInt(this.miJuego.validarRespuesta(respuesta));
        //System.out.println("idRespuesta en metodo validar respuesta de form valira respuesta = " + respuesta_correcta);
        if(respuesta_correcta==1){
            miJuego.acumularPremio();
            
            return "Verdadera";
        }
        else
            return "Falsa";
        
        
    }

    private void validarContinuarJuego() {
    

        if (this.respuesta_correcta == 0) {
            this.juegoTerminado.setVisible(true);
            this.irInicio.setVisible(true);
            //JOptionPane.showMessageDialog(null, "FINAL DEL JUEGO");
            this.botonSiguientePregunta.setVisible(false);
            //JOptionPane.showMessageDialog("FIN DEL JUEGO");
            //this.descripcionPremioAcumulado.setVisible(true);
            //this.IsRespuesta.setText("Fin del Juego");
        }
    }
}

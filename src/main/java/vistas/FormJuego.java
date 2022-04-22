package vistas;

import controlador.Juego;

public class FormJuego extends javax.swing.JFrame {
    
    private Juego miJuego;
    public FormJuego() {
        miJuego = miJuego.ObtenerMiJuego();
        initComponents();
        this.numeroPregunta.setText(miJuego.getRonda());
        this.valorPremio.setText(miJuego.getValorPremio());
        this.valorAcumulado.setText(String.valueOf(miJuego.getAcumulado()));
        this.textoPregunta.setText(this.miJuego.obtenerPregunta());    
        this.opcionRespuestaUno.setText(this.llenarRespuesta(0));
        this.opcionRespuestaDos.setText(this.llenarRespuesta(1));
        this.opcionRespuesta3.setText(this.llenarRespuesta(2));
        this.opcionRespuestaCuatro.setText(this.llenarRespuesta(3));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRespuestas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        botonValidarRepuesta = new javax.swing.JButton();
        botonRetiroVoluntario = new javax.swing.JButton();
        opcionRespuestaUno = new javax.swing.JRadioButton();
        opcionRespuestaDos = new javax.swing.JRadioButton();
        opcionRespuesta3 = new javax.swing.JRadioButton();
        opcionRespuestaCuatro = new javax.swing.JRadioButton();
        valorAcumulado = new javax.swing.JTextField();
        textoPregunta = new javax.swing.JTextField();
        descripcionAcumulado = new javax.swing.JLabel();
        descripcionPregunta = new javax.swing.JLabel();
        numeroPregunta = new javax.swing.JTextField();
        descripcionPremio = new javax.swing.JLabel();
        valorPremio = new javax.swing.JTextField();
        tituloHistorial = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setForeground(new java.awt.Color(102, 102, 255));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 255));

        botonValidarRepuesta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonValidarRepuesta.setForeground(new java.awt.Color(51, 0, 153));
        botonValidarRepuesta.setText("Verificar");
        botonValidarRepuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonValidarRepuestaActionPerformed(evt);
            }
        });

        botonRetiroVoluntario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonRetiroVoluntario.setForeground(new java.awt.Color(51, 0, 153));
        botonRetiroVoluntario.setText("Retirarse");
        botonRetiroVoluntario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetiroVoluntarioActionPerformed(evt);
            }
        });

        grupoRespuestas.add(opcionRespuestaUno);
        opcionRespuestaUno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opcionRespuestaUno.setForeground(new java.awt.Color(51, 0, 153));
        opcionRespuestaUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionRespuestaUnoActionPerformed(evt);
            }
        });

        grupoRespuestas.add(opcionRespuestaDos);
        opcionRespuestaDos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opcionRespuestaDos.setForeground(new java.awt.Color(51, 0, 153));
        opcionRespuestaDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionRespuestaDosActionPerformed(evt);
            }
        });

        grupoRespuestas.add(opcionRespuesta3);
        opcionRespuesta3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opcionRespuesta3.setForeground(new java.awt.Color(51, 0, 153));
        opcionRespuesta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionRespuesta3ActionPerformed(evt);
            }
        });

        grupoRespuestas.add(opcionRespuestaCuatro);
        opcionRespuestaCuatro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opcionRespuestaCuatro.setForeground(new java.awt.Color(51, 0, 153));
        opcionRespuestaCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionRespuestaCuatroActionPerformed(evt);
            }
        });

        valorAcumulado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorAcumuladoActionPerformed(evt);
            }
        });

        textoPregunta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textoPregunta.setForeground(new java.awt.Color(51, 0, 153));
        textoPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoPreguntaActionPerformed(evt);
            }
        });

        descripcionAcumulado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descripcionAcumulado.setForeground(new java.awt.Color(51, 0, 153));
        descripcionAcumulado.setText("Acumulado:");

        descripcionPregunta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descripcionPregunta.setForeground(new java.awt.Color(51, 0, 153));
        descripcionPregunta.setText("PREGUNTA #");

        numeroPregunta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numeroPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroPreguntaActionPerformed(evt);
            }
        });

        descripcionPremio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descripcionPremio.setForeground(new java.awt.Color(51, 0, 153));
        descripcionPremio.setText("VALOR $");

        valorPremio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        valorPremio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorPremioActionPerformed(evt);
            }
        });

        tituloHistorial.setBackground(new java.awt.Color(51, 0, 153));
        tituloHistorial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloHistorial.setForeground(new java.awt.Color(51, 0, 153));
        tituloHistorial.setText("QUIEN QUIERE SER MILLONARIO");

        botonSalir.setBackground(new java.awt.Color(153, 153, 255));
        botonSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(51, 51, 51));
        botonSalir.setText("x");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tituloHistorial)
                .addGap(152, 152, 152))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcionRespuestaCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonValidarRepuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(botonRetiroVoluntario, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textoPregunta, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opcionRespuesta3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(opcionRespuestaDos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(opcionRespuestaUno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(valorAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addComponent(descripcionAcumulado))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(descripcionPregunta)
                        .addGap(52, 52, 52)
                        .addComponent(numeroPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(descripcionPremio)
                        .addGap(43, 43, 43)
                        .addComponent(valorPremio, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(botonSalir)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcionPregunta)
                    .addComponent(numeroPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcionPremio)
                    .addComponent(valorPremio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(tituloHistorial)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(textoPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(opcionRespuestaUno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(descripcionAcumulado)
                        .addGap(23, 23, 23)))
                .addComponent(opcionRespuestaDos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opcionRespuesta3)
                    .addComponent(valorAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionRespuestaCuatro)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonValidarRepuesta)
                    .addComponent(botonRetiroVoluntario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionRespuestaUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionRespuestaUnoActionPerformed
        
    }//GEN-LAST:event_opcionRespuestaUnoActionPerformed

    private void opcionRespuestaDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionRespuestaDosActionPerformed
        
    }//GEN-LAST:event_opcionRespuestaDosActionPerformed

    private void opcionRespuesta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionRespuesta3ActionPerformed
        
    }//GEN-LAST:event_opcionRespuesta3ActionPerformed

    private void opcionRespuestaCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionRespuestaCuatroActionPerformed
        
    }//GEN-LAST:event_opcionRespuestaCuatroActionPerformed

    private void botonValidarRepuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonValidarRepuestaActionPerformed
        FormValidarRespuesta pantallaValidarRespuesta = new FormValidarRespuesta(validarRespuestaSeleccionada());
        pantallaValidarRespuesta.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonValidarRepuestaActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonRetiroVoluntarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetiroVoluntarioActionPerformed
        dispose();
    }//GEN-LAST:event_botonRetiroVoluntarioActionPerformed

    private void numeroPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroPreguntaActionPerformed
        this.numeroPregunta.setText(miJuego.getRonda());
    }//GEN-LAST:event_numeroPreguntaActionPerformed

    private void valorPremioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorPremioActionPerformed
        this.valorPremio.setText(miJuego.getValorPremio());
    }//GEN-LAST:event_valorPremioActionPerformed

    private void textoPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoPreguntaActionPerformed
        
    }//GEN-LAST:event_textoPreguntaActionPerformed

    private void valorAcumuladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorAcumuladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorAcumuladoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRetiroVoluntario;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonValidarRepuesta;
    private javax.swing.JLabel descripcionAcumulado;
    private javax.swing.JLabel descripcionPregunta;
    private javax.swing.JLabel descripcionPremio;
    private javax.swing.ButtonGroup grupoRespuestas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numeroPregunta;
    private javax.swing.JRadioButton opcionRespuesta3;
    private javax.swing.JRadioButton opcionRespuestaCuatro;
    private javax.swing.JRadioButton opcionRespuestaDos;
    private javax.swing.JRadioButton opcionRespuestaUno;
    private javax.swing.JTextField textoPregunta;
    private javax.swing.JLabel tituloHistorial;
    private javax.swing.JTextField valorAcumulado;
    private javax.swing.JTextField valorPremio;
    // End of variables declaration//GEN-END:variables

    private String llenarRespuesta(int i) {
        return this.miJuego.llenarRespuesta(i);
    }
    
    private int validarRespuestaSeleccionada(){
        if(this.opcionRespuestaUno.isSelected()){
            return 1;
        }
          return 0;  
    }
        
}

package vistas;

import controlador.Juego;

public class FormAgregarJugador extends javax.swing.JFrame {

    private Juego miJuego;
    
    public FormAgregarJugador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonIniciarJuego = new javax.swing.JButton();
        nombreJugador = new javax.swing.JTextField();
        descripcionNuevoJugador = new javax.swing.JLabel();
        tituloRegistroJugador = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 255));

        botonIniciarJuego.setBackground(new java.awt.Color(102, 102, 255));
        botonIniciarJuego.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonIniciarJuego.setForeground(new java.awt.Color(51, 0, 153));
        botonIniciarJuego.setText("Agregar usuario e Iniciar Juego");
        botonIniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarJuegoActionPerformed(evt);
            }
        });

        nombreJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreJugadorActionPerformed(evt);
            }
        });

        descripcionNuevoJugador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descripcionNuevoJugador.setForeground(new java.awt.Color(51, 0, 153));
        descripcionNuevoJugador.setText("Hola, por favor ingresa tu nombre y apellido");

        tituloRegistroJugador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloRegistroJugador.setForeground(new java.awt.Color(51, 0, 153));
        tituloRegistroJugador.setText("Registro de jugador");

        botonSalir.setBackground(new java.awt.Color(204, 204, 204));
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
                .addComponent(botonSalir))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonIniciarJuego, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(nombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(descripcionNuevoJugador))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(tituloRegistroJugador)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(botonSalir)
                .addGap(18, 18, 18)
                .addComponent(tituloRegistroJugador)
                .addGap(48, 48, 48)
                .addComponent(descripcionNuevoJugador)
                .addGap(32, 32, 32)
                .addComponent(nombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(botonIniciarJuego)
                .addContainerGap(84, Short.MAX_VALUE))
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

    private void botonIniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarJuegoActionPerformed
        miJuego = miJuego.ObtenerMiJuego();
        miJuego.insertarJugador(this.nombreJugador.getText());
        FormJuego pantallaJuego = new FormJuego();
        pantallaJuego.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonIniciarJuegoActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void nombreJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreJugadorActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAgregarJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciarJuego;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel descripcionNuevoJugador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreJugador;
    private javax.swing.JLabel tituloRegistroJugador;
    // End of variables declaration//GEN-END:variables
}

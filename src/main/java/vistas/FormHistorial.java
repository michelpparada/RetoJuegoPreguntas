package vistas;

import controlador.Juego;
import datos.Conexion;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class FormHistorial extends javax.swing.JFrame {
    
    private Juego miJuego;

    public FormHistorial() {
        initComponents();
        miJuego = miJuego.ObtenerMiJuego();
        pintarTabla();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonMenu = new javax.swing.JButton();
        scrollPanelTabla = new javax.swing.JScrollPane();
        tablaHistorial = new javax.swing.JTable();
        tituloHistorial = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 255));

        botonMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonMenu.setForeground(new java.awt.Color(51, 0, 153));
        botonMenu.setText("Ir al menú");
        botonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuActionPerformed(evt);
            }
        });

        tablaHistorial.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tablaHistorial.setForeground(new java.awt.Color(51, 0, 153));
        tablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "JUGADOR", "PUNTAJE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaHistorial.setGridColor(new java.awt.Color(102, 102, 255));
        scrollPanelTabla.setViewportView(tablaHistorial);

        tituloHistorial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloHistorial.setForeground(new java.awt.Color(51, 0, 153));
        tituloHistorial.setText("Historial de juego");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(tituloHistorial))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(botonMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(botonSalir)
                .addGap(2, 2, 2)
                .addComponent(tituloHistorial)
                .addGap(74, 74, 74)
                .addComponent(scrollPanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(botonMenu)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuActionPerformed
        FormPrincipal pantallaPrincipal = new FormPrincipal();
        pantallaPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonMenuActionPerformed

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
            java.util.logging.Logger.getLogger(FormHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormHistorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMenu;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollPanelTabla;
    private javax.swing.JTable tablaHistorial;
    private javax.swing.JLabel tituloHistorial;
    // End of variables declaration//GEN-END:variables

    private void pintarTabla() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tablaHistorial.setModel(modelo);

            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;
            Conexion conexion = new Conexion();
            Connection connectionClass = conexion.getConnection();

            String SQL_SELECT_JUGADORES = "SELECT nombre_jugador, puntaje FROM jugador";
            preparedStatement = connectionClass.prepareStatement(SQL_SELECT_JUGADORES);
            resultSet = preparedStatement.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) resultSet.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Nombre del jugador");
            modelo.addColumn("Puntaje");

            int[] anchos = {150, 50};
            for (int i = 0; i < tablaHistorial.getColumnCount(); i++) {
                tablaHistorial.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (resultSet.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = resultSet.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null,"Error mostrando historial: " + exception.getMessage());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import datos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author VALERIA-VICTORIA
 */
public class Juego {

    private static Juego miJuego;
    private int ronda;
    private double valorRonda = 1000L;
    private Conexion conexion = new Conexion();
    ArrayList<Map<String, String>> misRespuestas;
    private int pregunta;
    private double acumulado;
    
    public Juego() {
        ronda = 1;
    }

    public static Juego ObtenerMiJuego() {
        if (miJuego == null) {
            miJuego = new Juego();
        } 
        return miJuego;
    }
    

    public void insertarJugador(String nombre) {
        String SQL_INSERT_JUGADOR = "INSERT INTO jugador(nombre_jugador, puntaje) VALUES(?, 0)";

        try {
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;
            
            Connection connectionClass = conexion.getConnection();
            int rows = 0;

            preparedStatement = connectionClass.prepareStatement(SQL_INSERT_JUGADOR);
            preparedStatement.setString(1,nombre);
            rows = preparedStatement.executeUpdate();
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "rror de registro: " + exception.getMessage());
        }
    }

    public String getRonda() {
        return String.valueOf(this.ronda);
    }
    
    public String getValorPremio() {
        return String.valueOf(this.valorRonda * this.ronda);
    }

    public String obtenerPregunta() {
        
        //llama a la bd busca las preguntas con su id con id pregunta y llena las respuestas
        String SQL_BUSCAR_PREGUNTA = "SELECT id_pregunta,desc_pregunta FROM preguntas where categoria_pregunta = ?";

        //ArrayList<Map<String, String>> misRespuestas;
        this.misRespuestas = new ArrayList<>();
        int random = (int)(Math.random()*(4-0+1)) +1;
        int i = 1;
        String res = "error";
        
        try {
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;
            Connection connectionClass = conexion.getConnection();
            preparedStatement = connectionClass.prepareStatement(SQL_BUSCAR_PREGUNTA);
            preparedStatement.setInt(1,this.ronda);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                if(random == i){
                    this.pregunta = resultSet.getInt("id_pregunta");
                    res = resultSet.getString("desc_pregunta");
                }
                i++;
            }
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "rror de registro: " + exception.getMessage());
        }
        
        this.misRespuestas = null;
        return res;
    }

    public String llenarRespuesta(int i) {
        if(misRespuestas != null){
            return misRespuestas.get(i).get("respuesta");
        }else{
            this.buscarRespuestas();
            return misRespuestas.get(i).get("respuesta");
        }
    }

    private void buscarRespuestas() {
        //llama a la bd busca las preguntas con su id con id pregunta y llena las respuestas
        String SQL_BUSCAR_RESPUESTA = "SELECT id_respuesta,respuesta,respuesta_correcta,puntuacion_respuesta FROM respuestas where id_pregunta = ?";

        this.misRespuestas = new ArrayList<>();
        pregunta++;
        
        try {
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;
            Connection connectionClass = conexion.getConnection();
            preparedStatement = connectionClass.prepareStatement(SQL_BUSCAR_RESPUESTA);
            preparedStatement.setInt(1,this.pregunta-1);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                Map<String, String> mapa = new HashMap<>();
                mapa.put("id_respuesta", resultSet.getString("id_respuesta"));
                mapa.put("respuesta", resultSet.getString("respuesta"));
                mapa.put("respuesta_correcta", resultSet.getString("respuesta_correcta"));
                mapa.put("puntuacion_respuesta", resultSet.getString("puntuacion_respuesta"));
                this.misRespuestas.add(mapa);
            }
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "rror de registro: " + exception.getMessage());
        }
    }
    
    public void vaciarRespuestas() {
       this.misRespuestas = null;
    }

    public int getPregunta() {
        return pregunta;
    }

    public void acumularPremio() {
            this.acumulado += Double.parseDouble(this.getValorPremio());
     
    }

    public double getAcumulado() {
        return acumulado;
    }

    public String validarRespuesta(String respuesta) {
        String respuesta_correcta="";
        for (int i = 0; i < this.misRespuestas.size(); i++) {
         if(this.misRespuestas.get(i).get("respuesta") == respuesta){
             respuesta_correcta= this.misRespuestas.get(i).get("respuesta_correcta");
            }
         }

        return respuesta_correcta;
    }

    public String[][] cargarHistorial() {
         try {

            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;
            Conexion conexion = new Conexion();
            Connection connectionClass = conexion.getConnection();

            String SQL_SELECT_JUGADORES = "SELECT nombre_jugador, puntaje FROM jugador";
            preparedStatement = connectionClass.prepareStatement(SQL_SELECT_JUGADORES);
            resultSet = preparedStatement.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) resultSet.getMetaData();
            
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null,"Error mostrando historial: " + exception.getMessage());
        }
         return null;
    }

    public void incrementarRonda() {
         this.ronda++;
         System.out.println("this.ronda despues de incrementar = " + this.ronda);
    }

    public void guardarAcomulado() {
        
    }
    
    
}

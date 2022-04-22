package domain;

import java.math.BigDecimal;

public class Jugador {
    
    private int idJugador;
    private String nombreJugador;
    private BigDecimal puntuacionJugador;
    
    public Jugador(){
    }

    public Jugador(String nombre, BigDecimal puntuacion){
        this.nombreJugador = nombre;
        this.puntuacionJugador = puntuacion;
    }
    
    public Jugador(int id, String nombre, BigDecimal puntuacion){
        this.idJugador = id;
        this.nombreJugador = nombre;
        this.puntuacionJugador = puntuacion;
    }
    
    
    public int getIdJugador() {
        return idJugador;
    }
    
    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public BigDecimal getPuntuacionJugador() {
        return puntuacionJugador;
    }

    public void setPuntuacionJugador(BigDecimal puntuacionJugador) {
        this.puntuacionJugador = puntuacionJugador;
    }
}
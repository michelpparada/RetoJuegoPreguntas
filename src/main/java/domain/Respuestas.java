package domain;

import java.math.BigDecimal;

public class Respuestas {
    
    private int idRespuesta;
    private int idPregunta;
    private String respuesta;
    private boolean respuestaCorrecta;
    private BigDecimal puntuacionRespuesta;

    public Respuestas() {
    }

    public Respuestas(int idRespuesta, int idPregunta, String respuesta, boolean respuestaCorrecta, BigDecimal puntuacionRespuesta) {
        this.idRespuesta = idRespuesta;
        this.idPregunta = idPregunta;
        this.respuesta = respuesta;
        this.respuestaCorrecta = respuestaCorrecta;
        this.puntuacionRespuesta = puntuacionRespuesta;
    }

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public int getIdPregunta() {
        return idPregunta;
    }
    
    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public boolean isRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public BigDecimal getPuntuacionRespuesta() {
        return puntuacionRespuesta;
    }
}

package domain;

public class Preguntas {
    
    private int idPregunta;
    private int categoriaPregunta;
    private String pregunta;
    
    public Preguntas(){
    }

    public Preguntas(int idPregunta, int categoriaPregunta, String pregunta) {
        this.idPregunta = idPregunta;
        this.categoriaPregunta = categoriaPregunta;
        this.pregunta = pregunta;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public int getCategoriaPregunta() {
        return categoriaPregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    
}

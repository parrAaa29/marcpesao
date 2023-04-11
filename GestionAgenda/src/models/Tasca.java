package models;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Tasca {
    private LocalTime horaInicial;
    private LocalTime horaFinal;
    private String descripcio;
    private boolean completada;

    public Tasca(LocalTime horaInicial, LocalTime horaFinal, String descripcio) {
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.descripcio = descripcio;
        this.completada = false;
    }



    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public String getDescripcio() {
        return descripcio;
    }

    @Override
    public String toString() {
        return "models.Tasca{" +
                "horaInicial=" + this.horaInicial.truncatedTo(ChronoUnit.MINUTES) +
                ", horaFinal=" + this.horaFinal.truncatedTo(ChronoUnit.MINUTES) +
                ", descripcio='" + this.descripcio + '\'' +
                ", completada=" + this.completada +
                '}';
    }
}

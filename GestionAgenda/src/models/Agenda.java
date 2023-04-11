package models;

import models.Pagina;
import utilis.utilities;

import java.time.LocalTime;
import java.time.Year;
import java.util.Arrays;

public class Agenda {
    private Year any;
    private Pagina[] paginas;

    //crear tasca en una fecha

    public Agenda(Year a){
        this.any = a;
        this.paginas = new Pagina[a.length()];
    }
    private Tasca crearTasca() {
        Tasca t;
        LocalTime inicio = LocalTime.now();
        int munutosTasca = utilities.leerInt("Cuantos minutos dura la tarea?", 1, 1000);
        String descripcion = utilities.leerString("Escribe la descripcion de la tasca");
        t = new Tasca(inicio, inicio.plusMinutes(munutosTasca),descripcion);
        System.out.println(t);
        return t;
    }
    public boolean anadirTascaPagina(int dia){
        Tasca t = crearTasca();
        if (dia < 0 || dia > this.paginas.length) {
            return false;
        }else {
            if (this.paginas[dia] == null)
                this.paginas[dia] = new Pagina(Year.now().atDay(dia), false);
            this.paginas[dia].AnadirTasca(t);
            return true;
        }
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "any=" + any +
                ", paginas=" + Arrays.toString(paginas) +
                '}';
    }
}
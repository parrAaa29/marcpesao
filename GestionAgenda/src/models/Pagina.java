package models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Pagina {
    private LocalDate fecha;
    private boolean esFiesta;
    private ArrayList<Tasca> tasques;

    public Pagina (LocalDate fecha, boolean esFiesta) {
        this.fecha = fecha;
        this.esFiesta = esFiesta;
        this.tasques = new ArrayList<>();
    }

    //crear tasca
    public void AnadirTasca(Tasca tasca) {
        this.tasques.add(tasca);
    }

    //borrar tasca
    public void borrarTasca(Tasca tasca) {
        this.tasques.remove(tasca);
    }

    //borrar todas las tascas
    public void borrarTodasTasques() {
        this.tasques.clear();
    }

    //listar tascas
    public void listarTascas() {
        for (Tasca tasca : tasques) {
            System.out.println(tasca);
        }
    }
}

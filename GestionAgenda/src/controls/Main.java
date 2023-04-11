package controls;

import models.Agenda;
import models.Pagina;
import models.Tasca;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda a = crearAgenda();
        a.anadirTascaPagina(1);
    }


    public static Agenda crearAgenda(){
        Agenda agenda = new Agenda(Year.now());
        return agenda;
    }

    public static Tasca crearTasca() {
        Tasca t;
        LocalTime inicio = LocalTime.now();
        int duracionTasca = leerInt("Cuantos minutos dura la tarea?", 1, 1000);
        String descripcion = leerString("Escribe la descripcion de la tasca");
        t = new Tasca(inicio, inicio.plusMinutes(duracionTasca),descripcion);
        System.out.println(t);
        return t;
    }


    public static int leerInt(String menuPrincipal, int min, int max) {
        Scanner llegir = new Scanner(System.in);
        int opcio = 0;
        boolean valorCorrecte = false;

        do {
            System.out.println(menuPrincipal);

            valorCorrecte = llegir.hasNextInt();

            if (!valorCorrecte){
                System.out.println("ERROR: No has introduït un enter");
                llegir.nextLine();
            }else{
                opcio = llegir.nextInt();
                llegir.nextLine();

                if (opcio < min || opcio > max){
                    System.out.println("ERROR: Opció no correcte");
                    valorCorrecte = false;
                }
            }

        }while(!valorCorrecte);

        return opcio;
    }

    private static String leerString(String msg) {
        Scanner leer = new Scanner(System.in);
        System.out.println(msg);
        String devoler = leer.nextLine();
        //leer.close();
        return devoler;
    }

}
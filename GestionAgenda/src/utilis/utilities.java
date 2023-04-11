package utilis;

import java.util.Scanner;

public class utilities {
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

    public static String leerString(String msg) {
        Scanner leer = new Scanner(System.in);
        System.out.println(msg);
        String devoler = leer.nextLine();
        //leer.close();
        return devoler;
    }
}

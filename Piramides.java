
package piramides;

import java.util.Scanner;

//Alexander Medina Dominguez

public class Piramides {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println(" Hola bienvenido :) ");

        boolean banS = true;

        do {
            System.out.println("Selecciona una opcion del menu:");
            System.out.println("********* MENU ********");
            System.out.println(" 1. Piramide asterisco");
            System.out.println(" 2. Piramide Letras");
            System.out.println(" 3. Salir");

            int opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("1. Piramide asteriscos");
                    System.out.println("Ingresa el numero de filas que deseas para la piramide de asteriscos: ");
                    int numF = leer.nextInt();
                    for (int i = 1; i <= numF; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("2. Piramide Letras");
                    System.out.println("Ingresa el numero de filas que deseas para la piramide de letras: ");
                    int numFilas = leer.nextInt();
                    int valorNumero = 1;
                    char valorLetra = 'A';
                    for (int i = 1; i <= numFilas; i++) {
                        for (int j = 0; j < i; j++) {
                            if (i % 2 == 1) {
                                System.out.print(valorNumero++);
                            } else {
                                System.out.print(valorLetra++);
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    banS = false;
                    System.out.println("Saliendo....");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }         
         while (banS);
         leer.close();
    }
}
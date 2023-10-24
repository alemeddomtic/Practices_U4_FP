
//Alexander Medina Dominguez
//Fundamentos de Programación

package u4_practica_arreglo;

import java.util.Scanner;

public class U4_Practica_Arreglo {

    
    public static void main(String[] args) {
       
      int opc;
       
       do { 
        double[] num= {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        System.out.println("Hola, bienvenido a la caluculadora");
        System.out.println("***********************************");
        System.out.println("Que deceas hacer");
        System.out.println(" 1. Sumar los numeros del arreglo");
        System.out.println("2. Multiplicar los numeros del arreglo");
        System.out.println("3. Salir");

        Scanner leer = new Scanner (System.in);
       
        int opcion = leer.nextInt();
        
        switch (opcion){
            case 1: 
                System.out.println("Elegiste 1. Sumar los numeros del arreglo");
                    double sum1= 1;
                    for (double i = 0; i < num.length ; i++) {                       
                    double sum1 += num[i];
                    System.out.println("La suma de los numero es "+sum1); 
                    }
                break;
                
            case 2:
                System.out.println("Elegiste 2. Multiplicar los numeros del arreglo");
                    for (int i = 0; i < num.length ; i++) {
                        double mul1;
                        mul1 +* = num[i];
                        System.out.println(num[i]);                         
                        System.out.println(num[i]);  
                    } 
                    break;
            
            default:
                System.out.println("Opcion no valida");
        } while (opcion != 3)
        }             
    }
    
}

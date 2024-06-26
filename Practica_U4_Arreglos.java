package practica_u4_arreglos;

import java.util.Scanner;

public class Practica_U4_Arreglos {
    
    public static void main(String[] args) {
        
        double[] numeros = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        Scanner leer = new Scanner(System.in);
        boolean bandera = true;
        
        while (bandera) {       
            System.out.println("Hola, bienvenido a la calculadora"); 
            System.out.println("Seleccione la opcion que mas le convenga del menu");
            System.out.println("***********************************************"); 
            System.out.println("MENU");
            System.out.println("1.- Sumar los numeros del arreglo");
            System.out.println("2.- Multiplicar los numeros del arreglo");
            System.out.println("3. Salir");
            System.out.println("***********************************************");                  
            int opcion = leer.nextInt();
            
            switch (opcion) {
                case 1: 
                    System.out.println("Elegiste 1. Sumar los numeros del arreglo");
                    double suma = 0;  
                    for (int i = 0; i < numeros.length; i++) 
                        suma += numeros[i];
                    System.out.println("El resultado de la suma es ---> " + suma);                  
                    break;
                
                case 2: 
                    System.out.println("Elegiste 2. Multiplicar los numeros del arreglo");
                    double producto = 1;  
                    for (int i = 0; i < numeros.length; i++) 
                        producto *= numeros[i];
                    System.out.println("El resultado de la multiplicacion es ---> " + producto);           
                    break;
                
                case 3: 
                    System.out.println("Salida. Adios, califiquenos como bueno");
                    bandera = false;           
                    break;
                
                default: 
                    System.out.println("Esta opcion no es valida ):");            
                    break;           
            }           
            System.out.println("    ");                
        }
        leer.close();
    }    
}


package prac2_u4_u5;

import java.util.Scanner;

public class Prac2_U4_U5 {
    
//Alexander Medina Dominguez

    public static int suma(int s1, int s2) {
      return s1+s2;
    }

    public static int resta(int r1, int r2) {     
      return r1-r2;
    }

    public static int multiplicacion(int m1, int m2) {
      return m1*m2;
    }

    public static int division(int d1, int d2) {  
      return d1/d2;
    }
    
    public static void main(String[] args) {
        Scanner coco = new Scanner(System.in);
        
        System.out.println("****Bienvenido*****");

        System.out.print("Ingrese el primer numero ---> ");
        int num1 = coco.nextInt();
        
        System.out.print("Ingrese el segundo numero ---> ");
        int num2 = coco.nextInt();
        
        int resS = Prac2_U4_U5.suma(num1, num2);
        System.out.println("El resultado de la suma es: " + resS);        
        
        int resR = Prac2_U4_U5.resta(num1, num2);
        System.out.println("El resultado de la resta es: " + resR);
        
        int resM = Prac2_U4_U5.multiplicacion(num1, num2);
        System.out.println("El resultado de la multiplicacion es: " + resM);
        
        int resD = Prac2_U4_U5.division(num1, num2);
        System.out.println("El resultado de la division es: " + resD);
       
        coco.close();
    }
}

package p2_arreglos_bidimensionales;

public class P2_Arreglos_Bidimensionales {
  
    public static void main(String[] args) {

//Alexander Medina Dominguez
//Arreglos bidimensionales

char[][] letras= new char [3][5];
char a = 'a';

        for (char i = 0; i < 3; i++) {
            for (char j = 0; j < 5; j++) {
                letras [i][j] = a;
                a ++;               
            }         
            
        }
        for (char i = 0; i < 3; i++) {
            for (char j = 0; j < 5; j++) {
                System.out.print( letras[i][j]+ " "); 
            }
            System.out.println();
        }       
    }   
}


//Unidad 4 Y 5
//Alexander Medina Dominguez
//Estefania Reynoso Colin

package practica3_u4_u5;

public class Practica3_U4_U5 {

    public static void promedioEstudiante(double[][] calificaciones) {
        double[] promediosEstudiantes = new double[calificaciones.length];
        for (int i = 0; i < calificaciones.length; i++) {
            double sumaCalificaciones = 0;
            for (int j = 0; j < calificaciones[0].length; j++) {
                sumaCalificaciones += calificaciones[i][j];
            }
            double promedioEstudiante = sumaCalificaciones / calificaciones[0].length;
            promediosEstudiantes[i] = promedioEstudiante;
            System.out.println("El promedio del estudiante " + (i + 1) + " es de: " + promedioEstudiante);
        }
    }

    public static void promedioMateria(double[][] calificaciones) {
        for (int j = 0; j < calificaciones[0].length; j++) { 
            double sumaCalificaciones = 0;
            for (int i = 0; i < calificaciones.length; i++) {
                sumaCalificaciones += calificaciones[i][j];
            }
            double promedioMateria = sumaCalificaciones / calificaciones.length;
            System.out.println("El promedio de la materia " + (j + 1) + " es de: " + promedioMateria);
        }
    }

    public static void main(String[] args) {
        double[][] calificaciones = {
            {90.5, 85.0, 78.5, 92.0},
            {88.0, 76.5, 89.0, 94.5},
            {70.0, 82.5, 91.0, 87.5}
        };

        promedioEstudiante(calificaciones);
        promedioMateria(calificaciones);
    }
}

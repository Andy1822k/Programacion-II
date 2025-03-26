import java.util.Scanner;

public class EstadisticasModular {

    public static double promedio(double[] datos) {
        double suma = 0;
        for (double dato : datos) {
            suma += dato;
        }
        return suma / datos.length;
    }

    public static double desviacion(double[] datos) {
        double promedio = promedio(datos);
        double suma = 0;
        for (double dato : datos) {
            suma += Math.pow(dato - promedio, 2);
        }
        return Math.sqrt(suma / (datos.length - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] datos = new double[10];

        System.out.println("Ingrese 10 numeros:");
        for (int i = 0; i < 10; i++) {
            datos[i] = scanner.nextDouble();
        }

        System.out.printf("El promedio es %.2f%n", promedio(datos));
        System.out.printf("La desviacion estandar es %.5f%n", desviacion(datos));

        scanner.close();
    }
}

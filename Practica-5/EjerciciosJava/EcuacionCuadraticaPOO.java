import java.util.Scanner;

public class EcuacionCuadraticaPOO {

    private double a;
    private double b;
    private double c;

    public EcuacionCuadraticaPOO(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    public double getRaiz1() {
        double discriminante = getDiscriminante();
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    public double getRaiz2() {
        double discriminante = getDiscriminante();
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        EcuacionCuadraticaPOO ecuacion = new EcuacionCuadraticaPOO(a, b, c);

        double discriminante = ecuacion.getDiscriminante();

        if (discriminante > 0) {
            double raiz1 = ecuacion.getRaiz1();
            double raiz2 = ecuacion.getRaiz2();
            System.out.printf("La ecuacion tiene dos raices %.6f y %.6f%n", raiz1, raiz2);
        } else if (discriminante == 0) {
            double raiz = ecuacion.getRaiz1();
            System.out.printf("La ecuacion tiene una raiz %.6f%n", raiz);
        } else {
            System.out.println("La ecuacion no tiene raices reales");
        }

        scanner.close();
    }
}

import java.util.Random;
public class AppPrueba {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        Random rand = new Random();
        String[] colores = {"Rojo", "Azul", "Verde", "Amarillo", "Negro"};
        for (int i = 0; i < figuras.length; i++) {
            String color = colores[rand.nextInt(colores.length)];
            if (rand.nextInt(2) + 1 == 1) { 
                double lado = rand.nextDouble() * 10 + 1; 
                figuras[i] = new Cuadrado(color, lado);
            } else {
                double radio = rand.nextDouble() * 5 + 1; 
                figuras[i] = new Circulo(color, radio);
            }
        }
        for (Figura figura : figuras) {
            System.out.println("----------------------");
            System.out.println(figura);
            System.out.printf("area: %.2f\n", figura.area());
            System.out.printf("perimetro: %.2f\n", figura.perimetro());
            
            if (figura instanceof Coloreado) {
                Coloreado coloreado = (Coloreado)figura;
                System.out.println(coloreado.comoColorear());
            }
        }
    }
}

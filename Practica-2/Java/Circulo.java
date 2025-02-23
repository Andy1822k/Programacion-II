import java.awt.*;

public class Circulo {
    private Punto centro;
    private float radio;

    public Circulo(Punto c, float r) {
        this.centro = c;
        this.radio = r;
    }

    public void dibujaCirculo(Graphics g, int height) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLUE);

        // Ajustar las coordenadas y el tamaño para que el círculo sea visible
        int x = (int) (centro.x * 40);
        int y = (int) (centro.y * 40);
        int radioPix = (int) (radio * 40);

        // Dibujar el círculo
        g2.drawOval(x - radioPix, height - y - radioPix, 2 * radioPix, 2 * radioPix);
        System.out.println("Dibujando circulo en: (" + (x - radioPix) + ", " + (height - y - radioPix) + ")"); // Depuración
    }

    @Override
    public String toString() {
        return String.format("Circulo[Centro: (%.2f, %.2f), Radio: %.2f]", centro.x, centro.y, radio);
    }
}

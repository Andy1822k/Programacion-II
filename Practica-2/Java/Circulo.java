package practica2;

import java.awt.*;

public class Circulo {
    private Punto centro;
    private float radio;

    public Circulo(Punto c, float r) {
        this.centro = c;
        this.radio = r;
    }

    public void dibujaCirculo(Graphics g, int height, int width) {
    Graphics2D g2 = (Graphics2D) g;
    g2.setColor(Color.BLUE);

    int escala = 40; 
    int radioPix = (int) (radio * escala);

    // Centrar en el JPanel
    int x = width / 2;  
    int y = height / 2; 

    // Dibujar el círculo
    g2.drawOval(x - radioPix, y - radioPix, 2 * radioPix, 2 * radioPix);
    System.out.println("Dibujando circulo en: (" + (x - radioPix) + ", " + (y - radioPix) + ")");
}


    @Override
    public String toString() {
        return String.format("Circulo[Centro: (%.2f, %.2f), Radio: %.2f]", centro.x, centro.y, radio);
    }
}

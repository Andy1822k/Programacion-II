import java.awt.*;

public class Linea {
    private Punto p1, p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void dibujaLinea(Graphics g, int height, int width) {
    Graphics2D g2 = (Graphics2D) g;
    g2.setColor(Color.RED);

    int escala = 40; // Factor de escala

    // Centro del panel
    int cx = width / 2;
    int cy = height / 2;

    // Ajustar coordenadas relativas al centro con conversión segura a int
    int x1 = cx + Math.round(p1.x * escala);
    int y1 = cy - Math.round(p1.y * escala); // Invertimos Y para que coincida con el sistema cartesiano
    int x2 = cx + Math.round(p2.x * escala);
    int y2 = cy - Math.round(p2.y * escala);

    g2.drawLine(x1, y1, x2, y2);
}

    @Override
    public String toString() {
        return String.format("Linea[(%.2f, %.2f) - (%.2f, %.2f)]", p1.x, p1.y, p2.x, p2.y);
    }
}

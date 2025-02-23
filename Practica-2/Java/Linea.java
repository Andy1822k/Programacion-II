import java.awt.*;

public class Linea {
    private Punto p1, p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void dibujaLinea(Graphics g, int height) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);

        int x1 = (int) (p1.x * 40);
        int y1 = (int) (p1.y * 40);
        int x2 = (int) (p2.x * 40);
        int y2 = (int) (p2.y * 40);

        g2.drawLine(x1, height - y1, x2, height - y2);
    }

    @Override
    public String toString() {
        return String.format("Linea[(%.2f, %.2f) - (%.2f, %.2f)]", p1.x, p1.y, p2.x, p2.y);
    }
}

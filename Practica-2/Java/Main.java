import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static boolean mostrarLinea = true; // Mover la variable fuera del JPanel

    public static void main(String[] args) {
        // Crear puntos para la línea y el círculo
        Punto p1 = new Punto(2, 2);
        Punto p2 = new Punto(8, 8);
        Punto centroCirculo = new Punto(5, 5);
        float radio = 3;

        // Crear instancias de Linea y Circulo
        Linea linea = new Linea(p1, p2);
        Circulo circulo = new Circulo(centroCirculo, radio);

        // Crear una ventana (JFrame) para mostrar los gráficos
        JFrame frame = new JFrame("Dibujo de iínea y Circulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Crear un JPanel personalizado para dibujar
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (mostrarLinea) {
                    linea.dibujaLinea(g, getHeight()); // Dibuja la línea
                } else {
                    circulo.dibujaCirculo(g, getHeight()); // Dibuja el círculo
                }
            }
        };

        // Agregar el panel al JFrame
        frame.add(panel);
        frame.setVisible(true);

        // Usar un Timer para alternar entre la línea y el círculo
        Timer timer = new Timer(1000, new ActionListener() { // 3000 ms = 3 segundos
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarLinea = !mostrarLinea; // Alternar entre línea y círculo
                panel.repaint(); // Redibujar el panel
                System.out.println(mostrarLinea ? "Mostrando linea" : "Mostrando circulo"); // Depuración
            }
        });
        timer.start(); // Iniciar el Timer
    }
}

import java.util.Random;
import java.util.Scanner;
public class JuegoAdivinaNumero extends Juego1 {
    private int numeroAAdivinar;
    private static Scanner scanner = new Scanner(System.in);
    public JuegoAdivinaNumero(int vidas) {
        this.numeroDeVidas = vidas;
        this.record = 0;
    }
    public void juega() {
        reiniciaPartida();  
        Random rand = new Random();
        numeroAAdivinar = rand.nextInt(11);
        System.out.println("Adivina un numero entre 0 y 10:");
        while (true) {
            try {
                int intento = scanner.nextInt();
                if (intento == numeroAAdivinar) {
                    System.out.println("Acertaste!");
                    actualizaRecord();
                    break;
                } else {
                    System.out.println("Fallaste. El numero es " +
                        (numeroAAdivinar > intento ? "mayor" : "menor"));
                    if (!quitaVida()) {
                        System.out.println("Game over! No te quedan vidas.");
                        System.out.println("El numero era: " + numeroAAdivinar);
                        break;
                    }
                    System.out.println("Intenta de nuevo. Te quedan " + numeroDeVidas + " vidas.");
                }
            } catch (Exception e) {
                System.out.println("Error: ingresa un número entero.");
                scanner.next(); 
            }
        }
    }
}

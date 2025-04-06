import java.util.Random;
import java.util.Scanner;
public class JuegoAdivinaNumero extends Juego2 {
    protected int numeroAAdivinar;
    protected static Scanner scanner = new Scanner(System.in);
    public JuegoAdivinaNumero(int vidas) {
        this.numeroDeVidas = vidas;
    }
    protected int generarNumeroAleatorio() {
        return new Random().nextInt(11); 
    }
    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10) {
            return true;
        }
        System.out.println("Error: El numero debe estar entre 0 y 10");
        return false;
    }
    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = generarNumeroAleatorio();   
        System.out.println("\nAdivina un numero entre 0 y 10:");
        while (numeroDeVidas > 0) {
            try {
                int numeroUsuario = scanner.nextInt();
                if (!validaNumero(numeroUsuario)) {
                    continue;
                }
                if (numeroUsuario == numeroAAdivinar) {
                    System.out.println("Acertaste!");
                    actualizaRecord();
                    return;
                } else {
                    System.out.println("Fallaste. El numero es " + 
                        (numeroAAdivinar > numeroUsuario ? "mayor" : "menor"));
                    quitaVida();
                    if (numeroDeVidas > 0) {
                        System.out.println("Intenta de nuevo. Te quedan " + numeroDeVidas + " vidas.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: Ingresa solo numeros enteros");
                scanner.next();
            }
        }
        System.out.println("Game over! No te quedan vidas.");
        System.out.println("El numero era: " + numeroAAdivinar);
    }
}

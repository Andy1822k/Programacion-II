import java.util.Random;
public class JuegoAdivinaPar extends JuegoAdivinaNumero {
    public JuegoAdivinaPar(int vidas) {
        super(vidas);
    }
    @Override
    protected int generarNumeroAleatorio() {
        Random rand = new Random();
        int num;
        do {
            num = rand.nextInt(11); 
        } while (num % 2 != 0);
        return num;
    }
    @Override
    public boolean validaNumero(int numero) {
        if (super.validaNumero(numero)) {
            if (numero % 2 == 0) {
                return true;
            }
            System.out.println("Error: Debes ingresar un numero par");
        }
        return false;
    }
    @Override
    public void juega() {
        System.out.println("\n--- ADIVINA EL NUMERO PAR (0-10) ---");
        super.juega();
    }
}

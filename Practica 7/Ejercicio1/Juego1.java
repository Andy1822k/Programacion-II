public class Juego1 {
    protected int numeroDeVidas;
    protected int record;
    public void reiniciaPartida() {
        numeroDeVidas = 3;  
    }
    public void actualizaRecord() {
        if (numeroDeVidas > record) {
            record = numeroDeVidas;
        }
    }
    public boolean quitaVida() {
        numeroDeVidas--;
        return numeroDeVidas > 0;
    }
}

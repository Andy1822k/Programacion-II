public class AppJuego2 {
    public static void main(String[] args) {
        JuegoAdivinaNumero juegoNormal = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3);
        juegoNormal.juega();
        juegoPar.juega();
        juegoImpar.juega();
    }
}

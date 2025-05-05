public class Gobierno {
    String presidente;
    String ministerioResponsable;
    boolean haRespondido;
    String[] regionesAfectadas;

    public void responderDenuncia() {
        haRespondido = true;
        System.out.println("El gobierno ha respondido a la denuncia.");
    }

    public void proponerSolucion() {
        System.out.println("Propuesta de solucion emitida por " + ministerioResponsable);
    }
}

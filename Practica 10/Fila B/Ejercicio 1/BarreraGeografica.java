public class BarreraGeografica {
    String tipo; 
    String ubicacion;
    double extensionKm;
    boolean esCruzarleFacil;

    public void bloquearDispersion() {
        if (!esCruzarleFacil) {
            System.out.println("La barrera " + tipo + " en " + ubicacion + " impide la dispersion.");
        }
    }

    public void describirBarrera() {
        System.out.println("Barrera de tipo " + tipo + " ubicada en " + ubicacion + ", extension: " + extensionKm + " km.");
    }
}

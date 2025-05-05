public class Planta {
    String especie;
    String zonaHabitat;
    String tipoSemilla;
    boolean prospera;

    public void adaptarseCondiciones() {
        System.out.println("La planta " + especie + " intenta adaptarse al habitat " + zonaHabitat);
        prospera = true;
    }

    public void dispersarse() {
        System.out.println("La planta " + especie + " dispersa sus semillas en nuevas zonas.");
    }
}

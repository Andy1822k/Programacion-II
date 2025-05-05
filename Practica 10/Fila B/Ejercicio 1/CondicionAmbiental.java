public class CondicionAmbiental {
    String clima;
    String tipoSuelo;
    int temperaturaMedia;
    int precipitacionAnual;

    public void evaluarIdoneidad() {
        System.out.println("Evaluando si el clima " + clima + " y el suelo " + tipoSuelo + " son adecuados.");
    }

    public void cambiarCondiciones(String nuevoClima, int nuevaTemp) {
        clima = nuevoClima;
        temperaturaMedia = nuevaTemp;
        System.out.println("Condiciones cambiadas a: " + clima + " con " + temperaturaMedia + "C.");
    }
}

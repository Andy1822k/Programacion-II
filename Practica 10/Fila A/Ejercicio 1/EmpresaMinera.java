public class EmpresaMinera {
    String nombre;
    String ubicacion;
    boolean tieneConcesion;
    boolean haPagadoCompensacion;

    public void explotarRecurso() {
        System.out.println(nombre + " esta explotando recursos en " + ubicacion);
    }

    public void pagarCompensacion() {
        haPagadoCompensacion = true;
        System.out.println(nombre + " ha pagado la compensacion.");
    }
}

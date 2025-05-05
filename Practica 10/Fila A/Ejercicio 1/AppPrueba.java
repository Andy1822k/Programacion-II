public class AppPrueba {
    public static void main(String[] args) {
        // Crear pueblo indigena
        PuebloIndigena pueblo = new PuebloIndigena();
        pueblo.nombre = "CPILAP";
        pueblo.region = "Norte Amazonico - La Paz";
        pueblo.contaminantes = new String[]{"mercurio", "plomo", "arsenico"};
        pueblo.haDenunciado = false;

        // Crear empresa minera
        EmpresaMinera minera = new EmpresaMinera();
        minera.nombre = "Empresa Minera Potosina";
        minera.ubicacion = "Potosi";
        minera.tieneConcesion = true;
        minera.haPagadoCompensacion = false;

        // Crear gobierno
        Gobierno gobierno = new Gobierno();
        gobierno.presidente = "Luis Arce";
        gobierno.ministerioResponsable = "Medio Ambiente y Agua";
        gobierno.haRespondido = false;
        gobierno.regionesAfectadas = new String[]{"Potosi", "Oruro", "La Paz"};

        // Acciones
        pueblo.exigirCompensacion();
        pueblo.mostrarContaminantes();

        minera.explotarRecurso();
        minera.pagarCompensacion();

        gobierno.responderDenuncia();
        gobierno.proponerSolucion();
    }
}

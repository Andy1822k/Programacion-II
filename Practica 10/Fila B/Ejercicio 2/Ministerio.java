public class Ministerio {
    String nombre;
    String direccion;
    int nroEmpleados;
    String[][] empleados = new String[100][3]; 
    int[] edades = new int[100];
    double[] sueldos = new double[100];

    public Ministerio() {
        this.nombre = "Ministerio de Educacion";
        this.direccion = "Av. Arce 2147";
        this.nroEmpleados = 0;
    }

    public Ministerio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nroEmpleados = 0;
    }

    public void agregarEmpleado(String nombre, String apPaterno, String apMaterno, int edad, double sueldo) {
        if (nroEmpleados < 100) {
            empleados[nroEmpleados][0] = nombre;
            empleados[nroEmpleados][1] = apPaterno;
            empleados[nroEmpleados][2] = apMaterno;
            edades[nroEmpleados] = edad;
            sueldos[nroEmpleados] = sueldo;
            nroEmpleados++;
        }
    }

    public void eliminarEmpleadoPorEdad(int edad) {
        int eliminados = 0;
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] == edad) {
                for (int j = i; j < nroEmpleados - 1; j++) {
                    empleados[j][0] = empleados[j + 1][0];
                    empleados[j][1] = empleados[j + 1][1];
                    empleados[j][2] = empleados[j + 1][2];
                    edades[j] = edades[j + 1];
                    sueldos[j] = sueldos[j + 1];
                }
                nroEmpleados--;
                i--;
                eliminados++;
            }
        }
        System.out.println("Se eliminaron " + eliminados + " empleados con edad " + edad);
    }

    public void transferirEmpleado(Ministerio origen, Ministerio destino, String nombreCompleto) {
        for (int i = 0; i < origen.nroEmpleados; i++) {
            String empleadoCompleto = origen.empleados[i][0] + " " + 
                                     origen.empleados[i][1] + " " + 
                                     origen.empleados[i][2];
            if (empleadoCompleto.equalsIgnoreCase(nombreCompleto)) {
                destino.agregarEmpleado(origen.empleados[i][0], 
                                       origen.empleados[i][1], 
                                       origen.empleados[i][2], 
                                       origen.edades[i], 
                                       origen.sueldos[i]);
                origen.eliminarEmpleadoPorEdad(origen.edades[i]);
                System.out.println("Empleado " + nombreCompleto + " transferido exitosamente");
                return;
            }
        }
        System.out.println("No se encontró al empleado " + nombreCompleto);
    }

    public void mostrarEmpleados(int criterio) {
        if (nroEmpleados == 0) {
            System.out.println("No hay empleados registrados");
            return;
        }
        
        int minEdad = edades[0];
        for (int i = 1; i < nroEmpleados; i++) {
            if (edades[i] < minEdad) minEdad = edades[i];
        }
        
        System.out.println("Empleado(s) con menor edad (" + minEdad + " anios):");
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] == minEdad) {
                System.out.println("- " + empleados[i][0] + " " + 
                                  empleados[i][1] + " " + empleados[i][2]);
            }
        }
    }

    public void mostrarEmpleados(double criterio) {
        if (nroEmpleados == 0) {
            System.out.println("No hay empleados registrados");
            return;
        }
        
        double minSueldo = sueldos[0];
        for (int i = 1; i < nroEmpleados; i++) {
            if (sueldos[i] < minSueldo) minSueldo = sueldos[i];
        }
        
        System.out.println("Empleado(s) con menor sueldo (Bs. " + minSueldo + "):");
        for (int i = 0; i < nroEmpleados; i++) {
            if (sueldos[i] == minSueldo) {
                System.out.println("- " + empleados[i][0] + " " + 
                                  empleados[i][1] + " " + empleados[i][2]);
            }
        }
    }

    public void mostrarInformacion() {
        System.out.println("\n=== " + nombre + " ===");
        System.out.println("Direccion: " + direccion);
        System.out.println("Numero de empleados: " + nroEmpleados);
    }
}

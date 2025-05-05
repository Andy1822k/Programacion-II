public class LineaTeleferico {
    String color;
    String tramo;
    int nroCabinas;
    int nroEmpleados;
    String[][] empleados = new String[100][3]; 
    int[] edades = new int[100];
    double[] sueldos = new double[100];

    public LineaTeleferico() {
        this.color = "Azul";
        this.tramo = "Estacion Periferica - UPEA";
        this.nroCabinas = 20;
        this.nroEmpleados = 0;
        this.empleados = new String[100][3];
        this.edades = new int[100];
        this.sueldos = new double[100];
    }

    public LineaTeleferico(String color, String tramo, int nroCabinas) {
        this.color = color;
        this.tramo = tramo;
        this.nroCabinas = nroCabinas;
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
        } else {
            System.out.println("No se pueden agregar más empleados. Limite alcanzado.");
        }
    }

    public void eliminarEmpleadoPorApellido(String apellido) {
        int eliminados = 0;
        for (int i = 0; i < nroEmpleados; i++) {
            if (empleados[i][1].equalsIgnoreCase(apellido) || empleados[i][2].equalsIgnoreCase(apellido)) {
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
        System.out.println("Se eliminaron " + eliminados + " empleados con apellido " + apellido);
    }

    public boolean transferirEmpleadoA(LineaTeleferico destino, String nombreCompleto) {
        for (int i = 0; i < nroEmpleados; i++) {
            String empleadoCompleto = String.format("%s %s %s", empleados[i][0], empleados[i][1], empleados[i][2]);
            if (empleadoCompleto.equalsIgnoreCase(nombreCompleto)) {
                destino.agregarEmpleado(empleados[i][0], empleados[i][1], empleados[i][2], edades[i], sueldos[i]);
                eliminarEmpleadoPorApellido(empleados[i][1]);
                System.out.println("Empleado " + nombreCompleto + " transferido exitosamente");
                return true;
            }
        }
        System.out.println("No se encontró al empleado " + nombreCompleto);
        return false;
    }

    public void mostrarEmpleadosMayorEdad() {
        if (nroEmpleados == 0) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        int maxEdad = -1;
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] > maxEdad) {
                maxEdad = edades[i];
            }
        }

        System.out.println("Empleado(s) con mayor edad (" + maxEdad + " anios):");
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] == maxEdad) {
                System.out.printf("- %s %s %s%n", empleados[i][0], empleados[i][1], empleados[i][2]);
            }
        }
    }

    public void mostrarEmpleadosMayorSueldo() {
        if (nroEmpleados == 0) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        double maxSueldo = -1;
        for (int i = 0; i < nroEmpleados; i++) {
            if (sueldos[i] > maxSueldo) {
                maxSueldo = sueldos[i];
            }
        }

        System.out.println("Empleado(s) con mayor sueldo (Bs. " + maxSueldo + "):");
        for (int i = 0; i < nroEmpleados; i++) {
            if (sueldos[i] == maxSueldo) {
                System.out.printf("- %s %s %s%n", empleados[i][0], empleados[i][1], empleados[i][2]);
            }
        }
    }
    
    public void mostrarInformacion() {
        System.out.println("\n=== Linea " + color + " ===");
        System.out.println("Tramo: " + tramo);
        System.out.println("Numero de cabinas: " + nroCabinas);
        System.out.println("Numero de empleados: " + nroEmpleados);
    }
}

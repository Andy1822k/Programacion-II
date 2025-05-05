public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTION DE MINISTERIOS ===");
        
        // a) Instanciar 2 objetos de diferente forma
        Ministerio minSalud = new Ministerio("Ministerio de Salud", "Av. Camacho #123");
        Ministerio minEducacion = new Ministerio();
        
        // Agregar empleados al Ministerio de Salud
        minSalud.agregarEmpleado("Pedro", "Rojas", "Luna", 35, 2500);
        minSalud.agregarEmpleado("Lucy", "Sosa", "Rios", 43, 3250);
        minSalud.agregarEmpleado("Ana", "Perez", "Rojas", 26, 2700);
        
        // Agregar empleados al Ministerio de Educación
        minEducacion.agregarEmpleado("Maria", "Lopez", "Quispe", 26, 2600);
        minEducacion.agregarEmpleado("Carlos", "Mamani", "Flores", 31, 2400);
        
        // Mostrar información inicial
        minSalud.mostrarInformacion();
        minEducacion.mostrarInformacion();
        
        // b) Eliminar empleados con edad 26
        System.out.println("\nEliminando empleados con edad 26...");
        minSalud.eliminarEmpleadoPorEdad(26);
        minEducacion.eliminarEmpleadoPorEdad(26);
        
        // c) Transferir empleado de Educación a Salud
        System.out.println("\nTransferiendo empleado...");
        Ministerio ministerio = new Ministerio();
        ministerio.transferirEmpleado(minEducacion, minSalud, "Carlos Mamani Flores");
        
        // Mostrar información después de operaciones
        System.out.println("\n=== Despues de las operaciones ===");
        minSalud.mostrarInformacion();
        minEducacion.mostrarInformacion();
        
        // d) Mostrar empleados con menor edad y sueldo
        System.out.println("\n=== Resultados ===");
        System.out.println("\nMinisterio de Salud:");
        minSalud.mostrarEmpleados(0); 
        minSalud.mostrarEmpleados(0.0); 
        
        System.out.println("\nMinisterio de Educacion:");
        minEducacion.mostrarEmpleados(0);
        minEducacion.mostrarEmpleados(0.0);
    }
}

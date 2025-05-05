public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTION DE MI TELEFERICO ===");
        
        // a) Instanciar 2 objetos de diferente forma
        LineaTeleferico lineaRoja = new LineaTeleferico("Roja", "Central - Cementerio - 16 de Julio", 20);
        LineaTeleferico lineaAzul = new LineaTeleferico(); 
        
        // Agregar empleados a la línea roja
        System.out.println("\nAgregando empleados a la linea roja...");
        lineaRoja.agregarEmpleado("Pedro", "Rojas", "Luna", 35, 2500);
        lineaRoja.agregarEmpleado("Lucy", "Sosa", "Rios", 43, 3250);
        lineaRoja.agregarEmpleado("Ana", "Perez", "Rojas", 26, 2700);
        lineaRoja.agregarEmpleado("Saul", "Arce", "Calle", 29, 2500);
        
        // Mostrar información inicial
        lineaRoja.mostrarInformacion();
        lineaAzul.mostrarInformacion();
        
        // b) Eliminar empleados con apellido "Rojas"
        System.out.println("\nEliminando empleados con apellido 'Rojas'...");
        lineaRoja.eliminarEmpleadoPorApellido("Rojas");
        
        // c) Transferir empleado "Saul Arce Calle" de rojo a azul
        System.out.println("\nTransferiendo empleado 'Saul Arce Calle'...");
        lineaRoja.transferirEmpleadoA(lineaAzul, "Saul Arce Calle");
        
        // Mostrar información después de las operaciones
        System.out.println("\n=== Despues de las operaciones ===");
        lineaRoja.mostrarInformacion();
        lineaAzul.mostrarInformacion();
        
        // d) Mostrar empleados destacados
        System.out.println("\n=== Empleados ===");
        System.out.println("\nLinea Roja:");
        lineaRoja.mostrarEmpleadosMayorEdad();
        lineaRoja.mostrarEmpleadosMayorSueldo();
        
        System.out.println("\nLinea Azul:");
        lineaAzul.mostrarEmpleadosMayorEdad();
        lineaAzul.mostrarEmpleadosMayorSueldo();
    }
}

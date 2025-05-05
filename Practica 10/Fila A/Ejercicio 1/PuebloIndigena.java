public class PuebloIndigena {
    String nombre;
    String region;
    String[] contaminantes; 
    boolean haDenunciado;

    public void exigirCompensacion() {
        System.out.println(nombre + " exige fondo de compensacion.");
    }

    public void mostrarContaminantes() {
        System.out.print("Contaminantes detectados: ");
        for(String c : contaminantes)
            System.out.print(c + " ");
        System.out.println();
    }
}

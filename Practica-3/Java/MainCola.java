public class MainCola {
    public static void main(String[] args) {
        // Crear colaA con los datos iniciales: 22, 5, 10, 11
        Cola colaA = new Cola(10);
        colaA.insert(22);
        colaA.insert(5);
        colaA.insert(10);
        colaA.insert(11);

        // Crear colaB para primos y colaC para no primos
        Cola colaB = new Cola(10);
        Cola colaC = new Cola(10);

        // Encontrar el máximo valor en colaA para la criba
        long max = 0;
        int tamanioOriginal = colaA.size();
        for (int i = 0; i < tamanioOriginal; i++) {
            long elemento = colaA.remove();
            if (elemento > max) max = elemento;
            colaA.insert(elemento);
        }

        // Generar la Criba de Eratóstenes
        boolean[] esPrimo = new boolean[(int) (max + 1)];
        for (int i = 0; i <= max; i++) esPrimo[i] = true;
        esPrimo[0] = esPrimo[1] = false;
        for (int i = 2; i * i <= max; i++) {
            if (esPrimo[i]) {
                for (int j = i * i; j <= max; j += i) {
                    esPrimo[j] = false;
                }
            }
        }

        // Clasificar los elementos de colaA en colaB (primos) y colaC (no primos)
        for (int i = 0; i < tamanioOriginal; i++) {
            long elemento = colaA.remove();
            if (elemento >= 0 && elemento <= max && esPrimo[(int) elemento]) {
                colaB.insert(elemento);
            } else {
                colaC.insert(elemento);
            }
            colaA.insert(elemento);
        }

        // Mostrar elementos de colaB (primos) sin modificar la cola
        System.out.println("Elementos en colaB (primos):");
        Cola tempB = new Cola(10);
        int tamanioB = colaB.size();
        for (int i = 0; i < tamanioB; i++) {
            long elemento = colaB.remove();
            System.out.print(elemento + " ");
            tempB.insert(elemento);
            colaB.insert(elemento);
        }
        System.out.println();

        // Mostrar elementos de colaC (no primos) sin modificar la cola
        System.out.println("Elementos en colaC (no primos):");
        Cola tempC = new Cola(10);
        int tamanioC = colaC.size();
        for (int i = 0; i < tamanioC; i++) {
            long elemento = colaC.remove();
            System.out.print(elemento + " ");
            tempC.insert(elemento);
            colaC.insert(elemento);
        }
        System.out.println();
    }
}

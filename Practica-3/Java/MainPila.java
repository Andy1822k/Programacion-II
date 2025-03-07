public class MainPila 
{
    public static void main(String[] args) 
    {
        
        Pila pilaA = new Pila(10);  
        Pila pilaB = new Pila(10);  
        Pila pilaC = new Pila(10); 

        
        long[] datos = {13, 22, 7};
        for (long dato : datos) {
            pilaA.push(dato);
        }

        
        System.out.println("Datos insertados en la pila A:");
        Pila tempPila = new Pila(10);  
        while (!pilaA.isEmpty()) {
            long elemento = pilaA.pop();
            System.out.print(elemento + " ");  
            tempPila.push(elemento);           
        }
        System.out.println();

        
        while (!tempPila.isEmpty()) {
            pilaA.push(tempPila.pop());
        }

        
        while (!pilaA.isEmpty()) {
            long elemento = pilaA.pop();
            if (elemento % 2 == 0) {
                pilaB.push(elemento);  
            } else {
                pilaC.push(elemento);  
            }
        }

        
        System.out.println("Elementos en la pila B (pares):");
        while (!pilaB.isEmpty()) {
            System.out.print(pilaB.pop() + " ");
        }
        System.out.println();

        System.out.println("Elementos en la pila C (impares):");
        while (!pilaC.isEmpty()) {
            System.out.print(pilaC.pop() + " ");
        }
        System.out.println();
    }
}

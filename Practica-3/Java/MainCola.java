public class MainCola {
    public static void main(String[] args) 
    {
        Cola cola = new Cola(5); 
        
        cola.insert(10);
        cola.insert(20);
        cola.insert(30);
        cola.insert(40);
        cola.insert(50);

        
        System.out.println("Valores en la cola:");
        Cola copiaCola = new Cola(5); 
        int tamanioOriginal = cola.size();
        for (int i = 0; i < tamanioOriginal; i++) 
        {
            long elemento = cola.remove();
            System.out.print(elemento + " "); 
            copiaCola.insert(elemento);       
            cola.insert(elemento);            
        }
        System.out.println(); 

        
        System.out.println("Esta llena? " + cola.isFull()); 

        System.out.println("Elemento en la cima (peek): " + cola.peek());
        
        System.out.println("Elemento removido (remove): " + cola.remove()); 
        
        System.out.println("Insertando 60...");
        cola.insert(60); 
        
        System.out.println("Valores en la cola");
        Cola copiaCola2 = new Cola(5); 
        tamanioOriginal = cola.size();
        for (int i = 0; i < tamanioOriginal; i++) 
        {
            long elemento = cola.remove();
            System.out.print(elemento + " "); 
            copiaCola2.insert(elemento);      
            cola.insert(elemento);            
        }
        System.out.println(); 

        
        System.out.println("Tamanio de la cola: " + cola.size());
        System.out.println("Esta vacia? " + cola.isEmpty());    
        System.out.println("Esta llena? " + cola.isFull());     
    }
}

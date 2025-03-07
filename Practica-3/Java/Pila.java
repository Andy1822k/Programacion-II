public class Pila 
{
    private long[] arreglo;  
    private int top;         
    private int n;           

    
    public Pila(int n) 
    {
        this.n = n;
        this.arreglo = new long[n];
        this.top = -1;  
    }

    
    public void push(long e) 
    {
        if (isFull()) {
            System.out.println("La pila esta llena. No se puede insertar " + e);
            return;  
        }
        top++;
        arreglo[top] = e;
    }

    
    public long pop() 
    {
        if (isEmpty()) 
        {
            System.out.println("La pila está vacía. No se puede eliminar ningún elemento.");
            return -1;  
        }
        long elemento = arreglo[top];
        top--;
        return elemento;
    }

    
    public long peek() 
    {
        if (isEmpty()) 
        {
            System.out.println("La pila esta vacía. No hay elementos para ver.");
            return -1;  
        }
        return arreglo[top];
    }

    
    public boolean isEmpty() 
    {
        return top == -1;
    }

    
    public boolean isFull() 
    {
        return top == n - 1;
    }
}

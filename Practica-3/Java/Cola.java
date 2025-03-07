public class Cola {
    private long[] arreglo;  
    private int inicio;      
    private int fin;         
    private int n;           

    public Cola(int n) {
        this.n = n + 1;      
        this.arreglo = new long[this.n];
        this.inicio = 0;
        this.fin = 0;
    }

    public void insert(long e) 
    {
        if (isFull()) 
        {
            System.out.println("Cola llena");
        } else 
        {
            fin = (fin + 1) % n;  
            arreglo[fin] = e;
        }
    }

    public long remove() 
    {
        if (isEmpty()) 
        {
            System.out.println("Cola vacía");
            return -1; 
        } else 
        {
            inicio = (inicio + 1) % n;  
            long dato = arreglo[inicio];
            if (inicio == fin) 
            {
                
                inicio = 0;
                fin = 0;
            }
            return dato;
        }
    }

    public long peek() 
    {
        if (isEmpty()) 
        {
            System.out.println("Cola vacía");
            return -1; 
        }
        return arreglo[(inicio + 1) % n];  
    }

    public boolean isEmpty() 
    {
        return inicio == fin;  
    }

    public boolean isFull() 
    {
        return (fin + 1) % n == inicio;  
    }

    public int size() 
    {
        if (fin >= inicio) 
        {
            return fin - inicio;
        } else 
        {
            return n - (inicio - fin);
        }
    }
}

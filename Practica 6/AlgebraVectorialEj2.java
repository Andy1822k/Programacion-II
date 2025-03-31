public class AlgebraVectorialEj2 
{
    public double x, y, z;
    
    public AlgebraVectorialEj2(double x, double y, double z) 
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public AlgebraVectorialEj2 suma(AlgebraVectorialEj2 otro) 
    {
        return new AlgebraVectorialEj2(this.x + otro.x, this.y + otro.y, this.z + otro.z);
    }
    
    public AlgebraVectorialEj2 multiplicar(double escalar) 
    {
        return new AlgebraVectorialEj2(this.x * escalar, this.y * escalar, this.z * escalar);
    }
    
    public double longitud() 
    {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public AlgebraVectorialEj2 normalizar()
    {
        double len = this.longitud();
        return new AlgebraVectorialEj2(x/len, y/len, z/len);
    }

    public double productoEscalar(AlgebraVectorialEj2 otro) 
    {
        return this.x*otro.x + this.y*otro.y + this.z*otro.z;
    }

    public AlgebraVectorialEj2 productoVectorial(AlgebraVectorialEj2 otro) 
    {
        return new AlgebraVectorialEj2(
            this.y*otro.z - this.z*otro.y,
            this.z*otro.x - this.x*otro.z,
            this.x*otro.y - this.y*otro.x
        );
    }
    
    @Override
    public String toString() 
    {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }

    public static void main(String[] args) {
        AlgebraVectorialEj2 v1 = new AlgebraVectorialEj2(2, 4, 6);
        AlgebraVectorialEj2 v2 = new AlgebraVectorialEj2(1, 2, 3);

        AlgebraVectorialEj2 suma = v1.suma(v2);
        AlgebraVectorialEj2 productoEscalar = v1.multiplicar(2);
        AlgebraVectorialEj2 productoVectorial = v1.productoVectorial(v2);

        System.out.println("Suma: " + suma);
        System.out.println("Producto por escalar: " + productoEscalar);
        System.out.println("Longitud v1: " + v1.longitud());
        System.out.println("Normalizado v2: " + v2.normalizar());
        System.out.println("Producto escalar: " + v1.productoEscalar(v2));
        System.out.println("Producto vectorial: " + productoVectorial);
    }
}

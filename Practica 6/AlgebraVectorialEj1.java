public class AlgebraVectorialEj1{
    public double x, y, z;

    public AlgebraVectorialEj1(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean esPerpendicular(AlgebraVectorialEj1 otro) {
        return Math.abs(this.x * otro.x + this.y * otro.y + this.z * otro.z) < 1e-10;
    }

    public boolean esPerpendicular(AlgebraVectorialEj1 otro, int metodo) {
        switch(metodo) {
            case 1:
                double sumaX = this.x + otro.x;
                double sumaY = this.y + otro.y;
                double sumaZ = this.z + otro.z;
                double restaX = this.x - otro.x;
                double restaY = this.y - otro.y;
                double restaZ = this.z - otro.z;
                double longSuma = Math.sqrt(sumaX*sumaX + sumaY*sumaY + sumaZ*sumaZ);
                double longResta = Math.sqrt(restaX*restaX + restaY*restaY + restaZ*restaZ);
                return Math.abs(longSuma - longResta) < 1e-10;

            case 2: 
                double restaAX = this.x - otro.x;
                double restaAY = this.y - otro.y;
                double restaAZ = this.z - otro.z;
                double restaBX = otro.x - this.x;
                double restaBY = otro.y - this.y;
                double restaBZ = otro.z - this.z;
                double longRestaA = Math.sqrt(restaAX*restaAX + restaAY*restaAY + restaAZ*restaAZ);
                double longRestaB = Math.sqrt(restaBX*restaBX + restaBY*restaBY + restaBZ*restaBZ);
                return Math.abs(longRestaA - longRestaB) < 1e-10;

            case 3:
                double sumaX2 = this.x + otro.x;
                double sumaY2 = this.y + otro.y;
                double sumaZ2 = this.z + otro.z;
                double longSumaCuad = sumaX2*sumaX2 + sumaY2*sumaY2 + sumaZ2*sumaZ2;
                double longACuad = this.x*this.x + this.y*this.y + this.z*this.z;
                double longBCuad = otro.x*otro.x + otro.y*otro.y + otro.z*otro.z;
                return Math.abs(longSumaCuad - (longACuad + longBCuad)) < 1e-10;

            default:
                return this.esPerpendicular(otro);
        }
    }

    public boolean esParalelo(AlgebraVectorialEj1 otro) {
        double cx = this.y * otro.z - this.z * otro.y;
        double cy = this.z * otro.x - this.x * otro.z;
        double cz = this.x * otro.y - this.y * otro.x;
        return Math.sqrt(cx*cx + cy*cy + cz*cz) < 1e-10;
    }

    public boolean esParalelo(AlgebraVectorialEj1 otro, int metodo) {
        if (metodo == 1) {
            if (otro.x == 0 && otro.y == 0 && otro.z == 0) return true;
            double r = 0;
            if (otro.x != 0) r = this.x / otro.x;
            else if (otro.y != 0) r = this.y / otro.y;
            else if (otro.z != 0) r = this.z / otro.z;
            return Math.abs(this.x - r * otro.x) < 1e-10 &&
                   Math.abs(this.y - r * otro.y) < 1e-10 &&
                   Math.abs(this.z - r * otro.z) < 1e-10;
        }
        return this.esParalelo(otro);
    }

    public AlgebraVectorialEj1 proyeccion(AlgebraVectorialEj1 otro) {
        double productoEscalar = this.x * otro.x + this.y * otro.y + this.z * otro.z;
        double longBCuad = otro.x*otro.x + otro.y*otro.y + otro.z*otro.z;
        if (longBCuad == 0) throw new ArithmeticException("No se puede proyectar sobre el vector cero");
        double factor = productoEscalar / longBCuad;
        return new AlgebraVectorialEj1(
            otro.x * factor,
            otro.y * factor,
            otro.z * factor
        );
    }

    public double componente(AlgebraVectorialEj1 otro) {
        double productoEscalar = this.x * otro.x + this.y * otro.y + this.z * otro.z;
        double longitudB = Math.sqrt(otro.x*otro.x + otro.y*otro.y + otro.z*otro.z);
        if (longitudB == 0) throw new ArithmeticException("No se puede calcular componente con vector cero");
        return productoEscalar / longitudB;
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }
    
    public static void main(String[] args) {
        
        AlgebraVectorialEj1 a = new AlgebraVectorialEj1(1, 0, 0);
        AlgebraVectorialEj1 b = new AlgebraVectorialEj1(0, 1, 0);
        
        System.out.println("Vector a" + a);
        System.out.println("Vector b" + b);
        
        System.out.println("=== PERPENDICULARIDAD ===");
        System.out.println("a.b=0: " + a.esPerpendicular(b));
        System.out.println("|a+b|=|a-b| (1): " + a.esPerpendicular(b, 1));
        System.out.println("|a-b|=|b-a| (2): " + a.esPerpendicular(b, 2));
        System.out.println("|a+b|^2=|a|^2 +|b|^2 (3): " + a.esPerpendicular(b, 3));

        System.out.println("\n=== PARALELISMO ===");
        System.out.println("a x b=0: " + a.esParalelo(b));
        System.out.println("a=r*b (1): " + a.esParalelo(b, 1));

        System.out.println("\n=== PROYECCION Y COMPONENTE ===");
        System.out.println("Proyeccion de a sobre b: " + a.proyeccion(b));
        System.out.println("Componente de a en b: " + a.componente(b));
    }
}

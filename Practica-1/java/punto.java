package punto;

public class Punto 
{
    public float x;
    public float y;
    
    public Punto(float x, float y) 
    {
        this.x = x;
        this.y = y;
    }

    public double[] coord_cartesianas() 
    {
        return new double[]{x, y};
    }

    public double[] coord_polares() 
    {
        double r = sqrt(x * x + y * y); 
        double theta = atan2(y, x); 
        return new double[]{r, theta * 180 / 3.141592653589793};
    }

    private double sqrt(double n) 
    { 
        double x = n;
        double y = 1;
        double e = 0.000001; 
        while (x - y > e) {
            x = (x + y) / 2;
            y = n / x;
        }
        return x;
    }

    private double atan2(double y, double x) 
    { 
        if (x > 0) return atan(y / x);
        if (x < 0 && y >= 0) return atan(y / x) + 3.141592653589793;
        if (x < 0 && y < 0) return atan(y / x) - 3.141592653589793;
        if (x == 0 && y > 0) return 3.141592653589793 / 2;
        if (x == 0 && y < 0) return -3.141592653589793 / 2;
        return 0;
    }

    private double atan(double z) { // Aproximación de atan (Taylor series simplificada)
        return z - (z * z * z / 3) + (z * z * z * z * z / 5) - (z * z * z * z * z * z * z / 7);
    }

    @Override
    public String toString() 
    {
        return "Punto(" + x + ", " + y + ")";
    }
    public static void main(String[] args) 
    {
        Punto p = new Punto(3, 4);
        System.out.println(p);
        System.out.println("Cartesiana: " + java.util.Arrays.toString(p.coord_cartesianas()));
        System.out.println("Polar: " + java.util.Arrays.toString(p.coord_polares()));
    }
    
}

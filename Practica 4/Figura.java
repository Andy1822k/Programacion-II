public class FiguraGeometrica {
    
    double area(double radio)
    {
        return Math.PI * radio * radio; //circulo
    }
    
    double area(double base, double altura)
    {
        return base * altura; //rectangulo
    }
    
    
    double area(double base, double altura, String figura) {
        if (figura.equalsIgnoreCase("triangulo")) {
            return (base * altura) / 2; // Área del triángulo rectángulo
        }
        return 0; 
    }

    
    double area(double baseMayor, double baseMenor, double altura, String figura) {
        if (figura.equalsIgnoreCase("trapecio")) {
            return ((baseMayor + baseMenor) * altura) / 2; // Área del trapecio
        }
        return 0; 
    }

    
    double area(double lado, String figura) 
    {
        if (figura.equalsIgnoreCase("pentagono")) {
            return (5 * lado * lado) / (4 * Math.tan(Math.PI / 5)); 
        }
        return 0;
    }
    
    public static void main(String[] args) 
    {
        FiguraGeometrica f1 = new FiguraGeometrica();
        FiguraGeometrica f2 = new FiguraGeometrica();
        FiguraGeometrica f3 = new FiguraGeometrica();
        FiguraGeometrica f4 = new FiguraGeometrica();
        FiguraGeometrica f5 = new FiguraGeometrica();
        FiguraGeometrica figura = new FiguraGeometrica();
        
       
        System.out.println("Circulo: " + f1.area(5));
        System.out.println("Rectangulo: " + f2.area(4,6));
        System.out.println("Triangulo Rectangulo: " + figura.area(3, 4, "triangulo")); 
        System.out.println("Trapecio: " + figura.area(3, 5, 4, "trapecio")); 
        System.out.println("Pentagono Regular: " + figura.area(2, "pentagono")); 
    }
    
}

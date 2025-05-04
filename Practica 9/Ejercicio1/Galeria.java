public class Galeria extends Platea {
    public Galeria(int numero, int diasAnticipacion) {
        super(numero, diasAnticipacion);
    }
    
    @Override
    public void calcularPrecio() {
        super.calcularPrecio(); 
        this.precio *= 0.5; 
    }
}

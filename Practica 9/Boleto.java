public abstract class Boleto {
    protected int numero;
    protected double precio;
    
    public Boleto(int numero) {
        this.numero = numero;
    }
    
    public abstract void calcularPrecio();
    
    @Override
    public String toString() {
        return String.format("Numero: %d, Precio: %.1f", numero, precio);
    }
}

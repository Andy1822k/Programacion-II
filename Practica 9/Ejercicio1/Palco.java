public class Palco extends Boleto {
    public Palco(int numero) {
        super(numero);
        calcularPrecio();
    }
    
    @Override
    public void calcularPrecio() {
        this.precio = 100.00;
    }
}

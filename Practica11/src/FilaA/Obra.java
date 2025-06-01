/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FilaA;

/**
 *
 * @author HP
 */
public class Obra {

    protected String titulo;
    protected String material;
    protected Artista a1;
    protected Artista a2;      
    protected Anuncio anuncio; 

    public Obra(String titulo, String material, Artista a1, Artista a2) {
        this.titulo = titulo;
        this.material = material;
        this.a1 = a1;
        this.a2 = a2;
    }

    public void agregarAnuncio(Anuncio anuncio) {
        this.anuncio = anuncio;
    }

    public boolean tieneAnuncio() {
        return anuncio != null;
    }

    public double obtenerPrecio() {
        return tieneAnuncio() ? anuncio.precio : 0;
    }

    public Artista getMasExperiencia() {
        return (a1.aniosExperiencia >= a2.aniosExperiencia) ? a1 : a2;
    }

    public void mostrar() {
        System.out.println("Obra: " + titulo + " | Material: " + material);
        System.out.println("  Artista 1: " + a1.nombre + " (" + a1.aniosExperiencia + " anios)");
        System.out.println("  Artista 2: " + a2.nombre + " (" + a2.aniosExperiencia + " anios)");
        if (tieneAnuncio()) {
            System.out.println("  Anuncio #" + anuncio.numero + " Precio: " + anuncio.precio);
        } else {
            System.out.println("  Sin anuncio");
        }
    }
}

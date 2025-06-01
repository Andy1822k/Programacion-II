/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FilaA;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) {

        Artista art1 = new Artista("Juan", "123456", 8);
        Artista art2 = new Artista("Maria", "789012", 5);

        Pintura pinturaConAnuncio = new Pintura("Atardecer", "Oleo", art1, art2, "Paisaje");
        Pintura pinturaSinAnuncio = new Pintura("Retrato", "Acrilico", art1, art2, "Retrato");

        Anuncio anuncio1 = new Anuncio(1, 1500);
        pinturaConAnuncio.agregarAnuncio(anuncio1);

        System.out.println("=== Estado inicial ===");
        pinturaConAnuncio.mostrar();
        pinturaSinAnuncio.mostrar();

        System.out.println("\nArtista con mas experiencia (pintura 1): " + pinturaConAnuncio.getMasExperiencia().nombre);
        System.out.println("Artista con mas experiencia (pintura 2): " + pinturaSinAnuncio.getMasExperiencia().nombre);

        Anuncio anuncio2 = new Anuncio(2, 900);
        pinturaSinAnuncio.agregarAnuncio(anuncio2);

        double totalVenta = pinturaConAnuncio.obtenerPrecio() + pinturaSinAnuncio.obtenerPrecio();
        System.out.println("\nMonto total de venta de ambas pinturas: " + totalVenta);
    }
}

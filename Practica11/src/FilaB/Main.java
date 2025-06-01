/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FilaB;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Artista art1 = new Artista("Luis", "123", 6);
        Artista art2 = new Artista("Ana", "456", 8);
        Artista art3 = new Artista("Carlos", "789", 5);
        Artista art4 = new Artista("Sofia", "321", 7);

        Pintura pintura1 = new Pintura("Montania", "Oleo", art1, art2, "Paisaje");
        Pintura pintura2 = new Pintura("Mar", "Acrilico", art3, art4, "Marino");

        Anuncio anuncio1 = new Anuncio(1, 2000);
        Anuncio anuncio2 = new Anuncio(2, 1800);

        pintura1.agregarAnuncio(anuncio1);
        pintura2.agregarAnuncio(anuncio2);

        System.out.println("--- Pinturas con anuncio ---");
        pintura1.mostrar();
        System.out.println();
        pintura2.mostrar();

        int totalExp = pintura1.a1.aniosExperiencia + pintura1.a2.aniosExperiencia + pintura2.a1.aniosExperiencia + pintura2.a2.aniosExperiencia;
        double promedioExp = totalExp / 4.0;
        System.out.println("\nPromedio de experiencia: " + promedioExp);

        String nombreBuscado = "Ana";
        double incremento = 500;

        if (pintura1.a1.nombre.equals(nombreBuscado) || pintura1.a2.nombre.equals(nombreBuscado)) {
            pintura1.anuncio.precio += incremento;
        }
        if (pintura2.a1.nombre.equals(nombreBuscado) || pintura2.a2.nombre.equals(nombreBuscado)) {
            pintura2.anuncio.precio += incremento;
        }

        System.out.println("\n--- Precios actualizados ---");
        System.out.println("Pintura 1 - Precio: " + pintura1.obtenerPrecio());
        System.out.println("Pintura 2 - Precio: " + pintura2.obtenerPrecio());
    }
}


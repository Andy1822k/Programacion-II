/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FilaA;

/**
 *
 * @author HP
 */
public class Pintura extends Obra {
    public String genero;

    public Pintura(String titulo, String material, Artista a1, Artista a2, String genero) {
        super(titulo, material, a1, a2);
        this.genero = genero;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("  Genero: " + genero);
    }
}


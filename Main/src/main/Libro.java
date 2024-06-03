package main;
public class Libro {
    // Atributos
    String titulo;
    String autor;
    String genero;
    double precio;

    // Constructor sin parámetros
    public Libro() {
        titulo = "Harry Potter";
        autor = "J. K. Rowling";
        genero = "Fantasía";
        precio = 185.64;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, String genero, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.precio = precio;
    }

    // Métodos
    public void mostrarDetalles() {
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Genero: "+ genero);
        System.out.println("Precio: Q"+ precio);
    }

    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
        System.out.println("Precio actualizado a Q"+precio);
    }
}

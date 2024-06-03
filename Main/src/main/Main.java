
package main;


public class Main {
    public static void main(String[] args) {
        // Crea un objeto 'libro1' utilizando el constructor sin parámetros
        Libro libro1 = new Libro();
        // Crea un objeto 'libro2' utilizando el constructor con parámetros
        Libro libro2 = new Libro();

        // Llama a los métodos 'mostrarDetalles' y 'actualizarPrecio' para 'libro2'
        
        System.out.println("Libro1:");
        libro1.mostrarDetalles();
        System.out.println("Libro2:");
        libro2.mostrarDetalles();
        
        libro2.actualizarPrecio(100.00);
        
        
        
    }
}


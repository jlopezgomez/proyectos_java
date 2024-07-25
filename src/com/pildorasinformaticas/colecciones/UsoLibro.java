package com.pildorasinformaticas.colecciones;

public class UsoLibro {
    public static void main(String[] args) {
        // Crear dos instancias de la clase Libro
        Libro libro1 = new Libro("Gabriel García Márquez", "Cien años de soledad", 123456789);
        Libro libro2 = new Libro("Gabriel García Márquez", "Cien años de soledad", 113456789);
//libro1=libro2;
        // Comparar las dos instancias
        if (libro1.equals(libro2)) {
            System.out.println("Los dos libros son iguales.");
        } else {
            System.out.println("Los dos libros son diferentes.");
            
            System.out.println(libro1.hashCode());
            System.out.println(libro2.hashCode());
        }
    }
}

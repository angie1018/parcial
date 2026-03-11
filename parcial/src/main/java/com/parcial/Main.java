package com.parcial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // libro1 con constructor con parametros
        Libro libro1 = new Libro("Cien Anos de Soledad", "Gabriel Garcia Marquez", 3, 1);

        // libro2 con constructor por defecto y datos por consola
        Scanner scanner = new Scanner(System.in);
        Libro libro2 = new Libro();
        System.out.print("Titulo libro2: ");
        libro2.setTitulo(scanner.nextLine());
        System.out.print("Autor libro2: ");
        libro2.setAutor(scanner.nextLine());
        System.out.print("Numero de ejemplares libro2: ");
        libro2.setNumEjemplares(leerEntero(scanner));
        System.out.print("Numero de ejemplares prestados libro2: ");
        libro2.setNumPrestados(leerEntero(scanner));

        // libroTextoUNIAC con todos sus atributos
        LibroTextoUNIAJC libroTextoUNIAJC = new LibroTextoUNIAJC(
                "Programacion II",
                "Equipo UNIAC",
                5,
                2,
                "POO",
                "Ingenieria"
        );

        // novela con tipo
        Novela novela = new Novela(
                "La Sombra del Viento",
                "Carlos Ruiz Zafon",
                4,
                0,
                TipoNovela.AVENTURAS
        );

        System.out.println("\n--- Objetos creados ---");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libroTextoUNIAJC);
        System.out.println(novela);

        // probar prestamo y devolucion
        System.out.println("\n--- Pruebas de prestamo/devolucion ---");
        System.out.println("Prestamo libro1: " + libro1.prestamo());
        System.out.println("Prestamo libro1: " + libro1.prestamo());
        System.out.println("Devolucion libro1: " + libro1.devolucion());

        scanner.close();
    }

    private static int leerEntero(Scanner scanner) {
        while (true) {
            String linea = scanner.nextLine();
            try {
                return Integer.parseInt(linea.trim());
            } catch (NumberFormatException e) {
                System.out.print("Valor invalido, intenta de nuevo: ");
            }
        }
    }
}

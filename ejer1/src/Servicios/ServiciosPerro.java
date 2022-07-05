package Servicios;

import Entidades.Perro;

import java.util.Scanner;

public class ServiciosPerro {

    public Perro crearPerro() {
        final Scanner read = new Scanner(System.in).useDelimiter("\n");

        Perro p = new Perro();

        System.out.println("Ingrese el nombre de su perro");

        p.setNombre(read.next());

        System.out.println("Ingrese la raza de su perro");

        p.setRaza(read.next());

        System.out.println("Ingrese el tamaño de su perro (Pequeño/Mediano/Grande)");

        p.setTamanio(read.next());

        System.out.println("Ingrese la edad de su perro");

        p.setEdad(read.nextInt());

        return p;
    }

    public void mostrarPerro(Perro p) {

        System.out.println("Nombre: " + p.getNombre());

        System.out.println("Raza: " + p.getRaza());

        System.out.println("Tamaño: " + p.getTamanio());

        System.out.println("Edad: " + p.getEdad());
    }
}


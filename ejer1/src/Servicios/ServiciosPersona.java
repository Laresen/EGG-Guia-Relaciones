package Servicios;

import Entidades.Persona;

import java.util.Scanner;

public class ServiciosPersona {
    private final Scanner read = new Scanner(System.in).useDelimiter("\n");
    private final ServiciosPerro Servp = new ServiciosPerro();
    public Persona crearPersona(){
        Persona p = new Persona();

        System.out.println("Ingrese su nombre");

        p.setNombre(read.next());

        System.out.println("Ingrese su apellido");

        p.setApellido(read.next());

        System.out.println("Ingrese su edad");

        p.setEdad(read.nextInt());

        System.out.println("Ingrese su documento");

        p.setDocumento(read.nextInt());

        System.out.println("-------Ingrese los datos de su mascota-------");

        p.setPerro(Servp.crearPerro());

        return p;

    }
    public void mostrarPersona(Persona p) {

        System.out.println("Nombre: " + p.getNombre());

        System.out.println("Apellido: " + p.getApellido());

        System.out.println("Edad: " + p.getEdad());

        System.out.println("Documento: " + p.getDocumento());

        System.out.println("Los datos de su mascota son: ");

        Servp.mostrarPerro(p.getPerro());

    }
}

package Main;

import Entidades.Persona;
import Servicios.ServiciosPersona;

public class Main {
    public static void main(String[] args) {

        ServiciosPersona ServP = new ServiciosPersona();

        for (int i = 0; i < 2; i++) {

            System.out.println("Persona " + (i + 1));

            Persona p = ServP.crearPersona();

            ServP.mostrarPersona(p);

            System.out.println();
        }

    }
}
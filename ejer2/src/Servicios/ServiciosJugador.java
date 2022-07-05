package Servicios;

import Constantes.Constantes;
import Entidades.Jugador;
import Entidades.Revolver;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosJugador {
    private final ServiciosRevolver ServR = new ServiciosRevolver();

    private final Scanner read = new Scanner(System.in).useDelimiter("\n");

    private final ArrayList<Integer> IDsDisponibles = new ArrayList<>();

    public Jugador crearJugador() {
        Jugador j = new Jugador();

        System.out.println(Constantes.NOMBRE);

        j.setNombre(read.next());

        System.out.println(Constantes.ID);

        int ID = read.nextInt();

        while (ID < 1 || ID > 6 || !idDisponible(ID)) {
            System.out.println(Constantes.ID_INVALIDO);

            ID = read.nextInt();

        }
        System.out.println(Constantes.ID_CORRECTO);
        IDsDisponibles.add(ID);
        return j;
    }

    public boolean disparo(Revolver r, Jugador j){

        boolean seMojo =ServR.mojar(r);

        if (seMojo){

            j.setMojado(true);

        }

        ServR.siguienteChorro(r);
        return seMojo;
    }



    public boolean idDisponible(int nuevoID) {

        for (int idUsado : IDsDisponibles) {
            if (idUsado == nuevoID) {
                return false;
            }
        }
            return true;
    }
}

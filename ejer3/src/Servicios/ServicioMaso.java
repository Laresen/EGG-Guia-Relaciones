/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Carta;
import Entidades.Maso;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author adria
 */
public class ServicioMaso {

    public Maso crearBaraja() {

        ArrayList<Carta> barajaCartas = new ArrayList();

        String[] tipos = {"Espada", "Basto", "Oro", "Copa"};

        Integer[] numeros = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};

        for (String tipoCarta : tipos) {

            for (Integer numeroCarta : numeros) {

                barajaCartas.add(new Carta(tipoCarta, numeroCarta));
            }
        }

        return new Maso(barajaCartas);

    }

    public boolean barajar(ArrayList<Carta> cartasDisponibles) {

        Collections.shuffle(cartasDisponibles);

        return true;

    }

    public Carta siguenCarta(Maso barajaCartas) {

        ArrayList<Carta> cartasDisponibles = barajaCartas.getCartasDisponibles();

        ArrayList<Carta> cartasUsadas = barajaCartas.getCartasUsadas();

        if (cartasDisponibles.isEmpty()) {
            return null;
        }
        Carta cartaActual = cartasDisponibles.get(0);

        cartasDisponibles.remove(0);

        cartasUsadas.add(cartaActual);

        return cartaActual;

    }

    public boolean cartasDisponibles(ArrayList<Carta> cartas) {

        System.out.println("La baraja tiene " + cartas.size() + " cartas disponibles");

        return !cartas.isEmpty();
    }

    public boolean darCartas(Maso barajaCartas, Integer cantidad) {

        ArrayList<Carta> cartasDisponibles = barajaCartas.getCartasDisponibles();

        Carta cartaActual;

        if (cartasDisponibles.size() < cantidad) {
            return false;
        }

        for (int i = 0; i < cantidad; i++) {

            cartaActual = siguienteCarta(barajaCartas);

            System.out.println(cartaActual);
        }

        return true;
    }

    public Carta siguienteCarta(Maso barajaCartas) {

        ArrayList<Carta> cartasDisponibles = barajaCartas.getCartasDisponibles();

        ArrayList<Carta> cartasUsadas = barajaCartas.getCartasUsadas();

        if (cartasDisponibles.isEmpty()) {

            return null;
        }

        Carta cartaActual = cartasDisponibles.get(0);

        cartasDisponibles.remove(0);

        cartasUsadas.add(cartaActual);

        return cartaActual;
    }

    public boolean mostrarMonton(ArrayList<Carta> cartasUsadas) {

        if (cartasUsadas.isEmpty()) {

            return false;
        }

        for (Carta cartaUsada : cartasUsadas) {

            System.out.println(cartaUsada);
        }

        return true;
    }

    public boolean mostrarBaraja(ArrayList<Carta> cartasDisponibles) {

        if (cartasDisponibles.isEmpty()) {

            return false;
        }

        for (Carta cartaUsada : cartasDisponibles) {

            System.out.println(cartaUsada);
        }

        return true;
    }
}

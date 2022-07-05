
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Adri
 */
public class Maso {
    /*Se crea un array de las cartas disponibles*/
    private final ArrayList<Carta> cartasDisponibles;
    /*Se crea un array con las cartas ya usadas*/
    private final ArrayList<Carta> cartasUsadas;
    /*Se trae la clase carta*/
    private Carta cartaActual;

    public Maso(ArrayList<Carta> cartasDisponibles, ArrayList<Carta> cartasUsadas) {
        this.cartasDisponibles = cartasDisponibles;
        this.cartasUsadas = new ArrayList();
    }

    public ArrayList<Carta> getCartasDisponibles() {
        return cartasDisponibles;
    }

    public ArrayList<Carta> getCartasUsadas() {
        return cartasUsadas;
    }

    public Carta getCartaActual() {
        return cartaActual;
    }

    public void setCartaActual(Carta cartaActual) {
        this.cartaActual = cartaActual;
    }




    
}

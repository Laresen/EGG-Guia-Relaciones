/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Carta;
import Entidades.Maso;
import java.util.ArrayList;
import java.util.Scanner;
import Constantes.Constantes;

/**
 *
 * @author Adri
 */
public class Juego {

    private final Scanner read = new Scanner(System.in).useDelimiter("\n");
    private final ServicioMaso ServMaso = new ServicioMaso();

    public void menu() {
        Maso masoActual = ServMaso.crearBaraja();
        ArrayList<Carta> cartasDisponibles = masoActual.getCartasDisponibles();
        ArrayList<Carta> cartasUsadas = masoActual.getCartasUsadas();

        Carta cartaActual;

        System.out.println("¡Que comience el juego!");

        Integer opc, cantidad;

        do {
            System.out.println(Constantes.OPCIONES_DISPONIBLES);
            System.out.println(Constantes.ELEGIR_OPCION);
            opc = read.nextInt();

            switch (opc) {
                case 1:
                    System.out.println(Constantes.BARAJAR);

                    ServMaso.barajar(cartasDisponibles);

                case 2:
                    cartaActual = ServMaso.siguenCarta(masoActual);

                    if (cartaActual != null) {
                        System.out.println(Constantes.MOSTRAR_CARTA + cartaActual);
                    } else {
                        System.out.println(Constantes.BARAJA_VACIA);

                    }
                case 3:
                    ServMaso.cartasDisponibles(cartasUsadas);
                case 4:
                    System.out.println(Constantes.PEDIR_CANTIDAD);

                    cantidad = read.nextInt();

                    if (cantidad > cartasDisponibles.size()) {
                        System.out.println(Constantes.SIN_CARTAS_DISPONIBLES);
                        break;
                    }
                    System.out.println(Constantes.MOSTRAR_CARTAS);

                    ServMaso.darCartas(masoActual, cantidad);
                case 5:
                    if (cartasUsadas.isEmpty()) {
                        System.out.println(Constantes.SIN_CARTAS_MONTON);
                    }

                    System.out.println(Constantes.MOSTRAR_CARTAS_MONTON);
                    ServMaso.mostrarMonton(cartasUsadas);
                case 6:
                    
                      {
                    if (cartasDisponibles.isEmpty()) {

                        System.out.println(Constantes.BARAJA_VACIA);

                        break;
                    }

                    System.out.println(Constantes.MOSTRAR_CARTAS_BARAJA);

                    ServMaso.mostrarBaraja(cartasDisponibles);
                }
            }
            }while (opc != 7);

        }


        
    }


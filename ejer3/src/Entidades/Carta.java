/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author adria
 */
public class Carta {
/**/
    private final String tipo;
    private final Integer numero;

    public Carta(String tipo, Integer numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Cartas{" + "tipo=" + tipo + ", numero=" + numero + '}';
    }
    
    
}

package Entidades;

public class Perro {
    private String nombre;
    private String raza;
    private String tamanio;
    private Integer edad;

    public Perro() {
    }

    public Perro(String nombre, String raza, String tamanio, Integer edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamanio = tamanio;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}

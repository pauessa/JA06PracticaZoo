/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author pauessa
 */
public class Animal {

    private String nombre;
    private String paisOrigen;
    private double peso;
    private int edad;

    public Animal(String nombre, String paisOrigen, double peso, int edad) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.peso = peso;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }
}

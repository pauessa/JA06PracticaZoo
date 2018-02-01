/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author pauessa
 */
import java.util.ArrayList;

public class Zoologico {

    ArrayList<Animal> zoo = new ArrayList<>();

    public Zoologico() {
        zoo = new ArrayList<Animal>();
    }

    public void añadeAnimal(Animal a) {
        zoo.add(a);
    }

    public void mostrar() {
        for (int i = 0; i < zoo.size(); i++) {
            System.out.println("Animal " + i + " : " + zoo.get(i).getNombre() + " " + zoo.get(i).getPaisOrigen() + " " + zoo.get(i).getEdad() + " " + zoo.get(i).getPeso());
        }
    }

    public boolean existeAnimaldelPais(String p) {
        for (int i = 0; i < zoo.size(); i++) {
            if (zoo.get(i).getPaisOrigen().equals(p)) {
                return true;
            }
        }
        return false;

    }

    public double edadPromedio() {
        double promedio = 0;
        int suma = 0;
        for (int i = 0; i < zoo.size(); i++) {
            suma = suma + zoo.get(i).getEdad();
        }
        promedio = suma / zoo.size();
        return promedio;
    }

    public void eliminarAnimales(String p) {
        for (int i = 0; i < zoo.size(); i++) {
            if (zoo.get(i).getPaisOrigen().equals(p)) {
                zoo.remove(i);
            }
        }
    }

    public int cuantosPesanMas(double p) {
        int num = 0;
        for (int i = 0; i < zoo.size(); i++) {
            if (zoo.get(i).getPeso() > p) {
                num++;
            }
        }

        return num;
    }

    public boolean siEsta(Animal a) {
        for (int i = 0; i < zoo.size(); i++) {
            if (zoo.get(i).equals(a)) {
                return true;
            }
        }

        return false;
    }

    public int edadDelPrimero() {
        int edadPrimero = 0;
        edadPrimero = zoo.get(0).getEdad();
        return edadPrimero;

    }

    public double pesoDelUltimo() {
        double pesoDelUltimo = zoo.get(zoo.size() - 1).getPeso();
        return pesoDelUltimo;
    }

    public void remplazaAnimal(Animal a, int posicion) {
        zoo.set(posicion, a);
    }

    public void eliminaAnimal(int posicion) {
        zoo.remove(posicion);
    }

    public void insertarAnimal(Animal a, int posicion) {
        zoo.add(posicion, a);
    }

    public void clausurarZoologico() {
        zoo.clear();
    }

    public boolean zoologicoClausurado() {
        if (zoo.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}

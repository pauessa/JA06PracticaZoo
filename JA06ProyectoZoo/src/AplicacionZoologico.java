/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author pauessa
 */
public class AplicacionZoologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int op = 0;
        Zoologico z = new Zoologico();
        String nombre;
        String pais;
        double peso;
        int edad, pos;

        Animal a;
        do {
            mostrarMenu();
            System.out.println("introduce opcion");
            op = teclado.nextInt();
            teclado.nextLine();
            switch (op) {
                case 1:
                    System.out.println("introduce nombre");
                    nombre = teclado.nextLine();
                    System.out.println("introduce pais");
                    pais = teclado.nextLine();
                    System.out.println("introduce peso");
                    peso = teclado.nextDouble();
                    System.out.println("introduce edad");
                    edad = teclado.nextInt();

                    a = new Animal(nombre, pais, peso, edad);
                    z.añadeAnimal(a);
                    break;
                case 2:
                    System.out.println("introduce pais");
                    pais = teclado.nextLine();
                    System.out.println(z.existeAnimaldelPais(pais));

                    break;
                case 3:
                    System.out.println(z.edadPromedio());

                    break;
                case 4:
                    System.out.println("introduce pais");
                    pais = teclado.nextLine();
                    z.eliminarAnimales(pais);

                    break;
                case 5:
                    System.out.println("introduce peso");
                    peso = teclado.nextDouble();
                    System.out.println(z.cuantosPesanMas(peso));

                    break;
                case 6:
                    System.out.println("introduce nombre");
                    nombre = teclado.nextLine();
                    System.out.println("introduce pais");
                    pais = teclado.nextLine();
                    System.out.println("introduce peso");
                    peso = teclado.nextDouble();
                    System.out.println("introduce edad");
                    edad = teclado.nextInt();

                    a = new Animal(nombre, pais, peso, edad);
                    System.out.println(z.siEsta(a));

                    break;
                case 7:
                    System.out.println(z.edadDelPrimero());

                    break;
                case 8:
                    System.out.println(z.pesoDelUltimo());
                    break;
                case 9:
                    System.out.println("introduce nombre");
                    nombre = teclado.nextLine();
                    System.out.println("introduce pais");
                    pais = teclado.nextLine();
                    System.out.println("introduce peso");
                    peso = teclado.nextDouble();
                    System.out.println("introduce edad");
                    edad = teclado.nextInt();
                    System.out.println("introduce en que posicion quieres replazar en animal");
                    pos = teclado.nextInt();
                    a = new Animal(nombre, pais, peso, edad);
                    z.remplazaAnimal(a, pos);

                    break;
                case 10:
                    System.out.println("introduce en que posicion quieres eliminar en animal");
                    pos = teclado.nextInt();

                    z.eliminaAnimal(pos);
                    break;
                case 11:
                    System.out.println("introduce nombre");
                    nombre = teclado.nextLine();
                    System.out.println("introduce pais");
                    pais = teclado.nextLine();
                    System.out.println("introduce peso");
                    peso = teclado.nextDouble();
                    System.out.println("introduce edad");
                    edad = teclado.nextInt();
                    System.out.println("introduce en que posicion quieres introducir en animal");
                    pos = teclado.nextInt();
                    a = new Animal(nombre, pais, peso, edad);
                    z.insertarAnimal(a, pos);
                    break;
                case 12:
                    z.clausurarZoologico();
                    break;
                case 13:
                    System.out.println(z.zoologicoClausurado());
                    break;

            }

        } while (op != 0);

    }

    public static void mostrarMenu() {
        System.out.println("0.salir");
        System.out.println("1.Introducir Animal");
        System.out.println("2.existe el animal del pais x");
        System.out.println("3.edad promedio de los animales");
        System.out.println("4.elimina animal del pais");
        System.out.println("5.cuantos pesan mas de x");
        System.out.println("6.existe animal");
        System.out.println("7.edad del primero");
        System.out.println("8.peso del ultimo");
        System.out.println("9.remplaza animal");
        System.out.println("10.elimina animal");
        System.out.println("11.insterta animal");
        System.out.println("12.clausura zoologico");
        System.out.println("13.esta clausurado");
    }
}

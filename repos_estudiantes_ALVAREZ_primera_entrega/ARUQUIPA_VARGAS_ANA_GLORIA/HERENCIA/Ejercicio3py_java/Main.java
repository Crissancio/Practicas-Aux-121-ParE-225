package Ejercicio3py_java;

public class Main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[3];

        animales[0] = new Leon("Simba", 5);
        animales[1] = new Pinguino("Pingu", 3);
        animales[2] = new Canguro("Kanga", 4);

        for (Animal animal : animales) {
            animal.desplazarse();
        }
    }
}



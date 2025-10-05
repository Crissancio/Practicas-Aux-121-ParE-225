class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void desplazarse() {
        System.out.println(nombre + " se mueve de forma genérica.");
    }
}

class Leon extends Animal {
    public Leon(String nombre, int edad) {
        super(nombre, edad);
    }

    public void desplazarse() {
        System.out.println(nombre + " camina majestuosa y poderosamente.");
    }
}

class Pinguino extends Animal {
    public Pinguino(String nombre, int edad) {
        super(nombre, edad);
    }

    public void desplazarse() {
        System.out.println(nombre + " nada y se desliza sobre el hielo.");
    }
}

class Canguro extends Animal {
    public Canguro(String nombre, int edad) {
        super(nombre, edad);
    }

    public void desplazarse() {
        System.out.println(nombre + " salta grandes distancias.");
    }
}

public class MainAnimal {
    public static void main(String[] args) {
        Animal a1 = new Leon("Simba", 5);
        Animal a2 = new Pinguino("Pingo", 3);
        Animal a3 = new Canguro("Jack", 6);

        a1.desplazarse();
        a2.desplazarse();
        a3.desplazarse();
    }
}

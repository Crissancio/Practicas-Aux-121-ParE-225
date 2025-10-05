package POLIMORFISMO.EJERCICIO7;

public class Main {
    public static void main(String[] args) {
        // Crear parada con nombre
        Parada p1 = new Parada("Parada Central");

        // Adicionar administradores
        p1.adicionar("Carlos Pérez");
        p1.adicionar("Ana Torres");

        // Adicionar autos
        p1.adicionar("Toyota Corolla", "Luis Soto", "ABC-123");
        p1.adicionar("Nissan Sentra", "María López", "XYZ-789");

        // Mostrar datos
        p1.mostrar();
    }
}


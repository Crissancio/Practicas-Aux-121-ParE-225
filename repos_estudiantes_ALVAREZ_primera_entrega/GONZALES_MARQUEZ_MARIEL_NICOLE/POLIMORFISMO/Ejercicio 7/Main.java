public class Main {
    public static void main(String[] args) {
        Parada p1 = new Parada("Central");
        p1.adicionar("Carlos");
        p1.adicionar("Toyota", "Luis", "123ABC");
        p1.adicionar("Nissan", "Ana", "456XYZ");
        p1.mostrar();
    }
}

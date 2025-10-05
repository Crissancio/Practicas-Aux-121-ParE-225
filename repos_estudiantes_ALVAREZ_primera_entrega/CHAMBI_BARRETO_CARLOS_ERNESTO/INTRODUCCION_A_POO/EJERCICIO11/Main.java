package INTRODUCCION_A_POO.EJERCICIO11;

public class Main {
    public static void main(String[] args){
        Cliente c1 = new Cliente("Kausita", 5);
        System.out.println("Cliente: " + c1.getNombre() + " -- Mesa: " + c1.getMesa());

        // Crear objeto de Pedido
        Pedido p1 = new Pedido("Café Latte", "Registrado");
        System.out.println("Pedido: " + p1.getProducto() + " -- Estado: " + p1.getEstado());
    }
}

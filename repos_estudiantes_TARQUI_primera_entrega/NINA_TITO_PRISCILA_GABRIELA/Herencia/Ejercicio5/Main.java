package PRACTICA1AUXILIATURA.Herencia.Ejercicio5;

public class Main {
    public static void main(String[] args){
        Auto a = new Auto("Juan Perez", "ABC123", 1, 150, true);
        Bus b = new Bus("Maria Gomez", "DEF456", 2, 50, "Sindicato A");
        Moto m = new Moto("Carlos Lopez", "GHI789", 3, 250, true);  
        a.mostrar();
        b.mostrar();
        m.mostrar();
        System.out.println("--- Modificando conductor del auto ---");
        a.setConductor("Luis Martinez");
        a.mostrar();
    }
}

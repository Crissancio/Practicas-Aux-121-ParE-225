package PRACTICA1AUXILIATURA.Herencia.Ejercicio3;

public class Main {
    public static void main(String[] args){
        Leon l = new Leon("Simba", 5);
        Canguro c = new Canguro("Kanga", 3); 
        Pinguino p = new Pinguino("Pingu", 2);
        System.out.println(l.toString());
        System.out.println(c.toString());
        System.out.println(p.toString());
    }
}

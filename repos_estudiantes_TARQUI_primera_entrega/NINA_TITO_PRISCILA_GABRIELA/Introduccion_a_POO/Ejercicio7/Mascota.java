package PRACTICA1AUXILIATURA.Introduccion_a_POO.Ejercicio7;

public class Mascota {
    private String nombre;
    private String tipo;
    private int energia;

    public Mascota(String nombre, String tipo, int energia){
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = energia;
    }
    public void alimentar(){
        if (energia >= 81){
            System.out.println("Si alimenta ahora a su mascota, sobrepasara el limite de energia, por favor juegue con ella primero.");
        } else{     
            energia = energia + 20;
            System.out.println(nombre + " ha sido alimentado, su energia es: " + energia);
        }
    }
    public void jugar(){
        if (energia >= 15){
            energia = energia - 15;
            System.out.println(nombre + " ha jugado, su energia es: " + energia);
        } else{
            System.out.println(nombre + " no tiene suficiente energia para jugar, su energia es de: " + energia + " por favor aliméntelo primero.");
        }
    }
    public String toString(){
        return "Nombre: " + nombre + ", Tipo: " + tipo + ", Energia: " + energia;
    }

    public static void main(String[] args){
        Mascota m1 = new Mascota("Firulais","Perro",50);
        Mascota m2 = new Mascota("Pelusa","Gato",30);
        System.out.println("Al inicio: " + m1.toString());
        m1.jugar();
        m1.alimentar();
        m1.alimentar();
        m1.jugar();
        System.out.println("Al final: " + m1.toString());
        System.out.println("-------------------");
        System.out.println("Al inicio: " + m2.toString());
        m2.jugar();
        m2.jugar();
        m2.jugar();
        m2.alimentar();
        m2.jugar();
        System.out.println("Al final: " + m2.toString());
    }
}

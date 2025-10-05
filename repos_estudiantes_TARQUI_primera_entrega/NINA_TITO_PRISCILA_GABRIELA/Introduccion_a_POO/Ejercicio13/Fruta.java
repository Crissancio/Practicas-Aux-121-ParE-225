package PRACTICA1AUXILIATURA.Introduccion_a_POO.Ejercicio13;

import java.util.Arrays;

/*Ordenar las frutas alfabéticamente según el nombre de sus vitaminas.*/
public class Fruta {
    private String nombre;
    private String tipo;
    private int nroVitaminas;
    private String[] v;

    public Fruta(String nombre, String tipo, int nroVitaminas, String v[]){
        this.nombre = nombre;
        this.tipo = tipo;
        this.nroVitaminas = nroVitaminas;
        this.v = v;
    }
    public int getCantidadVitaminas(){
        return nroVitaminas;
    }
    public String[] mostrarVitaminas(){
        return v;
    }
    public boolean esCitrica(){
        if (tipo.equalsIgnoreCase("Citrica")){
            return true;
        } else{
            return false;
        }
    }
    public String getNombre() {
        return nombre;
    }

    public String[] getVitaminas() {
        return v;
    }

    public static void main(String[] args){
        String v[] = {"A", "B", "C", "D", "E", "K"};
        Fruta f1 = new Fruta("Mandarina", "Citrica", 6, new String[]{"E", "A", "C"});
        Fruta f2 = new Fruta("Naranja ", "Citrica", 6, new String[]{"C", "A"});
        Fruta f3 = new Fruta("Manzana", "Pomácea", 3, new String[]{"E", "D", "A"});
        /*Fruta con mas vitaminas*/
        if (f1.getCantidadVitaminas() > f2.getCantidadVitaminas() && f1.getCantidadVitaminas() > f3.getCantidadVitaminas()){
            System.out.println("La fruta con mas vitaminas es: " + f1.nombre + " con: " + f1.getCantidadVitaminas() + " vitaminas.");
        } else if (f2.getCantidadVitaminas() > f1.getCantidadVitaminas() && f2.getCantidadVitaminas() > f3.getCantidadVitaminas()){
            System.out.println("La fruta con mas vitaminas es: " + f2.nombre + " con: " + f2.getCantidadVitaminas() + " vitaminas.");
        } else {
            System.out.println("La fruta con mas vitaminas es: " + f3.nombre + " con: " + f3.getCantidadVitaminas() + " vitaminas.");   
        }
        /*Mostrar fruta X*/
        String frutaX = "Mandarina";
        if (frutaX.equalsIgnoreCase(f1.nombre)){
            System.out.println("Las vitaminas de la fruta " + frutaX + " son: " + Arrays.toString(f1.mostrarVitaminas()));
        } else if (frutaX.equalsIgnoreCase(f2.nombre)){
            System.out.println("Las vitaminas de la fruta " + frutaX + " son: " + Arrays.toString(f2.mostrarVitaminas()));
        } else if (frutaX.equalsIgnoreCase(f3.nombre)){
            System.out.println("Las vitaminas de la fruta " + frutaX + " son: " + Arrays.toString(f3.mostrarVitaminas()));
        }
        /*Mostrar Frutas Citricas*/
        if (f1.esCitrica()){
            System.out.println("La fruta " + f1.nombre + " es citrica.");
        }
        if (f2.esCitrica()){
            System.out.println("La fruta " + f2.nombre + " es citrica.");
        }
        if (f3.esCitrica()){
            System.out.println("La fruta " + f3.nombre + " es citrica.");
        }
        /*Ordenar las frutas alfabéticamente según el nombre de sus vitaminas*/
        for (Fruta f : new Fruta[]{f1, f2, f3}) {
            Arrays.sort(f.getVitaminas());
            System.out.println("\n Vitaminas de " + f.getNombre() + " ordenadas:");
            for (String ve : f.getVitaminas()) {
                System.out.print("  " + ve);
            }
        } 
    }
}

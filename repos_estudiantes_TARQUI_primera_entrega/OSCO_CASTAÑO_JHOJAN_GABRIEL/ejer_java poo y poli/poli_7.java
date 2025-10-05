package prac1_prog2;
class Admin {
    private String nombre;
    private String id;
    public Admin(String nombre, String id) { this.nombre = nombre; this.id = id; }
    @Override 
    public String toString() { return nombre + " (" + id + ")"; }
}

class Auto {
    private String placa;
    private String modelo;
    private String conductor;
    public Auto(String placa, String modelo, String conductor) {
        this.placa = placa; this.modelo = modelo; this.conductor = conductor;
    }
    @Override public String toString() {
        return placa + " - " + modelo + " - " + conductor;
    }
}

class Registro {
    private Admin[] admins;
    private Auto[][] autos;
    private int nroAdmins = 0;
    private int filasAutos, colsAutos;

    public Registro() {
        this(5, 2, 3); 
    }

    public Registro(int maxAdmins, int filasAutos, int colsAutos) {
        this.admins = new Admin[maxAdmins];
        this.autos = new Auto[filasAutos][colsAutos];
        this.filasAutos = filasAutos;
        this.colsAutos = colsAutos;
    }
    public void adicionar(Admin a) {
        if (nroAdmins < admins.length) {
            admins[nroAdmins++] = a;
        } else {
            System.out.println("No hay espacio para más admins.");
        }
    }
    public void adicionar(String placa, String modelo, String conductor) {
        for (int i = 0; i < filasAutos; i++) {
            for (int j = 0; j < colsAutos; j++) {
                if (autos[i][j] == null) {
                    autos[i][j] = new Auto(placa, modelo, conductor);
                    System.out.println("Auto agregado en [" + i + "][" + j + "]");
                    return;
                }
            }
        }
        System.out.println("No hay espacio para más autos.");
    }

    public void mostrar() {
        System.out.println("Admins:");
        for (int i = 0; i < nroAdmins; i++) {
            System.out.println(" - " + admins[i]);
        }
        System.out.println("Autos:");
        for (int i = 0; i < filasAutos; i++) {
            for (int j = 0; j < colsAutos; j++) {
                System.out.println(" [" + i + "][" + j + "] " + (autos[i][j] == null ? "--" : autos[i][j]));
            }
        }
    }
}

public class poli_7 {
    public static void main(String[] args) {
        Registro r = new Registro();
        r.adicionar(new Admin("Carlos", "A01"));
        r.adicionar(new Admin("Lucia", "A02"));

        r.adicionar("ABC-123", "Toyota", "Pepito");
        r.adicionar("DEF-456", "Nissan", "María");
        r.mostrar();
    }
}



	



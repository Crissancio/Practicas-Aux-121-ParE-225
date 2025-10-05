package PolimorfismoSiete;

public class MainAdministracion {
    public static void main(String[] args) {
        Administracion admin1 = new Administracion();

        Administracion admin2 = new Administracion("Sistema Central");

        System.out.println("Información inicial:");
        admin1.mostrar();
        admin2.mostrar();

        admin2.adicionar("Luis");
        admin2.adicionar("Ana");

        admin2.adicionar("Toyota", "Carlos", "ABC-123");
        admin2.adicionar("Honda", "Maria", "XYZ-789");

        System.out.println("\nInformación después de adicionar:");
        admin2.mostrar();
    }
}

class Administracion {
    private String[] admins;
    private String[][] autos; 
    private String nombreP;
    private int nroAdmins;
    private int nroAutos;

    public Administracion() {
        this.nombreP = "Sin nombre";
        admins = new String[10];
        autos = new String[10][3];
        nroAdmins = 0;
        nroAutos = 0;
    }

    public Administracion(String nombreP) {
        this.nombreP = nombreP;
        admins = new String[10];
        autos = new String[10][3];
        nroAdmins = 0;
        nroAutos = 0;
    }

    public void mostrar() {
        System.out.println("Nombre del proyecto: " + nombreP);
        System.out.println("Admins:");
        for (int i = 0; i < nroAdmins; i++) {
            System.out.println(" - " + admins[i]);
        }
        System.out.println("Autos:");
        for (int i = 0; i < nroAutos; i++) {
            System.out.println(" - Modelo: " + autos[i][0] +
                               ", Conductor: " + autos[i][1] +
                               ", Placa: " + autos[i][2]);
        }
    }

    public void adicionar(String admin) {
        if (nroAdmins < 10) {
            admins[nroAdmins] = admin;
            nroAdmins++;
        } else {
            System.out.println("No se pueden agregar más admins.");
        }
    }

    public void adicionar(String modelo, String conductor, String placa) {
        if (nroAutos < 10) {
            autos[nroAutos][0] = modelo;
            autos[nroAutos][1] = conductor;
            autos[nroAutos][2] = placa;
            nroAutos++;
        } else {
            System.out.println("No se pueden agregar más autos.");
        }
    }
}

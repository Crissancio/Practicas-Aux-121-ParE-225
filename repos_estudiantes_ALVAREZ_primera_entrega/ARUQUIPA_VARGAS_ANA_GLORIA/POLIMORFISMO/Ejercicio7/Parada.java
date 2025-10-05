package Ejercicio7;

public class Parada {
    private String[] admins;
    private String[][] autos;
    private String nombreP;

    private int contadorAdmins = 0;
    private int contadorAutos = 0;

    public Parada() {
        this.nombreP = "Parada Desconocida";
        this.admins = new String[10];
        this.autos = new String[10][3]; 
    }

    public Parada(String nombreP) {
        this.nombreP = nombreP;
        this.admins = new String[10];
        this.autos = new String[10][3];
    }

    public void mostrar() {
        System.out.println("Nombre de la parada: " + nombreP);

        System.out.println("\nAdministradores:");
        for (int i = 0; i < contadorAdmins; i++) {
            System.out.println("- " + admins[i]);
        }

        System.out.println("\nAutos registrados:");
        for (int i = 0; i < contadorAutos; i++) {
            System.out.println("- Modelo: " + autos[i][0] + 
                               ", Conductor: " + autos[i][1] + 
                               ", Placa: " + autos[i][2]);
        }
    }

    public void adicionar(String admin) {
        if (contadorAdmins < 10) {
            admins[contadorAdmins++] = admin;
            System.out.println("Administrador agregado: " + admin);
        } else {
            System.out.println("No se pueden agregar más administradores.");
        }
    }

    public void adicionar(String modelo, String conductor, String placa) {
        if (contadorAutos < 10) {
            autos[contadorAutos][0] = modelo;
            autos[contadorAutos][1] = conductor;
            autos[contadorAutos][2] = placa;
            contadorAutos++;
            System.out.println("Auto agregado: " + modelo + ", " + conductor + ", " + placa);
        } else {
            System.out.println("No se pueden agregar más autos.");
        }
    }
}


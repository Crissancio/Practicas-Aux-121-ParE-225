public class Parada {
    private String[] admins = new String[10];
    private String[][] autos = new String[10][3];
    private String nombreP;
    private int nroAdmins;
    private int nroAutos;

    public Parada() {
        nombreP = "";
        nroAdmins = 0;
        nroAutos = 0;
    }

    public Parada(String nombreP) {
        this.nombreP = nombreP;
        nroAdmins = 0;
        nroAutos = 0;
    }

    public void adicionar(String x) {
        if (nroAdmins < 10) {
            admins[nroAdmins] = x;
            nroAdmins++;
        }
    }

    public void adicionar(String modelo, String conductor, String placa) {
        if (nroAutos < 10) {
            autos[nroAutos][0] = modelo;
            autos[nroAutos][1] = conductor;
            autos[nroAutos][2] = placa;
            nroAutos++;
        }
    }

    public void mostrar() {
        System.out.println("Parada: " + nombreP);
        System.out.println("Administradores:");
        for (int i = 0; i < nroAdmins; i++) {
            System.out.println(" - " + admins[i]);
        }
        System.out.println("Autos:");
        for (int i = 0; i < nroAutos; i++) {
            System.out.println("Modelo: " + autos[i][0] +
                    ", Conductor: " + autos[i][1] +
                    ", Placa: " + autos[i][2]);
        }
    }
}

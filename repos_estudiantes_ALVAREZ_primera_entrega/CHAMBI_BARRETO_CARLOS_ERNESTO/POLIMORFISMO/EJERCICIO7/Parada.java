package POLIMORFISMO.EJERCICIO7;

public class Parada {
    private String[] admins;
    private String[][] autos;
    private String nombreP;
    private int nroAdmins, nroAutos;

    public Parada() {
        this.admins =  new String[10];
        this.autos = new String[10][3];
        this.nombreP = "sin especificaf";
        this.nroAdmins = 0;
        this.nroAutos = 0;
    }
    public Parada(String nombreP) {
        this();
        this.nombreP = nombreP;
    }
    public void mostrar(){
        System.out.println("Parara: "+ nombreP);
        System.out.println("Administradores");
        for (int i = 0 ; i< nroAdmins ; i++){
            System.out.println(admins[i]);
        }
        System.out.println("Autos");
        for(int i = 0 ; i < nroAutos ; i++){
            System.out.println("Modelo: " + autos[i][0] +
                    ", Conductor: " + autos[i][1] +
                    ", Placa: " + autos[i][2]);
        }
        System.out.println("--------------------------");

    }
    public void adicionar(String admin) {
        if (nroAdmins < admins.length) {
            admins[nroAdmins] = admin;
            nroAdmins++;
        } else {
            System.out.println("No se pueden agregar más administradores.");
        }
    }
    public void adicionar(String modelo, String conductor, String placa) {
        if (nroAutos < autos.length) {
            autos[nroAutos][0] = modelo;
            autos[nroAutos][1] = conductor;
            autos[nroAutos][2] = placa;
            nroAutos++;
        } else {
            System.out.println("No se pueden agregar más autos.");
        }
    }
}

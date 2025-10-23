public class Parada {
    private String[] admins;      
    private String[][] autos;     
    private String nombreP;       
    private int nroAdmins;        
    private int nroAutos;        

    public Parada() {
        this.nombreP = "Desconocido";
        this.admins = new String[10];       
        this.autos = new String[50][3];     
        this.nroAdmins = 0;
        this.nroAutos = 0;
    }

    public Parada(String nombreP) {
        this.nombreP = nombreP;
        this.admins = new String[10];
        this.autos = new String[50][3];
        this.nroAdmins = 0;
        this.nroAutos = 0;
    }

    public void mostrar() {
        System.out.println("Parada: " + nombreP);

        System.out.print("Administradores: ");
        for (int i = 0; i < nroAdmins; i++) {
            System.out.print(admins[i] + " ");
        }
        System.out.println();

        System.out.println("Autos:");
        for (int i = 0; i < nroAutos; i++) {
            System.out.println("Placa: " + autos[i][0] + ", Modelo: " + autos[i][1] + ", Año: " + autos[i][2]);
        }
    }

    public void adicionar(String admin) {
        if (nroAdmins < admins.length) {
            admins[nroAdmins] = admin;
            nroAdmins++;
        } else {
            System.out.println("No se pueden agregar más administradores");
        }
    }

    public void adicionar(String placa, String modelo, String año) {
        if (nroAutos < autos.length) {
            autos[nroAutos][0] = placa;
            autos[nroAutos][1] = modelo;
            autos[nroAutos][2] = año;
            nroAutos++;
        } else {
            System.out.println("No se pueden agregar más autos");
        }
    }
}

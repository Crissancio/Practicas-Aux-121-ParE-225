package Ejercicio5;

public class Celular {
    private String nroTel;
    private String dueño;
    private float espacio;  
    private int ram;       
    private int nroApp;

    public Celular(String nroTel, String dueño, float espacio, int ram, int nroApp) {
        this.nroTel = nroTel;
        this.dueño = dueño;
        this.espacio = espacio;
        this.ram = ram;
        this.nroApp = nroApp;
    }

    public void incrementar() {
        this.nroApp += 10;
        System.out.println("Se aumentaron 10 aplicaciones.");
    }

    public void decrementar() {
        if (this.espacio >= 5) {
            this.espacio -= 5;
            System.out.println("Se disminuyeron 5 GB de espacio.");
        } else {
            System.out.println("No hay suficiente espacio para disminuir 5 GB.");
        }
    }

    public void mostrarDatos() {
        System.out.println("Número: " + nroTel);
        System.out.println("Dueño: " + dueño);
        System.out.println("Espacio disponible: " + espacio + " GB");
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Número de apps: " + nroApp);
    }
}


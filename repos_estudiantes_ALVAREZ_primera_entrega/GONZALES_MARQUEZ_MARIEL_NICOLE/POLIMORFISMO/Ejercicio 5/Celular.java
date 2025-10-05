public class Celular {
    private String nroTel;
    private String dueño;
    private int espacio;
    private int ram;
    private int nroApp;

    public Celular(String nroTel, String dueño, int espacio, int ram, int nroApp) {
        this.nroTel = nroTel;
        this.dueño = dueño;
        this.espacio = espacio;
        this.ram = ram;
        this.nroApp = nroApp;
    }

    public void incrementarApps() {
        nroApp += 10;
    }

    public void reducirEspacio() {
        espacio -= 5;
    }

    public void mostrar() {
        System.out.println("Número: " + nroTel);
        System.out.println("Dueño: " + dueño);
        System.out.println("Espacio: " + espacio + "GB");
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Número de Apps: " + nroApp);
        System.out.println();
    }
}

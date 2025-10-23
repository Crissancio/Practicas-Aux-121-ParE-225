public class Main {
    public static void main(String[] args) {
        JefePolicia jefe1 = new JefePolicia("Carlos Pérez", 45, 8500, "Jefe de Unidad", "Coronel", "Antinarcóticos", 20, "Zona Sur");
        JefePolicia jefe2 = new JefePolicia("Luis Gómez", 50, 9200, "Comandante", "Coronel", "Tránsito", 25, "Zona Norte");

        jefe1.mostrarDatos();
        jefe2.mostrarDatos();
        if (jefe1.getSueldo() > jefe2.getSueldo()) {
            System.out.println(" El jefe con mayor sueldo es: " + jefe1.getNombre());
        } else if (jefe2.getSueldo() > jefe1.getSueldo()) {
            System.out.println(" El jefe con mayor sueldo es: " + jefe2.getNombre());
        } else {
            System.out.println(" Ambos tienen el mismo sueldo.");
        }

        if (jefe1.mismoGrado(jefe2)) {
            System.out.println(" Ambos jefes tienen el mismo grado (" + jefe1.getGrado() + ").");
        } else {
            System.out.println(" Los jefes tienen grados diferentes.");
        }

    }
}

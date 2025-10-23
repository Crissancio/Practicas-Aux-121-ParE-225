public class Main {
    public static void main(String[] args) {

        Partido p1 = new Partido("Democracia Unida", "Gobernante");

        Presidente pr1 = new Presidente("Luis", "Mendoza", "Abogado", 15, p1);
        Presidente pr2 = new Presidente("Carla", "Rojas", "Economista", 10, "Progreso Nacional", "Oposición");

        Presidente[] presidentes = new Presidente[3];
        presidentes[0] = pr1;
        presidentes[1] = pr2;
        presidentes[2] = new Presidente("Mario", "Fernández", "Ingeniero", 20, "Renovación Popular", "Independiente");

        for (Presidente p : presidentes) {
            p.mostrar();
        }

        String nombreBuscado = "Carla";
        boolean encontrado = false;
        for (Presidente p : presidentes) {
            if (p.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("🔎 Presidente encontrado:");
                System.out.println("Partido: " + p.getPartido().getNombreP());
                System.out.println("Profesión: " + p.getProfesion());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró al presidente con nombre " + nombreBuscado);
        }
    }
}

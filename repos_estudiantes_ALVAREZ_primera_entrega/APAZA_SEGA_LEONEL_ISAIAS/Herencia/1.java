class Persona {
    protected String nombre;
    protected int ci;

    public Persona(String nombre, int ci) {
        this.nombre = nombre;
        this.ci = ci;
    }
}

class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, int ci, String carrera) {
        super(nombre, ci);
        this.carrera = carrera;
    }

    public void mostrar() {
        System.out.println("Estudiante: " + nombre + " | CI: " + ci + " | Carrera: " + carrera);
    }

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ana López", 123456, "Informática");
        e1.mostrar();
    }
}

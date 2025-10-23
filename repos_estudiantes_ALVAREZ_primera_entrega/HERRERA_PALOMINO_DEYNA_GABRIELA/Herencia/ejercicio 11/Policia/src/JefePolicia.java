class JefePolicia implements Operaciones {
    private int añosExperiencia;
    private String zonaAsignada;
    private Policia policia; 

    public JefePolicia(String nombre, int edad, double sueldo, String cargo, String grado, 
                       String unidad, int añosExperiencia, String zonaAsignada) {
        this.policia = new Policia(nombre, edad, sueldo, cargo, grado, unidad);
        this.añosExperiencia = añosExperiencia;
        this.zonaAsignada = zonaAsignada;
    }

    @Override
    public void mostrarDatos() {
        System.out.println(" Datos del Jefe de Policía ");
        System.out.println("Nombre: " + policia.empleado.persona.nombre);
        System.out.println("Edad: " + policia.empleado.persona.edad);
        System.out.println("Cargo: " + policia.empleado.cargo);
        System.out.println("Grado: " + policia.grado);
        System.out.println("Unidad: " + policia.unidad);
        System.out.println("Sueldo: " + policia.empleado.sueldo);
        System.out.println("Años de experiencia: " + añosExperiencia);
        System.out.println("Zona asignada: " + zonaAsignada);
    }

    @Override
    public boolean mismoGrado(JefePolicia otro) {
        return this.policia.grado.equalsIgnoreCase(otro.policia.grado);
    }

    public double getSueldo() {
        return policia.empleado.sueldo;
    }
    public String getGrado() {
    return policia.grado;
    }
    public String getNombre() {
        return policia.empleado.persona.nombre;
    }
}
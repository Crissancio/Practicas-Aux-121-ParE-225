class Policia {
    protected String grado;
    protected String unidad;
    protected Empleado empleado; 

    public Policia(String nombre, int edad, double sueldo, String cargo, String grado, String unidad) {
        this.empleado = new Empleado(nombre, edad, sueldo, cargo);
        this.grado = grado;
        this.unidad = unidad;
    }
}
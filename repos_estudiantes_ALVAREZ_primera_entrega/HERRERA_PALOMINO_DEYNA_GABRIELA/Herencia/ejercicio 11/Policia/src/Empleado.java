class Empleado {
    protected double sueldo;
    protected String cargo;
    protected Persona persona; 

    public Empleado(String nombre, int edad, double sueldo, String cargo) {
        this.persona = new Persona(nombre, edad);
        this.sueldo = sueldo;
        this.cargo = cargo;
    }
}
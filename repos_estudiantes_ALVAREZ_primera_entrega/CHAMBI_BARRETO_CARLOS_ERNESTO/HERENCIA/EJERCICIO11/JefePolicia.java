package HERENCIA.EJERCICIO11;

public class JefePolicia implements Persona, Empleado, Policia{
    public String nombre, cargo, grado, placa;
    public int edad;
    public double sueldo;

    public JefePolicia(String nombre, String cargo, String grado, String placa, int edad, double sueldo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.grado = grado;
        this.placa = placa;
        this.edad = edad;
        this.sueldo = sueldo;
    }
    @Override
    public String getNombre() { return nombre; }

    @Override
    public int getEdad() { return edad; }

    @Override
    public double getSueldo() { return sueldo; }


    public String getCargo() { return cargo; }

    public String getGrado() { return grado; }

    public String getPlaca() { return placa; }

    public void  mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Sueldo: " + sueldo + ", Cargo: " + cargo + ", Grado: " + grado + ", Placa: " + placa);
    }

}

package PRACTICA_4;

public class EmpleadoTiempoHorario extends Empleado {
    private double horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoTiempoHorario(String nombre, double horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalarioMensual() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public String toString() {
        return "EmpleadoTiempoHorario: Nombre = " + nombre +
                ", Horas trabajadas = " + horasTrabajadas +
                ", Tarifa por hora = " + tarifaPorHora +
                ", Salario Mensual = " + calcularSalarioMensual();
    }
}

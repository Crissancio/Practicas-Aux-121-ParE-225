public class Empleado {
    public  String nombre;
    public float sueldoMes;
    public Empleado(String nombre, float sueldoMes){
        this.nombre=nombre;
        this.sueldoMes=sueldoMes;
    }
    public float sueldoTotal(){
        return sueldoMes;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSueldoMes() {
        return sueldoMes;
    }

}

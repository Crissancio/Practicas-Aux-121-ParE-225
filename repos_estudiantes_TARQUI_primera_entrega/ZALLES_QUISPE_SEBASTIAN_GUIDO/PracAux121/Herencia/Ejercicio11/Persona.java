public class Persona {
    public String nombre;
    public  int edad;
    public  Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarDatos(){
        System.out.println("[ Nombre: "+this.nombre+", edad: "+this.edad);;
    }
}

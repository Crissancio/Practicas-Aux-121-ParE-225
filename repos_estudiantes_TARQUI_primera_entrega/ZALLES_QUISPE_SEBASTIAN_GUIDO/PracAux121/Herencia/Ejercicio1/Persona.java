public class Persona {
    public String nombre;
    public String apellido;
    public String ci;

    public Persona(String nombre, String apellido, String ci){
        this.nombre=nombre;
        this.apellido=apellido;
        this.ci=ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
    public void method(){
        System.out.println("[ Metodo de la clase Persona = nombre: "+this.nombre+", apellido: "+this.apellido+", ci: "+this.ci+" ]");
    }
}

public class Persona {
    protected String nombre;
    protected String paterno;
    protected String materno;
    protected int edad;

    public Persona(String nombre, String paterno, String materno, int edad){
        this.nombre=nombre;
        this.paterno=paterno;
        this.materno=materno;
        this.edad=edad;
    }
    public String getNombre() {
        return nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }
    public int getEdad() {
        return edad;
    }
    public void mostrar(){
        System.out.print("[ La persona es: "+this.nombre+", su apellido paterno es: "+this.paterno+", su apellido materno es: "+this.materno);
    }
}

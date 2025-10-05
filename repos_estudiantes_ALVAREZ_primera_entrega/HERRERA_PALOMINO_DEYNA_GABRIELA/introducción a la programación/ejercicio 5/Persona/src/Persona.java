public class Persona {
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    private int ci;

    public Persona(String nombre,String paterno,String materno,int edad,int ci){
        this.nombre=nombre;
        this.paterno=paterno;
        this.materno=materno;
        this.edad=edad;
        this.ci=ci;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Paterno: "+paterno);
        System.out.println("Materno: "+materno);
        System.out.println("Edad: "+edad);
        System.out.println("CI: "+ci);
    }
    public void mayorEdad(){
        if(edad>=18){
            System.out.println(nombre+" es mayor de edad");
        }
        else{
            System.out.println(nombre+" es menor de edad");
        }
    }
    public void modificarEdad(int nuevo){
        this.edad=nuevo;
        System.out.println("Edad modificada:"+nuevo);
    }
    public String verificarApellido(Persona otra) {
    if (this.paterno.equals(otra.paterno)) {
        return "Los apellidos son iguales";
    } else {
        return "Los apellidos son diferentes";
    }
}
}
public class Persona {
    public String nombre, paterno, materno;
    public int edad, ci;

    public Persona(String nombre, String paterno, String materno, int edad, int ci ){
        this.nombre=nombre;
        this.paterno=paterno;
        this.materno=materno;
        this.edad=edad;
        this.ci=ci;
    }

    public void mostrarDatos(){
        System.out.println("[ Nombre: "+ this.nombre+ ", apellido paterno: "+this.paterno+ ", apellido materno: "+this.materno+ ", edad: "+ this.edad+ ", C.I. :"+ this.ci+" ]");
    }
    public void mayorDeEdad(){
        if(this.edad>=18){
            System.out.println("[ Es mayor de edad ]");
        }
        else{
            System.out.println("[ No es mayor de edad ]");
        }
    }
    public void modificarEdad(int nuevo){
        this.edad=nuevo;
        System.out.println("Cambiando edad.....");
        System.out.println("[ La nueva edad es: "+nuevo+" ]");
    }

    @Override
    public boolean equals(Object o) {
        Persona persona= (Persona) o;
        String paterno1 = ((Persona) o).paterno;
        if(this.paterno.equals(paterno1)){
            System.out.println("[ Las personas tienen el mismo apellido paterno ]");
            return true;
        }
        else{
            System.out.println("[ Las dos personas no tienen el mismo apellido paterno ]");
            return false;
        }
    }
    public static void main(String[]args){
        System.out.println(" Persona 1 :  ");
        Persona persona1=new Persona("Sebastian Guido", "Zalles", "Quispe", 18, 12861170);
        persona1.mayorDeEdad();
        persona1.mostrarDatos();
        persona1.modificarEdad(20);
        System.out.println(" Persona 2 :  ");
        Persona persona2=new Persona("Ronnald ALvaro", "Silva", "Guzaman", 40, 47464649);
        persona2.mayorDeEdad();
        persona2.mostrarDatos();
        persona2.modificarEdad(47);
        System.out.println("---------------");
        persona1.equals(persona2);
    }

}

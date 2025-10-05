public class Docente extends Persona{
    private double sueldo;
    private String regProfecional;
    public Docente(String nombre, String paterno, String materno, int edad, double sueldo, String regProfecional){
        super(nombre, paterno, materno, edad);
        this.sueldo=sueldo;
        this.regProfecional=regProfecional;
    }

    @Override
    public void mostrar() {
        System.out.println("----------------");
        System.out.println("     Docente    ");
        System.out.println("----------------");
        super.mostrar();
        System.out.println(", es un docente, su sueldo es de:"+this.sueldo+" bs. y su regProfecional es: "+this.regProfecional+" ]");
    }
}

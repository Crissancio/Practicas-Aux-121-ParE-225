public class Estudiante extends Persona{
    private int ru;
    private int matricula;
    public Estudiante(String nombre, String paterno, String materno, int edad, int ru, int matricula){
        super(nombre, paterno, materno, edad);
        this.ru=ru;
        this.matricula=matricula;
    }
    @Override
    public void mostrar() {
        System.out.println("----------------");
        System.out.println("   Estudiante   ");
        System.out.println("----------------");
        super.mostrar();
        System.out.println(", es un estudiante, su r.u. es: "+this.ru+" y su matricula es: "+this.matricula +" ]");
    }
    public void promedio(Estudiante estudiante2){
        double promedio=(this.edad+ estudiante2.edad)/2;
        System.out.println("EL promedio de la edad de los estudiantes es: "+promedio);
    }
    public void modificarEdad(int edad){
        this.edad=edad;
        System.out.println("Se modifico la edad de un estudiante, la nueva edad es: "+this.edad);
    }
}

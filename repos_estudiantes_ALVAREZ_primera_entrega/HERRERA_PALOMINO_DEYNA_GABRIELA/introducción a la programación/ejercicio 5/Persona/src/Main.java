public class Main{
    public static void main(String[] args) {
        Persona per1=new Persona("Juan", "Rojas", "Torres", 20, 124552);
        Persona per2=new Persona("Lucy", "Dominguez", "Carrasco", 17,7854865);

        per1.mostrarDatos();
        per2.mostrarDatos();
        per1.mayorEdad();
        per2.mayorEdad();
        per2.modificarEdad(20);
        per1.verificarApellido(per2);
    }
}
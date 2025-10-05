public class Canguro extends Animal{
    public Canguro(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void desplazarce() {
        System.out.println("[ El animal: "+nombre+", con una edad de: "+edad+" años, se desplaza: saltando ]");
    }
}

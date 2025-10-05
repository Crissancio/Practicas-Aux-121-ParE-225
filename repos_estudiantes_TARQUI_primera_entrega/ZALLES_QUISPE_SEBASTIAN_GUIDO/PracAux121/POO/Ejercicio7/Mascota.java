public class Mascota {
    private String nombre, tipo;
    private int energia;

    public Mascota(String nombre, String tipo, int energia){
        this.nombre=nombre;
        this.tipo=tipo;
        this.energia=energia;
    }
    public void alimentar(){
        this.energia=this.energia+20;
        if(this.energia>=100){
            this.energia=100;
        }
        System.out.println("Se alimento a "+ this.nombre);
    }
    public void jugar(){
        this.energia=this.energia-15;
        if(this.energia<=0){
            this.energia=0;
        }
        System.out.println("Hicimos jugar a "+ this.nombre);
    }

    @Override
    public String toString() {
        return "[ la energia de "+ this.nombre+" el/la "+this.tipo+" es :"+ this.energia+ " ]";
    }

    public static void main(String[]args){
        System.out.println("-----------");
        System.out.println("Mascota 1 :");
        System.out.println("-----------");
        Mascota mascota1= new Mascota("Papu", "perro", 70);
        mascota1.alimentar();
        System.out.println(mascota1);
        mascota1.jugar();
        System.out.println(mascota1);
        mascota1.alimentar();
        System.out.println(mascota1);
        System.out.println("----------");
        System.out.println("Mascota 2:");
        System.out.println("----------");
        Mascota mascota2= new Mascota("Saskya", "gato", 40);
        mascota2.alimentar();
        System.out.println(mascota2);
        mascota2.alimentar();
        System.out.println(mascota2);
        mascota2.jugar();
        System.out.println(mascota2);
    }
}

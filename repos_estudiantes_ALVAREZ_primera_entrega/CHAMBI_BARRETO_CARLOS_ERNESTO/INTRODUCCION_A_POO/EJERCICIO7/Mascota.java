package INTRODUCCION_A_POO.EJERCICIO7;

public class Mascota {
    public String nombre, tipo;
    public int energia;

    public Mascota(String nombre, String tipo, int energia){
        this.nombre= nombre;
        this.tipo=tipo;
        this.energia=energia;
    }
    public void alimentar(){
        energia += 20;
        if(energia>100){
            energia=100;
        }
        System.out.println("La energia es: " + energia );
    }
    public void jugar(){
        energia -= 15;
        if(energia<0){
            energia=0;
        }
        System.out.println("Energia: " + energia);
    }
}


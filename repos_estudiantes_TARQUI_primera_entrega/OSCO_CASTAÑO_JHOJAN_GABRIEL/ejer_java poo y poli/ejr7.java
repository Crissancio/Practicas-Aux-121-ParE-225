package prac1_prog2;

public class ejr7 {
	    public static void main(String[] args) {
	        Mascota m1 = new Mascota("Firulais");
	        Mascota m2 = new Mascota("Michi");
	        m1.alimentar();   
	        m1.jugar();      
	        m2.jugar();      
	        m2.alimentar();   
	    }
	}

	class Mascota {
	    private String nombre;
	    private int energia;
	    public Mascota(String nombre) {
	        this.nombre = nombre;
	        this.energia = 50;
	    }

	    public void alimentar() {
	        energia = Math.min(energia + 20, 100);
	        System.out.println(nombre + " fue alimentada. Energía: " + energia);
	    }
	    public void jugar() {
	        energia = Math.max(energia - 15, 0);
	        System.out.println(nombre + " jugó. Energía: " + energia);
	    }
	    public void mostrarEnergia() {
	        System.out.println("Energía de " + nombre + ": " + energia);
	    }
	}





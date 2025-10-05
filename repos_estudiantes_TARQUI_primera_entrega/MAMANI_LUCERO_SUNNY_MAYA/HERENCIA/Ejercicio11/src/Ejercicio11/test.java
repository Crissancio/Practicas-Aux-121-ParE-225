package Ejercicio11;

public class test {
////d) Implementar usando interfaces en java
	public static void main(String[] args) {
		
        JefePolicia j1 = new JefePolicia("Luis", 45, 6000, 20,"Capitán", "Tránsito","Zona Norte", 120);
        JefePolicia j2 = new JefePolicia("María", 40, 7200, 15,"Mayor", "Investigaciones","Zona Sur", 200);
        j1.mostrar();
        j2.mostrar();
        //b) Mostrar el nombre de aquel que tiene mayor sueldo.
        j1.mayorSueldo(j2);
        //c) Comparar si ambos tienen mismo grado
        System.out.println(j1.tieneMismoGrado(j2));

	}

}

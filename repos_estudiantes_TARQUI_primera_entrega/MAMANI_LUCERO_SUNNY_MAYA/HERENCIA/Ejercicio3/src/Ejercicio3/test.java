package Ejercicio3;

public class test {
	public static void main(String[] args) {
		Animal a1=new Leon("Mufasa",3);
		Animal a2=new Pinguino("Mumble",4);
		Animal a3=new Canguro("Kanga",5);
		Animal[] animales= {a1,a2,a3};
		for (int i=0;i<animales.length;i++) {
			animales[i].desplazarse();
		}
					
	}
}

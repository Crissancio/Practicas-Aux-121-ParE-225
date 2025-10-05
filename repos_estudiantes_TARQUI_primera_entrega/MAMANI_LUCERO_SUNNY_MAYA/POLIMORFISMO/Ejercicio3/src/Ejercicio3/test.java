package Ejercicio3;

public class test {
	public static void main(String[] args) {
		float[][] y= {{1f,2f,3f,4f},{3f,4f,5f,6f}};
		Matriz matriz1=new Matriz();
		Matriz matriz2=new Matriz(y);
		Matriz matriz3=new Matriz(y);
		System.out.println(matriz1);
		System.out.println(matriz1.igual(matriz2));
		Matriz m=matriz2.sumar(matriz3);
		System.out.println(m);
		

		
		
		
	}
}

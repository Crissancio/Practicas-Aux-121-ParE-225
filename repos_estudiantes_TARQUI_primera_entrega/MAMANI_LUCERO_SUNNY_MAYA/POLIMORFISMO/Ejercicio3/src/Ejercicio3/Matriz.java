package Ejercicio3;
//Ejercicio 3. Sea la clase Matriz(float matriz[10][10])
public class Matriz {
	public float[][] matriz=new float[10][10];
	//a) Implementar un constructor para instanciar un objeto con valores
	//predeterminados(matriz identidad)
	public Matriz(){
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				if (i==j) {
					this.matriz[i][j]=1f;
				}else {
					this.matriz[i][j]=0f;
				}
			}
			
		}
	}
	//b) Implementar un constructor para Instanciar un objeto matriz
	public Matriz(float[][] m) {
		this.matriz=m;
	}
	//c) Implementar los metodos para sumar(Matriz matriz) y restar(Matriz matriz)
	public Matriz sumar(Matriz m) {
		int x=this.matriz.length;
		int y=this.matriz[0].length;
		if(x==m.matriz.length && y==m.matriz[0].length) {
			float[][] s=new float[x][y];
			for(int i=0;i<x;i++) {
				for(int j=0;j<y;j++) {
					s[i][j]=this.matriz[i][j]+m.matriz[i][j];
				}
			}
			return new Matriz(s);
		}else {
			System.out.println("no se puede sumar");
			return null;
		}
				
		
	}
	public Matriz restar(Matriz m) {
		int x=this.matriz.length;
		int y=this.matriz[0].length;
		if(x==m.matriz.length && y==m.matriz[0].length) {
			float[][] s=new float[x][y];
			for(int i=0;i<x;i++) {
				for(int j=0;j<x;j++) {
					s[i][j]=this.matriz[i][j]-m.matriz[i][j];
				}
			}
			return new Matriz(s);
		}else {
			System.out.println("no se puede restar");
			return null;
		}
	}
	//d) Implementar un método igual(Matriz matriz
	public boolean igual(Matriz m) {
		int x=this.matriz.length;
		int y=this.matriz[0].length;
		boolean s=true;
		if(x==m.matriz.length && y==m.matriz[0].length) {
			for(int i=0;i<x;i++) {
				for(int j=0;j<x;j++) {
					if(this.matriz[i][j]!=m.matriz[i][j]) {
						s=false;
						break;
					}
				}
			}
			return s;
		}else {
			return false;
		}
				
		
	}

	public String toString() {
		String s="";
		for(int i=0;i<this.matriz.length;i++) {
			for(int j=0;j<this.matriz[0].length;j++) {
				s+=" "+this.matriz[i][j];
			}
			s+="\n";
		}
		return s;
	}
	
}

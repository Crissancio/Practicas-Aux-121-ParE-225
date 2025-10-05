package Ejercicio7;
//Ejercicio 7. Dado el siguiente diagrama de clases:
public class Parada {
	private String[] admins=new String[10];
	private String[][] autos=new String[10][3];
	private String nombreP="Sin nombre";
	//a) crear dos constructores uno por defecto y otro pidiendo datos.
	public Parada() {}
	public Parada(String[] admins,String[][] autos,String nombreP) {
		for(int i=0;i<admins.length;i++) {
			this.admins[i]=admins[i];
		}
		for(int i=0;i<autos.length;i++) {
			for(int j=0;j<3;j++) {
				this.autos[i][j]=autos[i][j]; 
			}
		}
		this.nombreP=nombreP;
	}
	//b) crear el método mostrar.
	public void mostrar() {
		System.out.println("NOMBRE:"+this.nombreP);
		System.out.println("ADMINISTRADORES");
		int i=0;
		while(this.admins[i]!=null) {
			System.out.println(this.admins[i]);
			i+=1;
		}
		System.out.println("AUTOS");
		i=0;
		while(this.autos[i][0]!=null && this.autos[i][1]!=null && this.autos[i][2]!=null ) {
			System.out.println("Modelo: "+this.autos[i][0]+" ;Conductor: "+this.autos[i][1]+" ;6+Placa: "+this.autos[i][2]);
			i+=1;
		}
	}
	//c) crear el método adicionar(x) que adicione un admin .
	public void adicionar(String x) {
		for(int i=0;i<10;i++) {
			if(this.admins[i]==null) {
				this.admins[i]=x;
				break;
			}
		}
	}
	//d) crear el método adicionar (x,y,z) que adicione un auto.
	public void adicionar(String x,String y,String z) {
		for(int i=0;i<10;i++) {
			if(this.autos[i][0]==null && this.autos[i][1]==null && this.autos[i][2]==null) {
				this.autos[i][0]=x;
				this.autos[i][1]=y;
				this.autos[i][2]=z;
				break;
			}
		}
	}

}

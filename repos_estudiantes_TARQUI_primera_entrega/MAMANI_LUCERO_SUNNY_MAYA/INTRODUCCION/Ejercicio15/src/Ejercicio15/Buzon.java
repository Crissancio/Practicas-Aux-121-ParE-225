package Ejercicio15;

public class Buzon {
	public int nro;
	public int nroC;
	public String[][] c=new String[50][3];
	public Buzon(int nro,int nroC,String[][] c) {
		this.nro=nro;
		this.nroC=nroC;
		for(int i=0;i<nroC;i++) {
			for(int j=0;j<3;j++) {
				this.c[i][j]=c[i][j];
			}
		}
		
	}
	public void agregar(String c,String d,String r) {
		for(int i=0;i<50;i++) {
			if(this.c[i][0]==null && this.c[i][1]==null && this.c[i][2]==null) {
				this.c[i][0]=c;
				this.c[i][1]=d;
				this.c[i][2]=r;
				this.nroC+=1;
				break;
			}
		}
	}
	
	public int contarDes(String X) {
		int c=0;
		for(int i=0;i<this.nroC;i++) {
			if(this.c[i][2]==X) {
				c+=1;
			}
		}
		if (c==0) {
			System.out.println("no hay cartas para este destinatario en el buzon"+this.nro);
		}
		return c;
	}
	public void eliminar(String X) {
		boolean b=false;
		for(int i=0;i<this.nroC;i++) {
			if(c[i][0]==X) {
				b=true;
			}
			if(b==true && i!=49) {
				c[i]=c[i+1];
			}
		}
		if(b==false) {
			System.out.println("esa carta no esta en este buzon");
		}else {
			this.nroC-=1;
		}
	}
	public String deQuien(String X) {
		String b = "";
		for(int i=0;i<this.nroC;i++) {
			if(c[i][2]==X) {
				b+=X+" recivio una carta de"+ c[i][1]+"\n";
			}
	}
		if(b!="") {
			return b;
		}else {
			return String.format("no recibio ninguna carta en el buzon %d",this.nro);
		}
	}
	public String toString() {
	    String texto="Contenido del Buzón "+nro+":\n";

	    for (int i=0;i<nroC;i++) {
	        texto+="  Carta "+(i + 1) + ": ";
	        texto+="[Código: "+c[i][0];
	        texto+=", Remitente: "+c[i][1];
	        texto+=", Destinatario: "+c[i][2]+"]\n";
	    }

	    return texto;
	}
}

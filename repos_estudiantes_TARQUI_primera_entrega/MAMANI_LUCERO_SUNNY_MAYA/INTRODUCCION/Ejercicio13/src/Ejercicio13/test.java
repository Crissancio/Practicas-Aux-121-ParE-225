package Ejercicio13;

public class test {
	public static void main(String[] args) {
		//a) Instanciar de 3 maneras diferentes 3 frutas con al menos 2 vitaminas cada una.
		Fruta fruta1=new Fruta("Kiwi","subtropical",3,new String[]{"K","C","E"});
		Fruta fruta2=new Fruta("Manzana","templada",2,new String[]{"C","A"});
		Fruta fruta3=new Fruta("Naranja","citrica",2,new String[]{"C","A"});
		Fruta[] frutas= {fruta1,fruta2,fruta3};
		//b) Verificar cuál es la fruta con más vitaminas.
		int m=0;
		int f = 0;
		for (int i=0;i<3;i++) {
			if (frutas[i].getNroVits()>m) {
				m=frutas[i].getNroVits();
				f=i;
			}
		}
		System.out.println("la fruta con mas vitaminas es "+frutas[f].getNombre()+" que tiene "+m+" vitaminas");
		//c) Mostrar las vitaminas que tiene la fruta x.
		fruta2.vitaminas();
		//d) Cuantas vitaminas son cítricas.
		int c=0;
		for (int i=0;i<3;i++) {
			if (frutas[i].getTipo()=="citrica") {
				c+=1;
			}
		}
		System.out.println(c+" son frutas citricas");
		//e) Ordenar las frutas alfabéticamente según el nombre de sus vitaminas.
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (frutas[i].getNombre().compareToIgnoreCase(frutas[j].getNombre()) > 0) {
                    Fruta temp = frutas[i];
                    frutas[i] = frutas[j];
                    frutas[j] = temp;
                }
            }
        }
        for (int i=0;i<3;i++) {
        	System.out.println(frutas[i].getNombre());
        }
        
	}
	
}

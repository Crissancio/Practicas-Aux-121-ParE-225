package Ejercicio15;

public class test {
	public static void main(String[] args) {
		//a) Instanciar 3 buzones diferentes, cada uno con al menos 3 cartas.
		//b) Instanciar 3 cartas con sus respectivas descripciones.
		Carta carta1=new Carta("C123","Querida madre,te escribo para avisarte que las flores que dejaste se marchitaron");
		Carta carta2=new Carta("C456","Querido hermano,te escribo para agradecerte por los libros que mandaste");
		Carta carta3=new Carta("C789","Querido padre,te escribo en razon de avisarte que el paquete de ropa no llego");
		Carta carta4 = new Carta("C107", "Querida tía, te escribo para contarte que el jardín floreció como nunca este año.");
		Carta carta5 = new Carta("C108", "Querido abuelo, te escribo para agradecerte las historias que siempre me inspiran.");
		Carta carta6 = new Carta("C109", "Querida hermana, te escribo para avisarte que encontré la bufanda que dejaste en mi casa.");
		Carta carta7 = new Carta("C110", "Querido amigo, te escribo para contarte que aprobé el examen que tanto me preocupaba.");
		Carta carta8 = new Carta("C111", "Querida prima, te escribo para avisarte que la bicicleta ya está reparada y lista para usar.");
		Carta carta9 = new Carta("C112", "Querido amigo, te escribo para felicitarte por tu esfuerzo y dedicación en la escuela.");
		Buzon buzon1=new Buzon(1,3,new String[][] {{carta1.codigo,"Juan Alvarez","Celia Aliaga"},{carta2.codigo,"Pepe Mujica","Wilmer Perez"},{carta3.codigo,"Paty Vasques","Wilmer Perez"}});
		Buzon buzon2=new Buzon(2,3,new String[][] {{carta4.codigo,"Ricardo Fernández","Julia Mendoza"},{carta5.codigo,"Patricia Núñez","Wilmer Perez"},{carta6.codigo,"Andrés Castillo","Paula Jiménez"}});
		Buzon buzon3=new Buzon(3,3,new String[][] {{carta7.codigo,"Laura Martínez","Javier Castillo"},{carta8.codigo,"Roberto Delgado","Elena Vargas"},{carta9.codigo,"Valeria Soto","Ricardo Fernández"}});
		//c) Verificar cuántas cartas recibió el destinatario “X”.
		Buzon[] buzones= {buzon1,buzon2,buzon3};
		int c=0;
		String X="Wilmer Perez";
		for(int i=0;i<buzones.length;i++) {
			c+=buzones[i].contarDes(X);
		}
		System.out.println("hay "+c+" cartas para el destinatario "+X+ " en los buzones");
		//d) Eliminar la carta de la matriz cuyo código sea “X”.
		buzon2.eliminar("C107");
		System.out.println(buzon2);
		//e) Verificar si algún remitente ha recibido alguna carta y, en ese caso, indicar de quién.
		String Y="Wilmer Perez";
		for(int i=0;i<buzones.length;i++) {
			System.out.println(buzones[i].deQuien(Y));
		}
		//f) Buscar una palabra clave (por ejemplo, "amor") en las descripciones de las cartas instanciadas.
		//g) Por cada coincidencia, mostrar el código, remitente y destinatario correspondientes.
		Carta[] cartas= {carta1,carta2,carta3,carta4,carta5,carta6,carta7,carta8,carta9};
		String Z="amigo";
		for(int i=0;i<cartas.length;i++) {
			if(cartas[i].descrpcion.contains(Z)) {
				for(int j=0;j<buzones.length;j++) {
					if(cartas[i].estaEn(buzones[j])) {
						System.out.println(cartas[i].getDatos(buzones[j]));
					}
				}
			}
		}
		
	}

}

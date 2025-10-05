package Ejercicio15;
//Ejercicio 15. Se requiere modelar la información de los ordenadores en los laboratorios
//“Lasin”.
//Cada ordenador tiene código serial, número, memoria RAM, procesador y estado (activo o
//inactivo).
//Cada laboratorio se identifica por nombre, capacidad, cantidad de ordenadores y
//mantiene un registro de los códigos seriales de sus ordenadores.
//Realiza lo siguiente:
public class Laboratorio {
    private String nombre ;
    private int capacidad;
    private String[] registroSeriales;


    public Laboratorio(String nombre, int capacidad,String[] seriales) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.registroSeriales=new String[capacidad];
        for(int i = 0 ;i<seriales.length;i++) {
        	this.registroSeriales[i]=seriales[i];
        }
        
    }

    public String getNombre() { 
    	return nombre; }
    public String[] getSeriales() { 
    	return registroSeriales; }
    
    public boolean contieneSerial(String serial) {
        for (int i=0; i <capacidad; i++) {
            if (serial.equals(registroSeriales[i])) {
            	return true;
            }
        }
        return false;
    }
    public boolean adicionarSerial(String serial) {

        for (int i = 0; i < capacidad && registroSeriales[i] != null; i++) {
            if (serial.equals(registroSeriales[i])) {
                System.out.println("Serial " + serial + " ya está registrado en " + nombre);
                return false;
            }
        }
        for (int i = 0; i < capacidad; i++) {
            if (registroSeriales[i] == null) {
                registroSeriales[i] = serial;
                return true;
            }
        }
        System.out.println("No hay espacio en " + nombre + " para registrar el serial: " + serial);
        return false;
    }
    public boolean quitarSerial(String serial) {
        for (int i = 0; i < capacidad; i++) {
            if (serial.equals(registroSeriales[i])) {
                for (int j = i; j < capacidad - 1; j++) {
                    registroSeriales[j] = registroSeriales[j + 1];
                }
                registroSeriales[capacidad - 1] = null;
                return true;
            }
        }
        return false; 
    }
    public void mostrar() {
        System.out.println("LABORATORIO: "+nombre);
        System.out.println("SERIALES REGISTRADOS:");
        int i=0;
        while (i<capacidad && registroSeriales[i]!=null) {
            System.out.println("Serial: "+registroSeriales[i]);
            i++;
        }
    }
}

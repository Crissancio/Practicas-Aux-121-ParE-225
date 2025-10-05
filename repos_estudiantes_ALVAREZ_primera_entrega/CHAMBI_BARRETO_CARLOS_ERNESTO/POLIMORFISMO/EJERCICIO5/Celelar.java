package POLIMORFISMO.EJERCICIO5;

public class Celelar {
    public String nombre, dueño;
    public int nroApp, nroTel, espacio;

    public Celelar(String nombre, String dueño,int nroTel, int nroApp, int espacio){
        this.nombre=nombre;
        this.dueño=dueño;
        this.nroApp=nroApp;
        this.espacio=espacio;
        this.nroTel = nroTel;

    }
    public void Incrementar(){
        this.nroApp +=10;
    }
    public void Disminuir(){
        this.espacio -= 5;
        if(this.espacio < 0 ){
            this.espacio=0;
        }
    }
    public void mostrar(){
        System.out.println("Propetario: " + dueño);
        System.out.println("Numero de telefono:  " + nroTel);
        System.out.println("Número App: " + nroApp);
        System.out.println("Aplicacion: " + nombre);
        System.out.println("Espacio: " + espacio + " GB");
        System.out.println("*********************************");
    }

}

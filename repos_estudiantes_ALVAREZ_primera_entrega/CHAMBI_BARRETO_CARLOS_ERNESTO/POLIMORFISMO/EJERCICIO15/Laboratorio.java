package POLIMORFISMO.EJERCICIO15;

public class Laboratorio {
    public String nombre;
    public int capacidad, cantidad;
    Ordenador[] ordenadores;

    public Laboratorio(String nombre, int capacidad){
        this.nombre=nombre;
        this.capacidad=capacidad;
        this.ordenadores = new Ordenador[capacidad];

    }

    public void agregarOrdenador(Ordenador o ){
        for(int i = 0 ; i < capacidad ; i++){
            if(ordenadores[i] == null){
                ordenadores[i] = o;
                break;
            }
        }
    }

    // LOS METODO SE DEBEN LLAMAR INFORMACION()
    public void mostrarEstado(){
        System.out.println("Laboratorio: " + nombre);
        for(Ordenador o : ordenadores){
            if(o != null){
                System.out.println("PC: " + o.numero + " =");
                System.out.println(o.estado ? "Activo" : "Inactivo");
            }
        }
    }

    public void MostrarTodos(){
        System.out.println("Laboratorio: " + nombre);
        for(Ordenador o : ordenadores){
            if(o != null){
                o.mostrar();
            }
        }
    }

    public void mostrarMayorRAM(){
        System.out.println("Laboratorio: " + nombre + "con las pc con mas de 8 de ram");
        for(Ordenador o : ordenadores){
            if(o != null && o.ram > 0){
                o.mostrar();
            }
        }
    }
    // SIN METODO PARA PASAR COMPUTADORAS ENTRE LABORATORIO
}

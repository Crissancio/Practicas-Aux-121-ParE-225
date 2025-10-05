package PRACTICA1AUXILIATURA.Introduccion_a_POO.Ejercicio15;

public class Carta {
    private String codigo;
    private String descripcion;

    public Carta (String codigo, String descripcion){
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
    public String getCodigo() {
        return codigo;
    }
    public boolean buscarPalabraClave(String palabraClave){
        if(descripcion.contains(palabraClave)){
            return true;
        }
        else {
            return false;
        }
    }
}

/**
* 
* Clase Abstracta Empleado.
* @author Helen Pérez Condori
* @version 1.0 30/09/2025
*
*/

package lb_4;
public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }   
    public abstract double CalcularSalarioMensual();

    @Override
    public String toString() {
        return "Empleado [" + "nombre=" + nombre + ']';
    }
    
    
    
}

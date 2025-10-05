public class Jefe extends Persona{
    public  String sucursal;
    public String tipo;

    public Jefe(String nombre, String apellido, String ci, String sucursal, String tipo){
        super(nombre,apellido,ci);
        this.sucursal=sucursal;
        this.tipo=tipo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void method() {
        System.out.println("[ Metodo de la clase Jefe = nombre: "+nombre+", apellido: "+apellido+", ci: "+ci+", sucursal: "+this.sucursal+", tipo: " +this.tipo+" ]");
    }
}

public class Carta{
    private String codigo;
    private String descripcion;

    public Carta(String codigo, String descripcion){
        this.codigo=codigo;
        this.descripcion=descripcion;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void mostrar(){
        System.out.println("codigo: "+codigo+"Descripcion: "+descripcion);
    }
}
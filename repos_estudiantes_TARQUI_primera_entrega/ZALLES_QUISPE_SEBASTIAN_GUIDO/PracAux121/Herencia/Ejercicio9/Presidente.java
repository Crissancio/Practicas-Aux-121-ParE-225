public class Presidente {
    public String nombre;
    public String apellido;
    public Politico politico;
    public Partido partido;
    public Presidente(String nombre, String apellido, Politico politico, Partido partido){
        this.nombre=nombre;
        this.apellido=apellido;
        this.politico=politico;
        this.partido=partido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Politico getPolitico() {
        return politico;
    }
    public Partido getPartido(){
        return partido;
    }
}

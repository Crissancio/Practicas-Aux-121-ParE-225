public class Pedido{
    private String estado;
    private boolean disponible;
    private String turnoEmpleado;

    public Pedido(String estado, boolean disponible, String turnoEmpleado){
        this.turnoEmpleado=turnoEmpleado;
        this.estado=estado;
        this.disponible=disponible;
    }
    public String getEstado(){
        return estado;
    }
    public void setEstado(){
        this.estado=estado;
    }
    public boolean getDisponible(){
        return disponible;
    }
    public void setDisponoible(){
        this.disponible=disponible;
    }
    public String getTurnoEmpleado(){
        return turnoEmpleado;
    }
    public void setTurnoEmpleado(){
        this.turnoEmpleado=turnoEmpleado;
    }
    @Override
    public String toString() {
        return "Pedido [Estado: " + estado +
               ", Disponible: " + (disponible ? "Sí" : "No") +
               ", TurnoEmpleado: " + turnoEmpleado + "]";
    }
    
}
public class JefePolicia extends Persona implements Empleado,Policia{
    public double sueldo;
    public String puesto;
    public String grado;
    public String arma;
    public String departamento;
    public int aniosDeServicio;

    public JefePolicia(String nombre, int edad, double sueldo, String puesto,String grado,String arma,String departamento,int aniosDeServicio){
        super(nombre,edad);
        this.sueldo=sueldo;
        this.puesto=puesto;
        this.grado=grado;
        this.arma=arma;
        this.departamento=departamento;
        this.aniosDeServicio=aniosDeServicio;
    }

    @Override
    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String getPuesto() {
        return puesto;
    }
    @Override
    public String getGrado() {
        return grado;
    }
    public String getArma(){
        return arma;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println( ", sueldo: "+sueldo+", puesto: "+puesto+", grado: "+grado+", arma: "+arma+", departamento: "+departamento+", años de servicio: "+aniosDeServicio);
    }
}

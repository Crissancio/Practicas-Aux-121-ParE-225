public class Empleado {
    public int id;
    public String nombre;
    public String rol;

    public Empleado(int id, String nombre, String rol){
        this.id=id;
        this.nombre=nombre;
        this.rol=rol;
    }
    public Empleado(){
        this.id=id;
        this.nombre=nombre;
        this.rol=rol;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getRol() {
        return rol;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "[ El numero del empleado es: "+this.id+", su nombre es: "+this.nombre+", su rol es: "+this.rol+" ]";
    }
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("|  Empleado 1  |");
        System.out.println("----------------");
        Empleado empleado1= new Empleado(1,"Juan Enrique Perez Mendoza","tomar pedidos");
        System.out.println(empleado1);
        System.out.println("----------------");
        System.out.println("|  Empleado 2  |");
        System.out.println("----------------");
        Empleado empleado2= new Empleado();
        empleado2.setId(2);
        empleado2.setNombre("Manuel Fernando Velazquez Mayta");
        empleado2.setRol("tomar pedidos");
        System.out.println(empleado2);
        System.out.println("----------------");
        System.out.println("|  Empleado 3  |");
        System.out.println("----------------");
        Empleado empleado3= new Empleado(3,"Marcelo Ronnald Silva Arequipa","prepara los pedidos");
        System.out.println("[ El numero del empleado es: "+empleado3.getId()+", su nombre es: "+empleado3.getNombre()+", su rol es: "+empleado3.getRol()+" ]");
    }
}

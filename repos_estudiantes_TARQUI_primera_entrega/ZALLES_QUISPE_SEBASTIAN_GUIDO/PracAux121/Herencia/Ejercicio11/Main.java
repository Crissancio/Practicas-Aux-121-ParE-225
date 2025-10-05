public class Main {
    public static void main(String[]args){
        JefePolicia jefePolicia1=new JefePolicia("Ademar",23,22000,"teniente","Suboficial Superior","Ak47","La Paz",4);
        JefePolicia jefePolicia2=new JefePolicia("Cristian",24,20000,"coronel","oficial Superior","pistola","Santa Cruz",5);
        jefePolicia1.mostrarDatos();
        jefePolicia2.mostrarDatos();

        if(jefePolicia1.getSueldo()>jefePolicia2.getSueldo()){
            System.out.println("El jefe con mayor sueldo es: "+jefePolicia1.getNombre());
        }
        else{
            if(jefePolicia1.getSueldo()<jefePolicia2.getSueldo()){
                System.out.println("El jefe con mayor sueldo es: "+jefePolicia2.getNombre());
            }
            else {
                System.out.println("Ambos tienen el mismo sueldo");
            }
        }
        if(jefePolicia1.getGrado()==jefePolicia2.getGrado()){
            System.out.println("Ambos tienen el mismo grado: "+jefePolicia1.getGrado());
        }
        else{
            System.out.println("Ambos tienen el distintos grado: "+jefePolicia1.getGrado()+" y "+jefePolicia2.getGrado());
        }

    }
}

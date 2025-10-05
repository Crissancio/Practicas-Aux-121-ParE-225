public class Main {
    public static void main(String[]args){
        Politico politico1=new Politico("Economista",10);
        Partido partido1=new Partido("Libre","Presidente");
        Presidente presidente1=new Presidente("Jorge","Quiroga Ramirez",politico1,partido1);

        Presidente presidente2=new Presidente("Rodrigo","Paz Pereira",new Politico("Politico",20),new Partido("Democrata Cristiano","Presidente"));
        Presidente presidente3=new Presidente("Evo","Morales Ayma",new Politico("Politico",10),new Partido("MAS","presidente"));
        System.out.println("[ Presidente 1: :"+presidente1.getNombre()+" "+presidente1.getApellido()+", su profecion es: "+presidente1.getPolitico().getProfecion()+", y su partido es: "+presidente1.getPartido().getNombreP()+" ]");
        System.out.println("[ Presidente 2: :"+presidente2.getNombre()+" "+presidente2.getApellido()+", su profecion es: "+presidente2.getPolitico().getProfecion()+", y su partido es: "+presidente2.getPartido().getNombreP()+" ]");

        Presidente[] presidentes= new Presidente[3];
        presidentes[0]=presidente1;
        presidentes[1]=presidente2;
        presidentes[2]=presidente3;

        String buscarPresi="Evo";
        for (Presidente presi:presidentes){
            if (presi.getNombre().equalsIgnoreCase(buscarPresi)){
                System.out.println("----------------------");
                System.out.println("Buscando un presidente");
                System.out.println("----------------------");
                System.out.println("Presidente encontrado: "+ presi.getNombre()+" "+presi.getApellido());
                System.out.println("Su partido politico es: "+presi.getPartido().getNombreP()+" y su rol es: "+presi.getPartido().getRol());
                System.out.println("Su profecion es: "+presi.getPolitico().getProfecion()+" y sus años de experiencia son: "+presi.getPolitico().getAñosExp());
            }
        }
    }
}

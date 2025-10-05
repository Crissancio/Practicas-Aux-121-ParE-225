import java.util.*;
public class Fruta {
    private String nombre;
    private String tipo;
    private int nroVitaminas;
    String[] v = new String[30];
    public Fruta(String nombre,String tipo, String[] vitaminas){
        this.nombre=nombre;
        this.tipo=tipo;
        this.nroVitaminas=vitaminas.length;
        System.arraycopy(vitaminas,0,this.v,0,vitaminas.length);
    }
    public void mostrarVitaminas() {
        System.out.print("[ Vitaminas de " + nombre + ":");
        for (int i = 0; i < nroVitaminas; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println(" ]");
    }

    @Override
    public String toString() {
        return "[ La fruta es: "+this.nombre+", su tipo es: "+this.tipo+" ]";
    }

    public static void main(String[]args){
        Fruta kiwi=new Fruta("Kiwi","subtropical",new String[]{"K","C","E"});
        Fruta naranja=new Fruta("naranja","citrica",new String[]{"C","A"});
        Fruta mango=new Fruta("mango","tropical",new String[]{"A","C","E","B6"});
        ArrayList<Fruta>frutas=new ArrayList<>();
        frutas.add(kiwi);
        frutas.add(naranja);
        frutas.add(mango);
        System.out.println("-------");
        System.out.println("Fruta 1");
        System.out.println("-------");
        System.out.println(kiwi);
        System.out.println("-------");
        System.out.println("Fruta 2");
        System.out.println("-------");
        System.out.println(naranja);
        System.out.println("-------");
        System.out.println("Fruta 3");
        System.out.println("-------");
        System.out.println(mango);
        System.out.println("-------");
        Fruta conMasVitaminas= frutas.get(0);
        for (Fruta f: frutas){
            if (f.nroVitaminas> conMasVitaminas.nroVitaminas){
                conMasVitaminas=f;
            }
        }
        System.out.print("[ Fruta con mas vitaminas: "+conMasVitaminas.nombre+" con "+conMasVitaminas.nroVitaminas+" vitaminas ] ");

        String frutaX="mango";
        for(Fruta f:frutas){
            if(f.nombre.equalsIgnoreCase(frutaX)){
                f.mostrarVitaminas();
                break;
            }
        }
        int totalVitaminarCitricas=0;
        for(Fruta f:frutas){
            for (int i=0;i<f.nroVitaminas;i++){
                if(f.v[i].equalsIgnoreCase("C")){
                    totalVitaminarCitricas++;
                }
            }
        }
        System.out.println("[ La cantidad total de vitaminas citricas (vitamina C) es: "+totalVitaminarCitricas);

        Collections.sort(frutas, new Comparator<Fruta>() {
            @Override
            public int compare(Fruta f1, Fruta f2) {
                String[] vit1= Arrays.copyOfRange(f1.v,0,f1.nroVitaminas);
                String[] vit2= Arrays.copyOfRange(f2.v,0,f2.nroVitaminas);
                Arrays.sort(vit1);
                Arrays.sort(vit2);
                String s1= String.join("",vit1);
                String s2= String.join("",vit2);
                return s1.compareTo(s2);
            }
        });
        System.out.println("Frutas ordenadas segun el nobmre de sus vitaminas: ");
        for (Fruta f: frutas){
            System.out.print(f.nombre+":");
            String[] vit= Arrays.copyOfRange(f.v,0,f.nroVitaminas);
            Arrays.sort(vit);
            for (String vitamina: vit){
                System.out.print(vitamina+" ");
            }
            System.out.println();
        }
    }
}

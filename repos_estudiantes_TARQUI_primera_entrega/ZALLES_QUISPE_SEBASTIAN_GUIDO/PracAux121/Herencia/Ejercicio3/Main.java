public class Main {
    public static void main(String[]args){
        System.out.println("--------");
        System.out.println("Animal 1");
        System.out.println("--------");
        Leon leon=new Leon("leon", 10);
        leon.desplazarce();
        System.out.println("--------");
        System.out.println("Animal 2");
        System.out.println("--------");
        Pinguino pinguino=new Pinguino("pinguino",5);
        pinguino.desplazarce();
        System.out.println("--------");
        System.out.println("Animal 3");
        System.out.println("--------");
        Canguro canguro=new Canguro("canguro",7);
        canguro.desplazarce();
    }
}

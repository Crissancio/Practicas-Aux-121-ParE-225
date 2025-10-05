package ejercicio;
public class Ejercicio {

    public static void main(String[] args) {
        miEntero n1 = new miEntero(7);
        System.out.println(n1.get());
        System.out.println(n1.esPar());
        System.out.println(n1.esImpar());
        System.out.println(n1.esPrimo());

        miEntero n2 = new miEntero(10);
        System.out.println(n2.get());
        System.out.println(n2.esPar());
        System.out.println(n2.esImpar());
        System.out.println(n2.esPrimo());

        System.out.println("Metodos estaticos int");
        System.out.println(miEntero.esPar(6));
        System.out.println(miEntero.esImpar(5));
        System.out.println(miEntero.esPrimo(7));

        System.out.println("Metodos estaticos MiEntero");
        System.out.println(miEntero.esPar(n1));
        System.out.println(miEntero.esImpar(n1));
        System.out.println(miEntero.esPrimo(n1));

        System.out.println("Metodos equals y parseInt");
        miEntero n3 = new miEntero(123);
        System.out.println(n3.equals(123));
        System.out.println(n3.equals(new miEntero(123)));
        System.out.println(miEntero.parseInt(new char[] {'1','2','3'}));
        System.out.println(miEntero.parseInt("456"));

    }
    
}

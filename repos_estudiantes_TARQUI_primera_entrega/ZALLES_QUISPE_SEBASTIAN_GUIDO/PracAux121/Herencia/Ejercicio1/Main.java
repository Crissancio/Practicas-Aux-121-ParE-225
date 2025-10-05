public class Main {
    public static void main(String[]args){
        Persona persona=new Persona("Cristian","Lopez","93878223");
        Cliente cliente=new Cliente("Juan","Perez","12341478","22","12");
        Jefe jefe=new Jefe("Alessandro","Challapa","56156326","Hipermaxi","Mercado");
        persona.method();
        cliente.method();
        jefe.method();
    }
}

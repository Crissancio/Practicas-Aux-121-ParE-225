public class Triatleta implements Nadador,Ciclista,Corredor{
    public String estiloNatacion;
    public String tipoBicicleta;
    public int distanciaPreferida;
    public  Triatleta(String estiloNatacion, String tipoBicicleta, int distanciaPreferida){
        this.estiloNatacion=estiloNatacion;
        this.tipoBicicleta=tipoBicicleta;
        this.distanciaPreferida=distanciaPreferida;
    }
    public void nadar() {
        System.out.println("Nadando estilo: "+estiloNatacion);
    }

    @Override
    public void pedalear() {
        System.out.println("Peadleando en bicicleta tipo: "+tipoBicicleta);
    }

    @Override
    public void correr() {
        System.out.println("Corriendo una distancia de: "+distanciaPreferida+" km");
    }
    public static void main(String[]args){
        System.out.println("---------");
        System.out.println("Triatleta");
        System.out.println("---------");
        Triatleta triatleta=new Triatleta("crol","montaña",5);
        triatleta.nadar();
        triatleta.pedalear();
        triatleta.correr();
    }
}

public class Buzon{
    private int nro;
    private int nroC;
    private String C[][];

   public Buzon(int nro, int nroc) {
        this.nro = nro;
        this.C = new String[50][3]; 
        this.nroC = 0;
    }
    public void agregarCarta(Carta carta, String remitente, String destinatario){
        if (nroC<50){
            C[nroC][0]=carta.getCodigo();
            C[nroC][1]=remitente;
            C[nroC][2]=destinatario;
            nroC++;
        }
        else {
            System.out.println("el buzon"+nro+"esta lleno");
        }
    }
    public void mostrarCartas(){
        System.out.println("Buzon"+ nro);
        for (int i=0; i<nroC;i++){
            System.out.println("Codigo"+C[i][0]+"Remitente"+C[i][1]+"Destinatario"+C[i][2]);
        }
    }
    public void verCantCartDestX(String destinatarioX){
        int cont=0;
        for (int i=0;i<nroC;i++){
            if(this.C[i][2].equals(destinatarioX)){
                cont++;
            }
        }
        if (cont > 0) {
            System.out.println("El destinatario " + destinatarioX + " tiene " + cont + " cartas.");
        } 
        else{
            System.out.println("no se encontro al destinatario x");
        }
    }
    public void eliminarCartaCodigo(String codigox){
        boolean encontrado=false;
        for(int i=0;i<nroC;i++){
            if(C[i][0].equals(codigox)){
                encontrado=true;
                for (int j = i; j < nroC - 1; j++) {
                C[j][0] = C[j + 1][0];
                C[j][1] = C[j + 1][1];
                C[j][2] = C[j + 1][2];
            }
            C[nroC - 1][0] = null;
            C[nroC - 1][1] = null;
            C[nroC - 1][2] = null;
            nroC--;
            System.out.println("Carta "+codigox+"eliminada");
            }
        }
        if(!encontrado){
            System.out.println("no se encontro "+codigox);
        }
    }
    public void veriRemiCartaDest(String remitenteX){
        boolean encon=false;
        for (int i=0;i<nroC;i++){
            if(C[i][2]!=null&&C[i][2].equals(remitenteX)){
                encon=true;
                System.out.println("el remitente= "+remitenteX+" recibio una carta de "+C[i][1]);
            }
        }
        if(!encon){
            System.out.println("no se encontro");
        }
    }



}
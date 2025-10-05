// a) y b) Clase Matriz
public class Matriz{
    private float[][] matriz;

    // a) 
    public Matriz(){
        matriz=new float[10][10];
        for(int i=0;i<10;i++){
            matriz[i][i]=1;
        }
    }

    // b)
    public Matriz(float[][] valores){
        matriz=new float[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                matriz[i][j]=valores[i][j];
            }
        }
    }

    // c)
    public Matriz sumar(Matriz otra){
        Matriz resultado=new Matriz();
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                resultado.matriz[i][j]=this.matriz[i][j]+otra.matriz[i][j];
            }
        }
        return resultado;
    }

    // c) 
    public Matriz restar(Matriz otra){
        Matriz resultado=new Matriz();
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                resultado.matriz[i][j]=this.matriz[i][j]-otra.matriz[i][j];
            }
        }
        return resultado;
    }

    // d) 
    public boolean igual(Matriz otra){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(this.matriz[i][j]!=otra.matriz[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public void mostrar(){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }

    // d) 
    public static void main(String[] args){
        Matriz m1=new Matriz();
        Matriz m2=new Matriz();
        Matriz m3=m1.sumar(m2);
        System.out.println("Suma:");
        m3.mostrar();
        System.out.println("Son iguales m1 y m2? "+m1.igual(m2));
    }
}

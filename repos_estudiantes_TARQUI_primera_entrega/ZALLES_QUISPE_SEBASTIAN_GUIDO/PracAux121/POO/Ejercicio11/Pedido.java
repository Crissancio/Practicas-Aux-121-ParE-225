public class Pedido {
    public int id;
    public String estado;
    public String productos;

    public Pedido(int id, String estado, String productos){
        this.id=id;
        this.estado=estado;
        this.productos=productos;
    }
    public Pedido(){
        this.id=id;
        this.estado=estado;
        this.productos=productos;
    }
    public int getId() {
        return id;
    }
    public String getEstado(){
        return estado;
    }

    public String getProductos() {
        return productos;
    }

    public void setId(int id) {
        this.id=id;
    }
    public void setEstado(String estado){
        this.estado= estado;
    }
    public void setProductos(String productos){
        this.productos=productos;
    }

    @Override
    public String toString() {
        return "[ El pedido es el numero: "+this.id+", su estado es: "+this.estado+", los productos son: "+this.productos+" ]";
    }

    public static void main(String[]args){;
        System.out.println("--------------");
        System.out.println("|  Pedido 1  |");
        System.out.println("--------------");
        Pedido pedido= new Pedido(1, "registrado","Cafe claiente y pastel horneado");
        System.out.println(pedido);
        System.out.println("--------------");
        System.out.println("|  Pedido 2  |");
        System.out.println("--------------");
        Pedido pedido2= new Pedido();
        pedido2.setId(2);
        pedido2.setEstado("preparado");
        pedido2.setProductos("Pie de manzana y te caliente");
        System.out.println(pedido2);
        System.out.println("--------------");
        System.out.println("|  Pedido 3  |");
        System.out.println("--------------");
        Pedido pedido3= new Pedido(3,"entregado","Sandwich y cafe americano");
        System.out.println("El pedido es el numero: "+pedido3.getId()+", su estado es: "+pedido3.getEstado()+", los productos son: "+pedido3.getProductos());
    }

}

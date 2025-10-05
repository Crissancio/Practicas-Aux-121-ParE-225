package Ejercicio11;

public class test {
	public static void main(String[] args) {
		//c) Crea un objeto por cada clase y muéstralo
		Empleado empleado=new Empleado("Larry","mesero");
		Pedido pedido=new Pedido(new String[]{"biste","malteada"});
		System.out.println(empleado);
		System.out.println(pedido);
		pedido.setEstado("preparado");
		empleado.setRol("cocinero");
		System.out.println(empleado);
		System.out.println(pedido);
		pedido.cancelar();
		empleado.despedir();
		System.out.println(empleado);
		System.out.println(pedido);
	}
}

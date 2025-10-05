package PolimorfismoQuince;

class Ordenador {
 private String codigoSerial;
 private int numero;
 private int memoriaRAM;
 private String procesador;
 private boolean activo;

 public Ordenador(String codigoSerial, int numero, int memoriaRAM, String procesador, boolean activo) {
     this.codigoSerial = codigoSerial;
     this.numero = numero;
     this.memoriaRAM = memoriaRAM;
     this.procesador = procesador;
     this.activo = activo;
 }

 public String getCodigoSerial() {
     return codigoSerial;
 }

 public int getMemoriaRAM() {
     return memoriaRAM;
 }

 public boolean isActivo() {
     return activo;
 }

 public void setActivo(boolean activo) {
     this.activo = activo;
 }

 public String informacion() {
     return "Código: " + codigoSerial +
            " | Número: " + numero +
            " | RAM: " + memoriaRAM + "GB" +
            " | Procesador: " + procesador +
            " | Estado: " + (activo ? "Activo" : "Inactivo");
 }
}

class Laboratorio {
 private String nombre;
 private int capacidad;
 private int cantidad;
 private Ordenador[] ordenadores;

 public Laboratorio(String nombre, int capacidad) {
     this.nombre = nombre;
     this.capacidad = capacidad;
     this.ordenadores = new Ordenador[capacidad];
     this.cantidad = 0;
 }

 public void agregarOrdenador(Ordenador o) {
     if (cantidad < capacidad) {
         ordenadores[cantidad++] = o;
     } else {
         System.out.println("Capacidad máxima alcanzada en " + nombre);
     }
 }

 public void informacion() {
     System.out.println("Laboratorio: " + nombre);
     for (int i = 0; i < cantidad; i++) {
         System.out.println(ordenadores[i].informacion());
     }
     System.out.println("-----------------------------------");
 }

 public void informacion(boolean activo) {
     System.out.println("Ordenadores en " + nombre + " con estado " + (activo ? "Activo" : "Inactivo"));
     for (int i = 0; i < cantidad; i++) {
         if (ordenadores[i].isActivo() == activo) {
             System.out.println(ordenadores[i].informacion());
         }
     }
     System.out.println("-----------------------------------");
 }

 public void informacion(int ramMinima) {
     System.out.println("Ordenadores en " + nombre + " con más de " + ramMinima + "GB RAM");
     for (int i = 0; i < cantidad; i++) {
         if (ordenadores[i].getMemoriaRAM() > ramMinima) {
             System.out.println(ordenadores[i].informacion());
         }
     }
     System.out.println("-----------------------------------");
 }

 public String getNombre() {
     return nombre;
 }

 public Ordenador[] getOrdenadores() {
     return ordenadores;
 }

 public int getCantidad() {
     return cantidad;
 }

 public void setCantidad(int cantidad) {
     this.cantidad = cantidad;
 }





}

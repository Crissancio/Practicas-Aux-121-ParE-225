package ejercicio;
public class miEntero {
    private int valor;
    public miEntero(int valor) {
        this.valor = valor;
    }
    public int get() {
        return valor;
    }
    public boolean esPar() {
        return valor % 2 == 0;
    }

    public boolean esImpar() {
        return valor % 2 != 0;
    }

    public boolean esPrimo() {
        if (valor < 2) return false;
        for (int i = 2; i <= Math.sqrt(valor); i++) {
            if (valor % i == 0) return false;
        }
        return true;
    }
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    public static boolean esImpar(int n) {
        return n % 2 != 0;
    }

    public static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static boolean esPar(miEntero obj) {
        return obj.get() % 2 == 0;
    }

    public static boolean esImpar(miEntero obj) {
        return obj.get() % 2 != 0;
    }
        public static boolean esPrimo(miEntero obj) {
        int v = obj.get();
        if (v < 2) return false;
        for (int i = 2; i <= Math.sqrt(v); i++) {
            if (v % i == 0) return false;
        }
        return true;
    }
        public boolean equals(int n) {
        return valor == n;
    }
        public boolean equals(miEntero obj) {
        return valor == obj.get();
    }
        public static int parseInt(char[] chars) {
        return Integer.parseInt(new String(chars));
    }
        public static int parseInt(String str) {
        return Integer.parseInt(str);
    }    
}

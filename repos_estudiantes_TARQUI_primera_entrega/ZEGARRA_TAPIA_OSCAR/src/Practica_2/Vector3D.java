package Practica_2;

public class Vector3D {
    private double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D operar(Vector3D b) {
        return new Vector3D(this.x + b.x, this.y + b.y, this.z + b.z);
    }

    public Vector3D operarResta(Vector3D b) {
        return new Vector3D(this.x - b.x, this.y - b.y, this.z - b.z);
    }

    public Vector3D operar(double escalar) {
        return new Vector3D(this.x * escalar, this.y * escalar, this.z * escalar);
    }

    public double modulo() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public Vector3D normal() {
        double mod = this.modulo();
        if (mod == 0) return new Vector3D(0, 0, 0); // Evitar división por cero
        return new Vector3D(x/mod, y/mod, z/mod);
    }

    public double productoEscalar(Vector3D b) {
        return this.x * b.x + this.y * b.y + this.z * b.z;
    }

    public Vector3D productoCruz(Vector3D b) {
        return new Vector3D(
                this.y * b.z - this.z * b.y,
                this.z * b.x - this.x * b.z,
                this.x * b.y - this.y * b.x
        );
    }

    public Vector3D proyeccionSobre(Vector3D b) {
        double escalar = this.productoEscalar(b) / b.productoEscalar(b);
        return b.operar(escalar);
    }

    public double componenteEn(Vector3D b) {
        return this.productoEscalar(b) / b.modulo();
    }

    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}

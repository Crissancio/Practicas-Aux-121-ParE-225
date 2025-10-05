package HERENCIA.EJERCICIO9;

public class Partido {
    public String nombreP, rol;

    public Partido(String nombreP, String rol) {
        this.nombreP = nombreP;
        this.rol = rol;
    }
    public String getRol(){
        return rol;
    }

    public String getNombreP() {
        return nombreP;
    }
}

package HERENCIA.EJERCICIO9;

public class Politico {
    public String profesion;
    public int añosExp;

    public Politico(String profesion, int añosExp){
        this.profesion=profesion;
        this.añosExp=añosExp;
    }

    public String getProfesion(){
        return profesion;
    }

    public int getAñosExp() {
        return añosExp;
    }
}

public class Politico {
    protected String profesion;
    protected int añosExp;

    public Politico(String profesion, int añosExp) {
        this.profesion = profesion;
        this.añosExp = añosExp;
    }

    public String getProfesion() {
        return profesion;
    }

    public int getAñosExp() {
        return añosExp;
    }
}

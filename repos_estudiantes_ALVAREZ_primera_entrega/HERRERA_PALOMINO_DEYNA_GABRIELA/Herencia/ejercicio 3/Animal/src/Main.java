public class Main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[3];

        animales[0] = new Leon("leo", 5);
        animales[1] = new Pinguino("Pingu", 3);
        animales[2] = new Canguro("coco", 7);

        for (Animal a : animales) {
            a.desplazarse();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Mp4 mp = new Mp4("Sony", 2.0);

        mp.addCancion("Back To Black", "Amy Winehouse", "100");
        mp.addCancion("Lost On You", "LP", "150");

        mp.addVideo("Heathens", "twenty one pilots", "50");
        mp.addVideo("Harmonica Andromeda", "KSHMR", "70");
        mp.addVideo("Without Me", "Halsey", "30");

        mp.mostrar();

        System.out.println("\n--- Borrando canción por nombre ---");
        mp.borrar("Lost On You");
        mp.mostrar();

        System.out.println("\n--- Añadiendo nueva canción ---");
        mp.addCancion("Rolling In The Deep", "Adele", "200");
        mp.mostrar();
    }
}

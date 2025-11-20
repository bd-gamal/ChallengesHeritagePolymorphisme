public class Main {
    public static void main(String[] args) {

        Forme[] formes = {
                new Cercle(4),
                new Rectangle(4, 6)

        };

        for (Forme f : formes) {
            System.out.println("Aire = " + f.calculerAire());
        }
    }
}

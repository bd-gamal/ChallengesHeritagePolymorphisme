import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Animal> animaux = new ArrayList<>();
        animaux.add(new Chat());
        animaux.add(new Chien());
        animaux.add(new Vache());

        for (Animal a : animaux) {
            a.faireSon();
            a.manger();
            System.out.println("==============================");
        }
    }
}
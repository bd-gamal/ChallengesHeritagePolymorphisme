import java.util.*;

public class Main {
    public static void main(String[] args) {

        Personnage guerrier = new Guerrier("Stalin", 100);
        Personnage mage = new Mage("Merlock", 80);
        Personnage archer = new Archer("Leonidas", 90);

        ArrayList<Personnage> personnages = new ArrayList<>();
        personnages.add(guerrier);
        personnages.add(mage);
        personnages.add(archer);

        System.out.println("===== Début du combat =====\n");

        for (int i = 0; i < personnages.size(); i++) {
            Personnage attaquant = personnages.get(i);
            Personnage cible = personnages.get((i + 1) % personnages.size());

            attaquant.attaquer(cible);
        }

        System.out.println("\n===== Fin du combat =====");
    }
}

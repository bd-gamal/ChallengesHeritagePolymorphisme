public class Mage extends Personnage {
    public Mage(String nom, int pointsDeVie) {
        super(nom, pointsDeVie);
    }

    @Override
    public void attaquer(Personnage autre) {
        int degats = 25;
        System.out.println(nom + " le Mage attaque " + autre.nom + " et inflige " + degats + " dégâts.");
    }
}

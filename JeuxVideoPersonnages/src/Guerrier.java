public class Guerrier extends Personnage {
    public Guerrier(String nom, int pointsDeVie) {
        super(nom, pointsDeVie);
    }

    @Override
    public void attaquer(Personnage autre) {
        int degats = 15;
        System.out.println(nom + " le guerrier attaque " + autre.nom + " et inflige " + degats + " dégâts.");
    }
}

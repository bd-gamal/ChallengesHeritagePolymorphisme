public class Archer extends Personnage{
    public Archer(String nom, int pointsDeVie) {
        super(nom, pointsDeVie);
    }

    @Override
    public void attaquer(Personnage autre) {
        int degats = 35;
        System.out.println(nom + " l'Archer attaque " + autre.nom + " et inflige " + degats + " dégâts.");
    }
}

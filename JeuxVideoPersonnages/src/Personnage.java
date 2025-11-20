public abstract class Personnage {
    protected String nom;
    protected int pointsDeVie;

    public Personnage(String nom, int pointsDeVie) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
    }

    public abstract void attaquer(Personnage autre);

    public boolean estVivant() {
        return pointsDeVie > 0;
    }
}

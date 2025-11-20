public class Voiture extends Vehicule {
    public Voiture(String modele, String marque, double capaciteReservoir, double consommation) {
        super(modele, marque, capaciteReservoir, consommation);
    }

    @Override
    public String demarrer() {
        return "La voiture "+ marque +" "+ modele +" va démarré";
    }

    @Override
    public double calculerAutonomie() {
        return super.calculerAutonomie();
    }
}

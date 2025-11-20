public class Camion extends Vehicule{
    public Camion(String modele, String marque, double capaciteReservoir, double consommation) {
        super(modele, marque, capaciteReservoir, consommation);
    }

    @Override
    public String demarrer() {
        return "Le camion "+ marque +" "+ modele +" va démarré";
    }

    @Override
    public double calculerAutonomie() {
        return super.calculerAutonomie();
    }
}

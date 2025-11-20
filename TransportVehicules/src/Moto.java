public class Moto extends Vehicule{
    public Moto(String modele, String marque, double capaciteReservoir, double consommation) {
        super(modele, marque, capaciteReservoir, consommation);
    }

    @Override
    public String demarrer() {
        return "La moto "+ marque +" "+ modele +" va démarré";
    }

    @Override
    public double calculerAutonomie() {
        return super.calculerAutonomie();
    }
}



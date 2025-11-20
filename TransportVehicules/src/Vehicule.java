public abstract class Vehicule {
    protected String marque;
    protected String modele;
    protected double capaciteReservoir;
    protected double consommation;

    public Vehicule(String modele, String marque, double capaciteReservoir, double consommation) {
        this.modele = modele;
        this.marque = marque;
        this.capaciteReservoir = capaciteReservoir;
        this.consommation = consommation;
    }

    public String demarrer() {
        return "Le véhicule "+ marque +" "+ modele +" démarre.";
    }

    public double calculerAutonomie () {
        return (capaciteReservoir / consommation) * 100;
    }
}

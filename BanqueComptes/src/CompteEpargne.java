public class CompteEpargne extends Compte{
    private double taux;

    public CompteEpargne(String numero, double solde, double taux) {
        super(numero, solde);
        this.taux = taux;
    }

    public double appliquerInternet() {
        double internet = solde * taux;
        solde += internet;
        return internet;
    }
}

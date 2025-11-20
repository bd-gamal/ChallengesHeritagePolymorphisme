public class CompteCourant extends Compte{
    private double decouvert;

    public CompteCourant(String numero, double solde, double decouvert) {
        super(numero, solde);
        this.decouvert = decouvert;
    }

    public boolean retirer(double montant) {
        if (solde - montant >= -decouvert) {
            solde -= montant;
            return true;
        }
        return false;
    }
}

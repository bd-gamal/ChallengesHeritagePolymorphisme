abstract class Compte {
    protected String numero;
    protected double solde;

    public Compte(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public void verser(double montant) {
        solde += montant;
    }

    public boolean retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Compte "+ numero +" : solde = "+ solde +" MAD";
    }
}

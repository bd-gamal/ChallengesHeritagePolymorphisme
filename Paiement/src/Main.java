public class Main {
    public static void main(String[] args) {

        Paiement p1 = new PaiementCarte();
        Paiement p2 = new PaiementCash();
        Paiement p3 = new PaiementVirement();

        traiterPaiement(p1, 900.0);
        traiterPaiement(p2, 500.0);
        traiterPaiement(p3, 1200.0);
    }

    public static void traiterPaiement(Paiement p, double montant) {
        p.effectuerPaiement(montant);
    }
}





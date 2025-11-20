public class Main {
    public static void main(String[] args) {
        System.out.println("==== Compte Courant ====");
        CompteCourant cc = new CompteCourant("CC101", 220, 50);

        System.out.println(cc);
        System.out.println("Retrait de 240 : "+ cc.retirer(240));
        System.out.println(cc);
        System.out.println("Retrait de 50 : "+ cc.retirer(50));
        System.out.println(cc);

        System.out.println("\n==== Compte Epargne ====");
        CompteEpargne ce = new CompteEpargne("CE102", 2000, 0.05);

        System.out.println(ce);
        System.out.println("Intéréts appliqués : "+ ce.appliquerInternet());
    }
}
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employe> employes = new ArrayList<>();

        employes.add(new Employe("Youssef", 10000));
        employes.add(new Employe("Najib", 18000));
        employes.add(new Employe("Anass", 22000));
        employes.add(new Employe("Najat", 12000));
        employes.add(new Employe("Haitham", 6000));

        for (Employe e : employes) {
            System.out.println(e.getNom() +" gagne : "+ e.calculerSalaire() +" MAD");
        }
    }
}
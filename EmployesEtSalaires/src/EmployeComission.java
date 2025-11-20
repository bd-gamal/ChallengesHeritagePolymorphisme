public class EmployeComission extends Employe {
    private double ventes;
    private double commision;

    public EmployeComission(String nom, double salaireBase, double ventes, double commision) {
        super(nom, salaireBase);
        this.ventes = ventes;
        this.commision = commision;
    }

    public double calculerSalaire() {
        return salaireBase + (ventes * commision);
    }
}

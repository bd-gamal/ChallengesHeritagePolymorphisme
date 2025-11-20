public class EmployeHoraire extends Employe {
    private int heuresTravaillees;
    private double tauxHoraire;

    public EmployeHoraire(String nom, double salaireBase, double tauxHoraire, int heuresTravaillees) {
        super(nom, salaireBase);
        this.tauxHoraire = tauxHoraire;
        this.heuresTravaillees = heuresTravaillees;
    }

    public double calculerSalaire() {
        return salaireBase + heuresTravaillees * tauxHoraire;
    }
}

public class Main {
    public static void main(String[] args) {

        Voiture v = new Voiture("Renault", "Mégane", 60, 15);
        Moto m = new Moto("Yamaha", "YZ", 10, 4);
        Camion c = new Camion("Scania", "R 770", 500, 150);

        System.out.println(v.demarrer());
        System.out.println(m.demarrer());
        System.out.println(c.demarrer());

        System.out.println("Autonomie voiture : "+ v.calculerAutonomie() +" KM");
        System.out.println("Autonomie moto : "+ m.calculerAutonomie() +" KM");
        System.out.println("Autonomie camion : "+ c.calculerAutonomie() +" KM");
    }
}
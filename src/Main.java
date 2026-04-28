public class Main {
    public static void main(String[] args) {

        Telecommande telecommande = new Telecommande();

        Lampe lampe = new Lampe();
        Hifi hifi = new Hifi();
        Cheminee cheminee = new Cheminee();

        AdaptateurCheminee adaptateurCheminee = new AdaptateurCheminee(cheminee);

        telecommande.ajouterAppareil(lampe);
        telecommande.ajouterAppareil(hifi);
        telecommande.ajouterAppareil(adaptateurCheminee);

        System.out.println("Etat initial :");
        System.out.println(telecommande);

        telecommande.allumer(0);
        telecommande.allumer(1);
        telecommande.allumer(2);

        System.out.println("Après allumage :");
        System.out.println(telecommande);

        telecommande.eteindre(2);

        System.out.println("Après extinction de la cheminée :");
        System.out.println(telecommande);
    }
}
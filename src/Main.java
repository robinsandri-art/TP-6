import thermos.Thermostat;

public class Main {
    public static void main(String[] args) {

        Telecommande telecommande = new Telecommande();

        Lampe lampe = new Lampe();
        Hifi hifi = new Hifi();
        Cheminee cheminee = new Cheminee();
        Thermostat thermostat = new Thermostat();

        AdaptateurCheminee adaptateurCheminee = new AdaptateurCheminee(cheminee);
        AdaptateurThermostat adaptateurThermostat = new AdaptateurThermostat(thermostat);

        telecommande.ajouterAppareil(lampe);
        telecommande.ajouterAppareil(hifi);
        telecommande.ajouterAppareil(adaptateurCheminee);
        telecommande.ajouterAppareil(adaptateurThermostat);

        telecommande.allumer(0);
        telecommande.allumer(1);
        telecommande.allumer(2);
        telecommande.allumer(3);

        telecommande.eteindre(3);

        System.out.println(telecommande);
    }
}
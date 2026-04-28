import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTelecommande {

    @Test
    public void testAllumerLampe() {
        Telecommande telecommande = new Telecommande();
        Lampe lampe = new Lampe();

        telecommande.ajouterAppareil(lampe);
        telecommande.allumer(0);

        assertEquals("Lampe allumée", lampe.toString());
    }

    @Test
    public void testEteindreLampe() {
        Telecommande telecommande = new Telecommande();
        Lampe lampe = new Lampe();

        telecommande.ajouterAppareil(lampe);
        telecommande.allumer(0);
        telecommande.eteindre(0);

        assertEquals("Lampe éteinte", lampe.toString());
    }

    @Test
    public void testAllumerCheminee() {
        Telecommande telecommande = new Telecommande();
        Cheminee cheminee = new Cheminee();
        AdaptateurCheminee adaptateur = new AdaptateurCheminee(cheminee);

        telecommande.ajouterAppareil(adaptateur);
        telecommande.allumer(0);

        assertEquals(10, cheminee.getLumiere());
    }

    @Test
    public void testEteindreCheminee() {
        Telecommande telecommande = new Telecommande();
        Cheminee cheminee = new Cheminee();
        AdaptateurCheminee adaptateur = new AdaptateurCheminee(cheminee);

        telecommande.ajouterAppareil(adaptateur);
        telecommande.allumer(0);
        telecommande.eteindre(0);

        assertEquals(0, cheminee.getLumiere());
    }
}
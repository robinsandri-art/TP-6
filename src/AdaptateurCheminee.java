public class AdaptateurCheminee implements Appareil {

    private Cheminee cheminee;

    public AdaptateurCheminee(Cheminee cheminee) {
        this.cheminee = cheminee;
    }

    public void allumer() {
        cheminee.changerIntensite(cheminee.getLumiere() + 10);
    }

    public void eteindre() {
        cheminee.changerIntensite(0);
    }

    public String toString() {
        return cheminee.toString();
    }
}
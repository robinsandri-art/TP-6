public class Telecommande {

    private Appareil[] appareils;
    private int nbAppareils;

    public Telecommande() {
        appareils = new Appareil[10];
        nbAppareils = 0;
    }

    public void ajouterAppareil(Appareil a) {
        if (nbAppareils < appareils.length) {
            appareils[nbAppareils] = a;
            nbAppareils++;
        }
    }

    public void allumer(int i) {
        if (i >= 0 && i < nbAppareils) {
            appareils[i].allumer();
        }
    }

    public void eteindre(int i) {
        if (i >= 0 && i < nbAppareils) {
            appareils[i].eteindre();
        }
    }

    public int getNombre() {
        return nbAppareils;
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < nbAppareils; i++) {
            res += i + " : " + appareils[i] + "\n";
        }
        return res;
    }
}

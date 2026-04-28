public class Hifi implements Appareil {

    private int son;

    public Hifi() {
        this.son = 0;
    }

    public void allumer() {
        if (son == 0) {
            son = 10;
        }
    }

    public void eteindre() {
        son = 0;
    }

    public String toString() {
        return "Hifi : son = " + son;
    }
}
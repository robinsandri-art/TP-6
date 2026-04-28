public class Lampe implements Appareil {

        private boolean allumee;

        public Lampe() {
            this.allumee = false;
        }

        public void allumer() {
            allumee = true;
        }

        public void eteindre() {
            allumee = false;
        }

        public String toString() {
            return "Lampe " + (allumee ? "allumée" : "éteinte");
        }
    }

import thermos.Thermostat;

public class AdaptateurThermostat implements Appareil {

    private Thermostat thermostat;

    public AdaptateurThermostat(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public void allumer() {
        thermostat.monterTemperature();
    }

    public void eteindre() {
        thermostat.baisserTemperature();
    }

    public String toString() {
        return "Thermostat";
    }
}
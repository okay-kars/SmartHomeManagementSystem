
public class SmartHome {
    private Light light;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EnergyMonitor energyMonitor;

    public SmartHome() {
        this.light = new Light();
        this.thermostat = new Thermostat(5.0); // Starttemperatur
        this.securitySystem = new SecuritySystem();
        this.energyMonitor = new EnergyMonitor();
    }

    public Light getLight() {
        return light;
    }

    public Thermostat getThermostat() {
        return thermostat;
    }

    public SecuritySystem getSecuritySystem() {
        return securitySystem;
    }

    public EnergyMonitor getEnergyMonitor() {
        return energyMonitor;
    }

    @Override
    public String toString() {
        return "SmartHome [Licht an=" + light.isOn() + ", Temperatur=" + thermostat.getTemperature() + " Grad, Sicherheitssystem an=" + securitySystem.isArmed() + ", Energieverbrauch=" + energyMonitor.getEnergyConsumption() + " kWh]";
    }
}

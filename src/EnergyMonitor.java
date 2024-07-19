
public class EnergyMonitor {
    private double energyConsumption;

    public EnergyMonitor() {
        this.energyConsumption = 0.0;
    }

    public void addConsumption(double amount) {
        energyConsumption += amount;
        System.out.println(amount + " kWh hinzugefügt. Gesamtverbrauch: " + energyConsumption + " kWh.");
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }
}

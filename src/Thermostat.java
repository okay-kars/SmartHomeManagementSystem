
public class Thermostat {
    private double temperature;

    public Thermostat(double initialTemperature) {
        this.temperature = initialTemperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        System.out.println("Temperatur auf " + temperature + " Grad eingestellt.");
    }

    public double getTemperature() {
        return temperature;
    }
}

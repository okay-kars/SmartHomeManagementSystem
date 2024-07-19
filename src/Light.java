

public class Light {
    private boolean isOn;

    public Light() {
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Licht eingeschaltet.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Licht ausgeschaltet.");
    }

    public boolean isOn() {
        return isOn;
    }
}

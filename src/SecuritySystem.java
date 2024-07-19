

public class SecuritySystem {
    private boolean isArmed;

    public SecuritySystem() {
        this.isArmed = false;
    }

    public void arm() {
        isArmed = true;
        System.out.println("Sicherheitssystem aktiviert.");
    }

    public void disarm() {
        isArmed = false;
        System.out.println("Sicherheitssystem deaktiviert.");
    }

    public boolean isArmed() {
        return isArmed;
    }
}

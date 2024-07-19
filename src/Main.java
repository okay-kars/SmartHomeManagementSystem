
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartHome smartHome = new SmartHome();

        while (true) {
            System.out.println("\n--- Smart Home Management System ---");
            System.out.println("1. Licht ein-/ausschalten");
            System.out.println("2. Temperatur einstellen");
            System.out.println("3. Sicherheitssystem aktivieren/deaktivieren");
            System.out.println("4. Energieverbrauch anzeigen");
            System.out.println("5. Smart Home-Info anzeigen");
            System.out.println("6. Beenden");
            System.out.print("Wählen Sie eine Option: ");

            int auswahl = scanner.nextInt();
            scanner.nextLine();

            switch (auswahl) {
                case 1:
                    if (smartHome.getLight().isOn()) {
                        smartHome.getLight().turnOff();
                    } else {
                        smartHome.getLight().turnOn();
                    }
                    break;
                case 2:
                    System.out.print("Neue Temperatur eingeben: ");
                    double neueTemperatur = scanner.nextDouble();
                    smartHome.getThermostat().setTemperature(neueTemperatur);
                    break;
                case 3:
                    if (smartHome.getSecuritySystem().isArmed()) {
                        smartHome.getSecuritySystem().disarm();
                    } else {
                        smartHome.getSecuritySystem().arm();
                    }
                    break;
                case 4:
                    System.out.println("Aktueller Energieverbrauch: " + smartHome.getEnergyMonitor().getEnergyConsumption() + " kWh");
                    break;
                case 5:
                    System.out.println(smartHome);
                    break;
                case 6:
                    System.out.println("Beenden...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ungültige Option. Bitte versuchen Sie es erneut.");
            }
        }
    }
}

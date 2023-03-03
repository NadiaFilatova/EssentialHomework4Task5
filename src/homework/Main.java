package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter temperature in Celsius");
        Scanner scanner = new Scanner(System.in);
        double scanCelsius;
        try {
            scanCelsius = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Entered is not a number");
            return;
        }
        System.out.println("Enter conversion target (F/K): ");
        String conversionTarget = scanner.next();
        try {
            CelsiusConverter converter = getConverter(conversionTarget);
            System.out.println("Conversion result: " + converter.convert(scanCelsius));
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong conversion target: " + conversionTarget);
        }
    }

    private static CelsiusConverter getConverter(String conversionTarget) {
        if ("F".equalsIgnoreCase(conversionTarget)) {
            return new CelsiusToFahrenheitConverter();
        } else if ("K".equalsIgnoreCase(conversionTarget)) {
            return new CelsiusToKelvinConverter();
        } else {
            throw new IllegalArgumentException("Unknown conversion target");
        }
    }
}

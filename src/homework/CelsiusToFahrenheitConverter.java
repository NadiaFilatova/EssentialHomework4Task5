package homework;

public class CelsiusToFahrenheitConverter implements CelsiusConverter {
    @Override
    public double convert(double celsius) {
        return celsius * 1.8 + 32;
    }
}

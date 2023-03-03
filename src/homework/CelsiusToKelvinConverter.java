package homework;

public class CelsiusToKelvinConverter implements CelsiusConverter {

    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}

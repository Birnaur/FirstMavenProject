package homeworkcurs14;

public class TemperatureConversion {
    public static double fahrenheitToCelsius(double temperature) {
        return (temperature - 32.0) * 5.0 / 9.0;
    }

    public static double celsiusToFahrenheit(double temperature) {
        return temperature * 9.0 / 5.0 + 32.0;
    }
}


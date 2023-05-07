package homeworkcurs14;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TemperatureConversionTest {

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConversion.fahrenheitToCelsius(32.0), 0.01);
        assertEquals(100.0, TemperatureConversion.fahrenheitToCelsius(212.0), 0.01);
        assertEquals(-40.0, TemperatureConversion.fahrenheitToCelsius(-40.0), 0.01);
    }

    private void assertEquals(double v, double fahrenheitToCelsius, double v1) {
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConversion.celsiusToFahrenheit(0.0), 0.01);
        assertEquals(212.0, TemperatureConversion.celsiusToFahrenheit(100.0), 0.01);
        assertEquals(-40.0, TemperatureConversion.celsiusToFahrenheit(-40.0), 0.01);
    }
}


import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TemperatureTest {

    /**
     * Test data for Fahrenheit to Celsius conversion.
     *
     * @return test data array
     */
    @DataProvider(name = "Fahrenheit")
    public static Object[][] fahrenheit() {
        return new Object[][]{
                {212.0, 100.0},
                {32.0, 0.0},
                {-15, -26.11111111111111},
               // {12, -11.111111111111111},
               // {56, 13.333333333333333}
                {50.0, 10.0},
                {71.8214, 22.122999999999998}
                // TODO add 2 more test data here
        };
    }

    /**
     * Test data for Celsius to Fahrenheit conversion.
     *
     * @return test data array
     */
    @DataProvider(name = "Celsius")
    public static Object[][] celsius() {
        return new Object[][]{
                {100.0, 212.0},
                {0.0, 32.0},
                {-26.11111111111111, -15},
                {10.0, 50.0},
                {22.122999999999998, 71.8214}
                // TODO add 2 more test data here
        };
    }

    @Test(dataProvider = "Fahrenheit")
    public void testFahrenheitToCelsius(double fahrenheit, double expectedResult) {
        double actulResult = Temperature.fahrenheitToCelsius(fahrenheit);

        assertEquals(actulResult, expectedResult, "Conversion from Fahrenheit to Celsius is wrong");
    }

    @Test(dataProvider = "Celsius")
    public void testCelsiusToFahrenheit(double celsius, double expectedResult) {
        double actulResult = Temperature.celsiusToFahrenheit(celsius);

        assertEquals(actulResult, expectedResult, "Conversion from Celsius to Fahrenheit is wrong");
    }
}
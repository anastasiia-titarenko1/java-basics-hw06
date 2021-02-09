public class Temperature {
    public static double celsius;
    public static double fahrenheit;

    /**
     * Converts temperature from Fahrenheit to Celsius degree.
     *
     * @param fahrenheit temperature degree in Fahrenheit
     * @return temperature degree in Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        // TODO fill in code here and replace the return statement
        celsius = 5 * (fahrenheit - 32) / 9;
        return celsius;
    }

    /**
     * Converts temperature from Celsius to Fahrenheit degree.
     *
     * @param celsius temperature degree in Celsius
     * @return temperature degree in Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        // TODO fill in code here and replace the return statement

        fahrenheit = (9 * celsius + 160) / 5;
        return fahrenheit;
    }
}

package edu.formation.poo.staticite;

/**
 * Classe qui englobe la classe statique Temperatureconverter.
 * 
 * @author Seme
 */
public class TemperatureConverter {
  /**
   * propose les services suivants : - conversion de température de celsius vers fahrenheit -
   * conversion de température de fahrenheit vers celsius.
   * 
   * @author Seme
   */
  public static class TemperatureConverterStatic {
    /**
     * Convertit une température en degrés Celsius en degrés Fahrenheit.
     * 
     * @param temperatureCelsius La température en degrès Celsius
     * @return La temperature en degrés fahrenheit
     */
    public static double celsiusToFahrenheit(String temperatureCelsius) {
      // Conversion en double (grand float)
      double celsius = Double.parseDouble(temperatureCelsius);

      // conversion celsius en fahrenheit
      double fahrenheit = (celsius * 9 / 5) + 32;

      // on retourne la température en fahrenheit
      return fahrenheit;
    }

    /**
     * Convertit une température en degrés Fahrenheit en degrés Celsius.
     * 
     * @param temperatureFahrenheit La température en fahrenheit
     * @return La température en celsius
     */
    public static double fahrenheitToCelsius(String temperatureFahrenheit) {
      // Conversion en double (grand float)
      double fahrenheit = Double.parseDouble(temperatureFahrenheit);

      // conversion celsius en fahrenheit
      double celsius = (fahrenheit - 32) * 5 / 9;

      // on retourne la température en fahrenheit
      return celsius;
    }
  }
}

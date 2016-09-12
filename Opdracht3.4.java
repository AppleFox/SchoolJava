import java.util.Scanner;

public class Opdracht {

    /**
     * Scanner instance
     */
    protected static Scanner reader;

    public static void main(String[] args)
    {
        reader = new Scanner(System.in);


        String method = getMethod();
        int degrees = getDegrees();

        int result = getResult(method, degrees);

        System.out.println(result);
    }

    /**
     * Get the result of the calculation
     *
     * @param method
     * @param degrees
     * @return int
     */
    protected static int getResult(String method, int degrees)
    {
        switch (method) {
            case "cel2kel":
                return CelciusToKelvin(degrees);
            case "cel2fahr":
                return CelciusToFahrenheit(degrees);
            case "fahr2cel":
                return FahrenheitToCelcius(degrees);
        }

        return 0;
    }

    /**
     * Ask the user what conversion we have to do.
     *
     * @return String
     */
    protected static String getMethod()
    {
        System.out.println("Wat wil je converteren: cel2kel, cel2fahr, fahr2cel");

        return reader.next();
    }

    /**
     * Ask the user how many degrees he wants to convert
     *
     * @return int
     */
    protected static int getDegrees()
    {
        System.out.println("Hoeveel graden?");

        return reader.nextInt();
    }

    /**
     * Calculate celcius to kelvin
     *
     * @param degrees
     * @return int
     */
    protected static int CelciusToKelvin(int degrees)
    {
        return (273 + degrees);
    }

    /**
     * Calculate Celcius to Fahrenheit
     *
     * @param degrees
     * @return int
     */
    protected static int CelciusToFahrenheit(int degrees)
    {
        return (9/5 * degrees + 32);
    }

    /**
     * Calculate Fahrenheit to Ceclius
     * @param degrees
     * @return
     */
    protected static int FahrenheitToCelcius(int degrees)
    {
        return 5/9 * (degrees - 32);
    }
}

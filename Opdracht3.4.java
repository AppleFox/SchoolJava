import java.util.Scanner;

public class Opdracht {

    protected static Scanner reader;
    protected static int result;

    public static void main(String[] args)
    {
        reader = new Scanner(System.in);

        System.out.println("Wat wil je converteren: cel2kel, cel2fahr, fahr2cel");
        String method = reader.next();

        System.out.println("Hoeveel graden?");
        int degrees = reader.nextInt();

        switch (method) {
            case "cel2kel":
                result = CelciusToKelvin(degrees);
                break;
            case "cel2fahr":
                result = CelciusToFahrenheit(degrees);
                break;
            case "fahr2cel":
                result = FahrenheitToCelcius(degrees);
                break;
            default:
                result = 0;
        }

        System.out.println(result);
    }

    protected static int CelciusToKelvin(int degrees)
    {
        return (273 + degrees);
    }

    protected static int CelciusToFahrenheit(int degrees)
    {
        return (9/5 * degrees + 32);
    }

    protected static int FahrenheitToCelcius(int degrees)
    {
        return 5/9 * (degrees - 32);
    }
}

import java.util.Scanner;

public class Opdracht
{

    /**
     * Instance of Scanner instance
     */
    protected static Scanner reader;

    /**
     * Execute the main thread.
     *
     * @param args
     */
    public static void main (String[] args)
    {
        reader = new Scanner(System.in);

        System.out.println(add(getInteger(), getInteger()));
    }

    /**
     * Add two integers together
     *
     * @param number
     * @param numberTwo
     * @return int
     */
    protected static int add(int number, int numberTwo)
    {
        return number + numberTwo;
    }

    /**
     * Get an integer from the command line
     *
     * @return int
     */
    protected static int getInteger()
    {
        System.out.println("Enter an integer");

        return reader.nextInt();
    }
}

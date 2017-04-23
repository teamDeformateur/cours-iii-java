import java.util.*;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class Solution
{

    public static void main(String args[])
    {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        if (in.hasNextLine())
        {
            in.nextLine();
        }
        String temps = in.nextLine(); // the n temperatures expressed as
                                      // integers ranging from -273 to 5526

        String[] tempsArray = temps.split(" ");
        String closest = "0";
        int minGap = 9999;
        for (String temp : tempsArray)
        {
            try
            {
                int min = Math.abs(Integer.parseInt(temp));
                if (min < minGap)
                {
                    minGap = min;
                    closest = temp;
                }
                else if (min == minGap)
                {
                    if (Integer.parseInt(temp) > Integer.parseInt(closest))
                    {
                        closest = temp;
                    }
                }
            }
            catch (NumberFormatException e)
            {
                closest = "0";
            }

        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(closest);
    }
}

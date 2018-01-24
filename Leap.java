public class Leap
{
    public static void main(String[] args)
    {
        if (args.length < 1)
        {
            System.out.println("Please use an year to check.");
            usage();
        }
        else
        {
            try
            {
                int year = Integer.parseInt(args[0]);
                if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
                {
                    System.out.println("leap year!");
                }
                else
                {
                    System.out.println("not a leap year!");
                }
            }
            catch (NumberFormatException ex)
            {
                System.out.println("Argument should be a number.");
                usage();
            }
        }
    }

    private static void usage()
    {
        System.out.println("Usage: java Leap 2000");
    }
}

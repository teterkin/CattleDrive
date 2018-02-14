public class Times
{
    final static int fieldWidth = 3;
    public static void main(String[] args)
    {
        System.out.print("   ");
        for (int j = 0; j <=9; j++)
        {
            System.out.print(printNice(j, fieldWidth));
        }
        System.out.println();
        for (int i = 0; i <= 9; i++)
        {
            System.out.print(printNice(i, fieldWidth));
            for (int j = 0; j <=9; j++)
            {
                System.out.print(printNice(i*j, fieldWidth));
            }
            System.out.println();

        }
    }

    private static String printNice(int myInt, int width)
    {
        String myStr = String.valueOf(myInt);
        while (myStr.length() < width)
        {
            myStr = " " + myStr;
        }
        return myStr;
    }


}

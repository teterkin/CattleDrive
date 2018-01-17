public class Hundred2
{
    public static void main(String[] args)
    {
        try
        {
            for (int i = 0; i < 99; i++)
            {
                if (i % 7 == 0 && i != 0)
                {
                    System.out.println();
                }
                System.out.print(args[0] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Данная программа требует наличия аргумента командной строки!");
            System.out.println("Запустите ее так: java Hundred2 Gertrude");
            // ex.printStackTrace();
        }
    }
}
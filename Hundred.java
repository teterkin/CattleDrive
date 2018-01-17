public class Hundred
{
    public static void main(String[] args)
    {
        try
        {
            for (int i = 0; i < 99; i++)
            {
                System.out.print(args[0] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Данная программа требует наличия аргумента командной строки!");
            System.out.println("Запустите ее так: java Hundred Gertrude");
            // ex.printStackTrace();
        }
    }
}
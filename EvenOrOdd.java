public class EvenOrOdd
{
    public static void main(String[] args)
    {
        if (args.length < 1)
        {
            System.out.println("Укажите число в аргументе коммандной строки.");
            System.out.println("Пример: java EvenOrOdd 28");
        }
        else
        {
            try
            {
                int number = Integer.parseInt(args[0]);
                if (number % 2 == 0)
                {
                    System.out.println("even");
                }
                else
                {
                    System.out.println("odd");
                }
            }
            catch (NumberFormatException ex)
            {
                System.out.println("Должно быть число.");
            }

        }
    }
}

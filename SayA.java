public class SayA
{
    public static void main(String[] args)
    {
        if (args.length < 1)
        {
            System.out.println("Укажите число в командной строке!");
            System.out.println("Пример: $ java SayA 22");
        }
        else
        {
            try
            {
                int number = Integer.parseInt(args[0]);
                if (number < 0 || number > 99)
                {
                    System.out.println("Число должно быть от 0 до 99");
                }
                else
                {
                    sayNumber(number);
                }
            } catch (NumberFormatException ex)
            {
                System.out.println("Принимаются только числа!");
            }
        }
    }

    private static void sayNumber(int number)
    {
        String firstTwenty[] = {"ноль", "один", "два", "три", "четыре", "пять",
                "шесть", "семь", "восемь", "девять", "десять", "одиннадцать",
                "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать",
                "семнадцать", "восемнадцать", "девятнадцать", "двадцать"};
        String tens[] = {"N/A", "десять", "двадцать", "тридцать", "сорок", "пятьдесят",
                "шестьдесят", "семьдесят", "восемьдесят", "девяносто", "сто"};

        if (number < 21)
        {
            System.out.println(firstTwenty[number]);
        }
        else if (number % 10 == 0)
        {
            System.out.println(tens[number / 10]);
        }
        else
        {
            System.out.print(tens[number / 10] + " " + firstTwenty[(number % 10)]);
        }
    }
}

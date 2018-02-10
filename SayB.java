public class SayB
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
                long number = Integer.parseInt(args[0]);
                sayNumber(number);
            } catch (NumberFormatException ex)
            {
                System.out.println("Принимаются только числа!");
            }
        }
    }

    /**
     * Универсальный метод, произносящий число целиком.
     * В завсимости от числа разрядов, вызывает те или иные методы (saySmallNumbers,
     * sayThousands, sayMillions, sayBillions).
     *
     * @param number
     */
    public static String sayNumber(long number)
    {
        String RS = "";
        if (number < 0 || number > 999999999999l)
        {
            RS="Число должно быть от 0 до 999999999999";
        }
        else
        {
            if (number < 1000)
            {
                RS = saySmallNumbers(number);
            }
            else if (number >= 1000 && number < 1000000)
            {
                RS = sayThousands(number);
            }
            else if (number >= 1000000 && number < 1000000000)
            {
                RS = sayMillions(number);
            }
            else
            {
                RS = sayBillions(number);
            }
        }

        return RS;
    }

    public static String saySmallNumbers(long number)
    {
        String RS = "";
        String firstTwenty[] = {"ноль", "один", "два", "три", "четыре", "пять",
                "шесть", "семь", "восемь", "девять", "десять", "одиннадцать",
                "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать",
                "семнадцать", "восемнадцать", "девятнадцать", "двадцать"};
        String tens[] = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят",
                "шестьдесят", "семьдесят", "восемьдесят", "девяносто", "сто"};
        String hundreds[] = {"", "сто", "двести", "триста", "четыреста", "пятьсот",
                "шестьсот", "семьсот", "восемьсот", "девятьсот", "тысяча"};
        String odna = "одна";
        String dve = "две";

        if (number < 21)
        {
            RS = firstTwenty[(int) (number)];
        }
        else if (number >= 21 && number <= 99)
        {
            if (number % 10 == 0)
            {
                RS = tens[(int) (number / 10)];
            }
            else
            {
                RS = tens[(int) (number / 10)] + " " +
                        firstTwenty[(int) (number % 10)];
            }
        }
        else
        {
            int RT = (int) (number % 100 / 10);
            int RFT = (int) (number % 10);
            RS = hundreds[(int) (number / 100)];
            if (RT != 0)
            {
                RS += " " + tens[RT];
            }
            if (RFT != 0)
            {
                RS += " " + firstTwenty[RFT];
            }
        }
        return RS;
    }

    public static String sayThousands(long number)
    {
        String RS = "";

        if (number == 1000)
        {
            RS = "одна тысяча";
        }
        else
        {
            RS = "одна тысяча " + sayNumber((int) (number % 1000));
        }
        return RS;
    }

    public static String sayMillions(long number)
    {
        String RS = "";
// TODO Доделать методы
        return RS;
    }

    public static String sayBillions(long number)
    {
        String RS = "";
// TODO Доделать методы
        return RS;
    }
}

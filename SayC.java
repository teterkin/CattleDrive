// http://www.englishlessonsbrighton.co.uk/saying-large-numbers-english/
// https://javaranch.com/say.jsp

public class SayC
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
        String odna = "одна";
        String dve = "две";
        String numClassesPlural[] = {"", "тысяч", "миллионов", "миллиардов"}; // 5,6,7,8,9
        String numClasses[] = {"", "тысяча", "миллион", "миллиард"}; // 1,
        String numClassesRP[] = {"", "тысячи", "миллиона", "миллиарда"}; // 2,3,4
        int classCount = 0;
        long mod = 0l;
        String classWord = "";
        String stringMod = "";
        char lastLetter;
        String modWord = "";
        long origNumber = number;

        if (number == 0)
        {
            RS = "ноль";
        }
        else if (number < 0 || number > 999999999999l)
        {
            RS="Число должно быть от 0 до 999999999999";
        }
        else
        {
            while (number > 0)
            {
                mod = (number % 1000);
                stringMod = String.valueOf(mod);
                lastLetter = stringMod.charAt(stringMod.length() - 1);
                // System.out.println(lastLetter);
                if (lastLetter == '1')
                {
                    classWord = numClasses[classCount];
                }
                else if (lastLetter == '2' || lastLetter == '3' || lastLetter == '4')
                {
                    classWord = numClassesRP[classCount];
                }
                else
                {
                    classWord = numClassesPlural[classCount];
                }
                modWord = saySmallNumber((int) mod);
                if (modWord.equals("ноль"))
                {
                    modWord = "";
                }
                else
                {
                    if (origNumber > 999 && origNumber < 2000 && modWord.equals("один"))
                    {
                        modWord = odna;
                    }
                    else if (origNumber > 1999 && origNumber < 3000 && modWord.equals("два"))
                    {
                        modWord = dve;
                    }
                }
                RS = "" + modWord + " " + classWord + " " + RS;
                number = number / 1000;
                classCount++;
            }

            RS = RS.trim();
        }

        return RS;
    }

    public static String saySmallNumber(int number)
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
            int R2D = (int) (number % 100);
            RS = hundreds[(int) (number / 100)];
            if (R2D<21 && R2D != 0)
            {
                RS += " " + firstTwenty[R2D];
            }
            else
            {
                if (RT != 0)
                {
                    RS += " " + tens[RT];
                }
                if (RFT != 0)
                {
                    RS += " " + firstTwenty[RFT];
                }
            }
        }
        return RS;
    }
}

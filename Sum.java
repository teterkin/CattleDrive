import java.math.BigDecimal;

public class Sum
{
    public static void main(String[] args)
    {
        checkDoubles();
        System.out.println();
        checkBigDecimals();
    }

    private static void checkDoubles()
    {
        Double sum = 0d;
        for (int i = 0; i < 1000; i++)
        {
            sum += 0.1d;
        }
        System.out.println("Sum = " + sum);
        if (sum == 100)
        {
            System.out.println("Your sum is correct!");
        }
        else
        {
            System.out.println("Your sum is not correct! It should be exactly 100 there. :(");
        }
    }

    private static void checkBigDecimals()
    {
        System.out.println("Trying with BigDecimal...");

        BigDecimal sumBD = new BigDecimal("0");
        sumBD.setScale(2, 4); // 4 - ROUND_HALF_UP

        BigDecimal bigDecimalOneTenth = new BigDecimal("0.1");
        bigDecimalOneTenth.setScale(2, 4);

        BigDecimal hundred = new BigDecimal("100");
        hundred.setScale(2, 4);

        for (int i = 0; i < 1000; i++)
        {
            sumBD = sumBD.add(bigDecimalOneTenth);
            // System.out.println(sumBD);
        }
        System.out.println("Sum = " + sumBD);
        if (sumBD.compareTo(hundred) == 0)
        {
            System.out.println("Your sum is correct! :)");
        }
        else
        {
            System.out.println("Your sum is not correct! It should be exactly " + hundred + " there. :(");
        }
    }

}

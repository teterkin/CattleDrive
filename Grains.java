import java.math.BigInteger;

public class Grains
{
    public static void main(String[] args)
    {
        BigInteger grains = new BigInteger("1");
        BigInteger bigTwo = new BigInteger("2");
        String grainWord = "grain";
        for (int i = 1; i <=64; i++)
        {
            if (i == 2)
            {
                grainWord += "s";
            }
            System.out.println("square "+ i +":  " + grains + " " + grainWord);
            grains = grains.multiply(bigTwo);
        }
    }
}

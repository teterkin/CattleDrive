import static org.junit.Assert.*;
import org.junit.Test;

public class SayBTest
{
    @Test
    public void checkMinusFive() {
        assertEquals("Число должно быть от 0 до 999999999999", SayB.sayNumber(-5));
    }
    @Test
    public void check0() {
        assertEquals("ноль", SayB.sayNumber(0));
    }
    @Test
    public void check9() {
        assertEquals("девять", SayB.sayNumber(9));
    }
    @Test
    public void check15() {
        assertEquals("пятнадцать", SayB.sayNumber(15));
    }
    @Test
    public void check32() {
        assertEquals("тридцать два", SayB.sayNumber(32));
    }

    @Test
    public void check99() {
        assertEquals("девяносто девять", SayB.sayNumber(99));
    }

    @Test
    public void check100() {
        assertEquals("сто", SayB.sayNumber(100));
    }

    @Test
    public void check234() {
        assertEquals("двести тридцать четыре", SayB.sayNumber(234));
    }

    @Test
    public void check700() {
        assertEquals("семьсот", SayB.sayNumber(700));
    }

    @Test
    public void check999() {
        assertEquals("девятьсот девяносто девять", SayB.sayNumber(999));
    }

    @Test
    public void check1000() {
        assertEquals("одна тысяча", SayB.sayNumber(1000));
    }

    @Test
    public void check1005() {
        assertEquals("одна тысяча пять", SayB.sayNumber(1005));
    }

    @Test
    public void check1234() {
        assertEquals("одна тысяча двести тридцать четыре", SayB.sayNumber(1234));
    }

}
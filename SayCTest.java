import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SayCTest
{
    @Test
    public void checkMinusFive() {
        assertEquals("Число должно быть от 0 до 999999999999", SayC.sayNumber(-5));
    }

    @Test
    public void check0() {
        assertEquals("ноль", SayC.sayNumber(0));
    }

    @Test
    public void check1() {
        assertEquals("один", SayC.sayNumber(1));
    }

    @Test
    public void check2() {
        assertEquals("два", SayC.sayNumber(2));
    }

    @Test
    public void check5() {
        assertEquals("пять", SayC.sayNumber(5));
    }

    @Test
    public void check9() {
        assertEquals("девять", SayC.sayNumber(9));
    }
    @Test
    public void check15() {
        assertEquals("пятнадцать", SayC.sayNumber(15));
    }
    @Test
    public void check32() {
        assertEquals("тридцать два", SayC.sayNumber(32));
    }

    @Test
    public void check99() {
        assertEquals("девяносто девять", SayC.sayNumber(99));
    }

    @Test
    public void check100() {
        assertEquals("сто", SayC.sayNumber(100));
    }

    @Test
    public void check234() {
        assertEquals("двести тридцать четыре", SayC.sayNumber(234));
    }

    @Test
    public void check700() {
        assertEquals("семьсот", SayC.sayNumber(700));
    }

    @Test
    public void check999() {
        assertEquals("девятьсот девяносто девять", SayC.sayNumber(999));
    }

    @Test
    public void check1000() {
        assertEquals("одна тысяча", SayC.sayNumber(1000));
    }

    @Test
    public void check1005() {
        assertEquals("одна тысяча пять", SayC.sayNumber(1005));
    }

    @Test
    public void check1234() {
        assertEquals("одна тысяча двести тридцать четыре", SayC.sayNumber(1234));
    }

    @Test
    public void check2007() {
        assertEquals("две тысячи семь", SayC.sayNumber(2007));
    }

    @Test
    public void check102345() {
        assertEquals("сто две тысячи триста сорок пять", SayC.sayNumber(102345));
    }

    @Test
    public void check112345() {
        assertEquals("сто двенадцать тысяч триста сорок пять", SayC.sayNumber(112345));
    }

    @Test
    public void check167234() {
        assertEquals("сто шестьдесят семь тысяч двести тридцать четыре", SayC.sayNumber(167234));
    }

    @Test
    public void check1678234() {
        assertEquals("один миллион шестьсот семьдесят восемь тысяч " +
                "двести тридцать четыре", SayC.sayNumber(1678234));
    }

    @Test
    public void check50416234() {
        assertEquals("пятьдесят миллионов четыреста шестнадцать тысяч " +
                "двести тридцать четыре", SayC.sayNumber(50416234));
    }

    @Test
    public void check965345163234() {
        assertEquals("девятьсот шестьдесят пять миллиардов " +
                "триста сорок пять миллионов сто шестьдесят три тысячи " +
                "двести тридцать четыре", SayC.sayNumber(965345163234l));
    }

    @Test
    public void check440440440440() {
        assertEquals("четыреста сорок миллиардов " +
                "четыреста сорок миллионов четыреста сорок тысяч " +
                "четыреста сорок", SayC.sayNumber(440440440440l));
    }

}
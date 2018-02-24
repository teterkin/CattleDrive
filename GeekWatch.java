import java.util.Date;

/**
 * This program will show different time and date information based on what "code" you send it.
 * <p>
 * The codes are:
 * 0 - number of milliseconds since January 1, 1970
 * 1 - number of seconds since January 1, 1970
 * 2 - number of days since January 1, 1970
 * 3 - current date and time
 * <p>
 * Purpose: To learn how to use other classes and how to use a switch statement.
 */
public class GeekWatch
{
    public static void main(String[] args)
    {
        if (args.length != 1)
        {
            System.out.println("Количество аргументов должно быть равно 1.");
            System.out.println("Пример использования: java GeekWatch 2");
            System.out.println("Где 2 - это код от 0 до 3.");
            System.out.println("0 - количество миллисекунд с 1 Января 1970 года.\n" +
                    "1 - количество секунд с 1 Января 1970 года.\n" +
                    "2 - количество дней с 1 Января 1970 года.\n" +
                    "3 - текущая дата и время");
        }
        else
        {
            try
            {
                int choice = Integer.parseInt(args[0]);
                if (choice >= 0 && choice < 4)
                {
                    Date myDate = new Date();
                    switch (choice)
                    {
                        case 0:
                            tellMillis(myDate);
                            break;
                        case 1:
                            tellSeconds(myDate);
                            break;
                        case 2:
                            tellDays(myDate);
                            break;
                        case 3:
                            tellDateAndTime(myDate);
                            break;
                        default:
                            System.out.println("Что-то пошло не так...");
                            break;
                    }
                }
                else
                {
                    System.out.println("Код должен быть от 0-я до 3-х.");
                }
            } catch (NumberFormatException ex)
            {
                System.out.println("В качестве аргумента введите число от 0-я до 3-х.");
            }
        }
    }

    private static void tellDateAndTime(Date myDate)
    {
        System.out.println("Текущие дата и время: " + myDate.toString());
    }

    private static void tellDays(Date myDate)
    {
        System.out.println("C 1 Января 1970-го года прошло " + ((myDate.getTime())/1000/60/60/24) + " дней.");
    }

    private static void tellSeconds(Date myDate)
    {
        System.out.println("C 1 Января 1970-го года прошло " + ((myDate.getTime())/1000) + " секунд.");
    }

    private static void tellMillis(Date myDate)
    {
        System.out.println("C 1 Января 1970-го года прошло " + (myDate.getTime()) + " миллисекунд.");
    }
}

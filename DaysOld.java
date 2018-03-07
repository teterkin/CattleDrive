import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DaysOld
{
    public static void main(String[] args)
    {
        if (args.length != 1)
        {
            System.out.println("Количество аргументов должно быть равно 1.");
            System.out.println("Пример использования: java DaysOld 23.03.2002");
            System.out.println("Где 23.03.2002 - пример даты рождения.");
        }
        else
        {
            try
            {
                DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                LocalDate birthDay = LocalDate.parse(args[0], format);
                LocalDate today = LocalDate.now();

                DateTimeFormatter niceFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("ru"));

                StringBuilder sb = new StringBuilder();
                sb.append("\nВы родились " + birthDay.format(niceFormat) + " года.\n");
                sb.append("Сегодня: " + today.format(niceFormat) + " года.\n");

                Period toBDay = Period.between(birthDay, today);
                long toBDay2 = ChronoUnit.DAYS.between(birthDay, today);

                sb.append("Сегодня вам исполнилось " + toBDay2 + " дней. ;)\n");
                sb.append("А точнее: " + toBDay.getYears() + " год, " + toBDay.getMonths() +
                        " месяцев и " + toBDay.getDays() + " дней.\n");

                LocalDate nextBDay = birthDay.withYear(today.getYear());
                // Если день рожденья уже был, добавим 1 год.
                if (nextBDay.isBefore(today) || nextBDay.isEqual(today))
                {
                    nextBDay = nextBDay.plusYears(1);
                }

                Period toNextBDay = Period.between(today, nextBDay);
                long toNextBDay2 = ChronoUnit.DAYS.between(today, nextBDay);
                sb.append("Осталось " + toNextBDay.getMonths() + " месяца и " +
                        toNextBDay.getDays() + " дней до вашего следующего Дня Рождения! (это " +
                        toNextBDay2 + " день).");

                System.out.println(sb.toString());

            } catch (DateTimeParseException e)
            {
                System.out.println("Дата введена в некорректном формате. Попробуйте так: 23.03.2002");
                System.out.println("Трассировка ошибки:");
                System.out.println("-------------------");
                e.printStackTrace();
            }
        }
    }
}

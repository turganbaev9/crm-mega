import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class LessonDate2 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM yyyy");
        Calendar calendar = new GregorianCalendar(2023, Calendar.AUGUST , 25);
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 42);
        calendar.set(Calendar.SECOND, 12);
        calendar.roll(Calendar.MONTH,-2 );
        System.out.println(dateFormat.format(calendar.getTime()));

        Calendar calendar1= new GregorianCalendar(2023,0,27);
        Date date=calendar.getTime();
        calendar.add(Calendar.MONTH,-2);
        System.out.println(date);
        System.out.println(calendar.getTime());

        LocalDate date1=LocalDate.now();
        LocalDate date2=LocalDate.of(2023,02,12);
        LocalDate date3=LocalDate.parse("2020-02-22");
        System.out.println(date1.plusDays(5)+"plus 5 days");
        System.out.println(date1.plusWeeks(+2)+"u have a meet in 2 weeks");
        System.out.println(date1.plusMonths(-3)+"-3");
        System.out.println(date1);
        System.out.println(date2);

        String dt = "27 числа 02 месяца 2023 года";
        System.out.println(dt);
        Date date4=new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);

        Date d = new Date();
        SimpleDateFormat format1;
        SimpleDateFormat format2;
        format1 = new SimpleDateFormat(
                "EEEE dd.MM.yyyy hh:mm");
        format2 = new SimpleDateFormat("EEEE День dd Месяц MM Год yyyy Время hh:mm");
        // 27.02.2023 14:23); System.out.println(format1.format(d));
        System.out.println(
                // День 25 Месяц 02 Год 2023 Время 14:24
                 format2.format(d));





    }
}

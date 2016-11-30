package formatter;

import org.springframework.cglib.core.Local;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;


/**
 * Created by yinxin on 16-11-24.
 */
public class DateFormatter implements Formatter<LocalDate> {
    private String datePattern;
    private SimpleDateFormat dateFormat;

    public DateFormatter(String datePattern)
    {
        this.datePattern = datePattern;
        dateFormat = new SimpleDateFormat();
        dateFormat.setLenient(false);
    }

    @Override
    //返回目标对象的字符串表示法
    public String print(LocalDate date, Locale locale)
    {
        return dateFormat.format(date);
    }

    @Override
    //利用指定的Locale将一个String解析成目标类型
    public LocalDate parse(String s, Locale locale) throws ParseException {
       System.out.println("formatter.parse. s:" + s + ", pattern:" + datePattern);
        try {
            return LocalDate.parse(s, DateTimeFormatter.ofPattern(datePattern));
        } catch (DateTimeParseException e) {
            // the error message will be displayed in <form:errors>
            throw new IllegalArgumentException(
                    "invalid date format. Please use this pattern\""
                            + datePattern + "\"");
        }
    }




}

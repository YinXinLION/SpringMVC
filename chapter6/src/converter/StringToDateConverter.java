package converter;



import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


/**
 * Created by yinxin on 16-11-24.
 */
public class StringToDateConverter implements Converter<String,LocalDate> {
    private String datePattern;
    public StringToDateConverter(String datePattern)
    {
        this.datePattern = datePattern;
        System.out.println("instantiating....converter with pattern:" + datePattern);
    }
    @Override
    public  LocalDate convert(String s) {
        try {
            return LocalDate.parse(s, DateTimeFormatter.ofPattern(datePattern));
        } catch (DateTimeParseException e) {
            // the error message will be displayed when using <form:errors>
            throw new IllegalArgumentException(
                    "invalid date format. Please use this pattern\""
                            + datePattern + "\"");
        }
    }
}

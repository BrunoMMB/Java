/*
 */
package view;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.jdesktop.beansbinding.Converter;

public class ConverterData extends Converter {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // objeto para a tela
    @Override
    public Object convertForward(Object value) {
        LocalDate localDate = (LocalDate) value;
        return localDate.format(dtf);

    }

    // tela o objeto
    @Override
    public Object convertReverse(Object value) {
        String str = (String) value;
        return LocalDate.parse(str, dtf);
    }

}

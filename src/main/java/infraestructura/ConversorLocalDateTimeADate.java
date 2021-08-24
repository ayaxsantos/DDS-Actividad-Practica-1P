package infraestructura;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.LocalDateTime;
import java.util.Date;

@Converter(autoApply = true)
public class ConversorLocalDateTimeADate implements AttributeConverter<LocalDateTime, Date>
{
    @Override
    public Date convertToDatabaseColumn(LocalDateTime localDateTime) {
        return localDateTime == null ? null : java.sql.Date.valueOf(localDateTime.toLocalDate());
    }

    @Override
    public LocalDateTime convertToEntityAttribute(Date date) {
        return null;
    }
}

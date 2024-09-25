package org.alexgiou.springmodulith.order.typeconverter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.alexgiou.springmodulith.order.type.Status;

import java.util.Arrays;

/**
 * @author: Alexandros Giounan
 * @code @created: 9/25/2024
 */

@Converter(autoApply = true)
public class StatusConverter implements AttributeConverter<Status, String> {
    @Override
    public String convertToDatabaseColumn(Status status) {
        return Arrays.stream(Status.values())
                .filter(s -> s.equals(status))
                .findFirst()
                .map(Status::getCode)
                .orElseThrow(IllegalArgumentException::new); //todo: change exception
    }

    @Override
    public Status convertToEntityAttribute(String code) {
        return  Arrays.stream(Status.values())
                .filter(s -> s.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new); //todo: change exception
    }
}

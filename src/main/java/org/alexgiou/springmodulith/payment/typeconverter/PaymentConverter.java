package org.alexgiou.springmodulith.payment.typeconverter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.alexgiou.springmodulith.payment.type.PaymentStatus;

import java.util.Arrays;

/**
 * @author: Alexandros Giounan
 * @code @created: 9/25/2024
 */
@Converter(autoApply = true)
public class PaymentConverter implements AttributeConverter<PaymentStatus, String> {
    @Override
    public String convertToDatabaseColumn(PaymentStatus attribute) {
        return Arrays.stream(PaymentStatus.values())
                .filter(paymentStatus -> paymentStatus.equals(attribute))
                .findFirst()
                .map(PaymentStatus::getCode)
                .orElseThrow(() -> new IllegalArgumentException("Unknown payment status: " + attribute));
    }

    @Override
    public PaymentStatus convertToEntityAttribute(String code) {
        return Arrays.stream(PaymentStatus.values())
                .filter(paymentStatus -> paymentStatus.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown payment status: " + code));
    }
}

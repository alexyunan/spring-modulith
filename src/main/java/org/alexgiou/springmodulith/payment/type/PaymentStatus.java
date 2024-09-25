package org.alexgiou.springmodulith.payment.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: Alexandros Giounan
 * @code @created: 9/25/2024
 */
@Getter
@AllArgsConstructor
public enum PaymentStatus {

    INCOMPLETE("I"), COMPLETED("C"), FAILED("F");

    private final String code;
}

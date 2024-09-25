package org.alexgiou.springmodulith.order.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: Alexandros Giounan
 * @code @created: 9/25/2024
 */
@Getter
@AllArgsConstructor
public enum Status {
    OPEN("O"), COMPLETED("C");
    private final String code;
}

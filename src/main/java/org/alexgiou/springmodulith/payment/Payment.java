package org.alexgiou.springmodulith.payment;

import jakarta.persistence.*;
import lombok.*;
import org.alexgiou.springmodulith.payment.type.PaymentStatus;

import java.sql.Timestamp;
import java.time.Instant;

/**
 * @author: Alexandros Giounan
 * @code @created: 9/25/2024
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderId;
    private long amount;
    private Timestamp paymentDate = Timestamp.from(Instant.now());
    private PaymentStatus paymentStatus = PaymentStatus.INCOMPLETE;

}

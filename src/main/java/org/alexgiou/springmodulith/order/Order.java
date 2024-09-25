package org.alexgiou.springmodulith.order;

import jakarta.persistence.*;
import lombok.*;
import org.alexgiou.springmodulith.order.type.Status;

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
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderIdentifier;
    private String customerName;
    private String customerEmail;
    private Timestamp orderDate =  Timestamp.from(Instant.now());
    private Status status = Status.OPEN;
}

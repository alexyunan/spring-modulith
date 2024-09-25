package org.alexgiou.springmodulith.order;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

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
@Table(indexes = {
        @Index(name = "order_idx", columnList = "order_id"),
        @Index(name = "inventory_idx", columnList = "inventory_id")
})
public class OrderInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long orderId;
    private Long inventoryId;
    private int quantity;
    private BigDecimal totalQtyPrice;
}

package org.alexgiou.springmodulith.inventory;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @author: Alexandros Giounan
 * @code @created: 9/25/2024
 */
@Entity
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(indexes = @Index(name = "inv_name_Idx", columnList = "name"))
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String name;
    private String description;
    private BigDecimal price;
}

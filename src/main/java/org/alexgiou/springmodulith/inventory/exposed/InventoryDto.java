package org.alexgiou.springmodulith.inventory.exposed;

import java.math.BigDecimal;

/**
 * @author: Alexandros Giounan
 * @code @created: 9/26/2024
 */

public record InventoryDto(Long id, String name, String description, BigDecimal price) {

}

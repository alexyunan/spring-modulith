package org.alexgiou.springmodulith.order;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * @author: Alexandros Giounan
 * @code @created: 9/25/2024
 */

public interface OrderInventoryRepository extends CrudRepository<OrderInventory, Long> {

    @Query(nativeQuery = true, value = "SELECT SUM(order_inventory.total_qty_price) FROM order_inventory oi WHERE oi.order_id = :orderId")
    long orderIdAmount(Long orderId);
}

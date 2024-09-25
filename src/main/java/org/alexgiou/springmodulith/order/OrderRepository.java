package org.alexgiou.springmodulith.order;


import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author: Alexandros Giounan
 * @code @created: 9/25/2024
 */

 interface OrderRepository extends CrudRepository<Order, Long> {

    Optional<Order> getOrderByOrderIdentifier(String orderIdentifier);
}

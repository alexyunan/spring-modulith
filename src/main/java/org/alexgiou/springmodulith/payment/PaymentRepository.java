package org.alexgiou.springmodulith.payment;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author: Alexandros Giounan
 * @code @created: 9/25/2024
 */

public interface PaymentRepository extends CrudRepository<Payment, Long> {
    Optional<Payment> getPaymentsByOrderId(String orderId);
}

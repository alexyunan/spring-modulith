package org.alexgiou.springmodulith.inventory;


import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author: Alexandros Giounan
 * @code @created: 9/25/2024
 */

public interface InventoryRepository extends CrudRepository<Inventory, Long> {

    Optional<Inventory> getInventoryByName(String name);

    List<Inventory> getInventoryByNameIn(List<String> names);
}

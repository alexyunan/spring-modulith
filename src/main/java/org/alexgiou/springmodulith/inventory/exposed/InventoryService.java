package org.alexgiou.springmodulith.inventory.exposed;


import java.util.List;

/**
 * @author: Alexandros Giounan
 * @code @created: 9/26/2024
 */

public interface InventoryService {

    InventoryDto fetchInventoryByName(String name);

    List<InventoryDto> fetchAllInName(List<String> inventoryNames);
}

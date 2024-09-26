package org.alexgiou.springmodulith.inventory;

import lombok.experimental.UtilityClass;
import org.alexgiou.springmodulith.inventory.exposed.InventoryDto;

/**
 * @author: Alexandros Giounan
 * @code @created: 9/26/2024
 */

@UtilityClass
public class InventoryUtil {

    public InventoryDto mapInventoryToDto(Inventory inventory) {
        return new InventoryDto(inventory.getId(), inventory.getName(), inventory.getDescription(), inventory.getPrice());

    }

    public Inventory mapDtoToInventory(InventoryDto inventoryDto) {
        return new Inventory(inventoryDto.id(), inventoryDto.name(), inventoryDto.description(), inventoryDto.price());
    }
}

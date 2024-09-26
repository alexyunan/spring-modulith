package org.alexgiou.springmodulith.inventory;

import lombok.RequiredArgsConstructor;

import org.alexgiou.springmodulith.inventory.exposed.InventoryDto;
import org.alexgiou.springmodulith.inventory.exposed.InventoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Alexandros Giounan
 * @code @created: 9/26/2024
 */
@Service
@RequiredArgsConstructor
class InventoryServiceImpl implements InventoryService {

    private final InventoryRepository inventoryRepository;

    @Override
    public InventoryDto fetchInventoryByName(String name) {
        return inventoryRepository.getInventoryByName(name)
                .map(InventoryUtil::mapInventoryToDto)
                .orElseThrow(() -> new IllegalArgumentException("Inventory not found"));
    }

    @Override
    public List<InventoryDto> fetchAllInName(List<String> inventoryNames) {
        return inventoryRepository.getInventoryByNameIn(inventoryNames)
                .stream()
                .map(InventoryUtil::mapInventoryToDto)
                .toList();
    }
}

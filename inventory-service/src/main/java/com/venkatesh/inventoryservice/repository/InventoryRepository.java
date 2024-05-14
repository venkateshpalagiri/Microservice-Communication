package com.venkatesh.inventoryservice.repository;

import com.venkatesh.inventoryservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Product,Long> {
}

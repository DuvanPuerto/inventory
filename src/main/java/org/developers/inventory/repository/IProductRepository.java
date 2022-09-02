package org.developers.inventory.repository;

import org.developers.inventory.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Integer> {}

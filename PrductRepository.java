package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrductRepository extends JpaRepository<Product, Long> {
}

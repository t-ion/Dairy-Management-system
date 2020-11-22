package com.dairy.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairy.product.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}

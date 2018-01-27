package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Integer> {
}

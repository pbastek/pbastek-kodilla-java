package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.domain.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemDao extends CrudRepository<Item, Integer> {
}

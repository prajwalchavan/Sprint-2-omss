package com.project.omss.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.omss.entity.Product;

public interface ProductJpaRepository extends CrudRepository<Product, Integer> {

}

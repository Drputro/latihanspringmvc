package com.eksad.latihanstringmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eksad.latihanstringmvc.model.Product;

public interface ProductRepositoryDAO extends JpaRepository<Product, Long>{

}

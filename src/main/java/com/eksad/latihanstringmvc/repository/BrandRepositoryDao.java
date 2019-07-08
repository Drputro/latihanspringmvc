package com.eksad.latihanstringmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eksad.latihanstringmvc.model.Brand;

public interface BrandRepositoryDao extends JpaRepository<Brand, Long>{

	void deleteById(Long id);

}

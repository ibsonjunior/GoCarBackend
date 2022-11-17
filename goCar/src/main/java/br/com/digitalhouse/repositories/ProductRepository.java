package br.com.digitalhouse.repositories;

import br.com.digitalhouse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findAllProductsByCategoryId(Integer categoryId);

    List<Product> findAllProductsByCityId(Integer cityId);

}
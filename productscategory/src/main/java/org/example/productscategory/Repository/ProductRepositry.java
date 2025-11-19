package org.example.productscategory.Repository;

import org.example.productscategory.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositry extends CrudRepository<Product, Long> {
}

package org.example.productscategory.Service;

import org.example.productscategory.Repository.ProductRepositry;
import org.example.productscategory.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepositry productRepositry;

    public Product createProduct(Product product) {

        return productRepositry.save(product);
    }

    public Product getById(Long id) {
        return productRepositry.findById(id).get();
    }

    public List<Product> getProducts() {
        return (List<Product>)productRepositry.findAll();
    }
}

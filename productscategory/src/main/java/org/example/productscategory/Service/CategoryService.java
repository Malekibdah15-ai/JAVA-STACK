package org.example.productscategory.Service;

import org.example.productscategory.Repository.CategoryRepository;
import org.example.productscategory.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepo;

    public Category createCategry(Category  category) {

        return categoryRepo.save(category);
    }
    public Category getById(Long id) {
        return categoryRepo.findById(id).get();
    }
    public List<Category> getCategories() {
        return (List<Category>) categoryRepo.findAll();
    }

}

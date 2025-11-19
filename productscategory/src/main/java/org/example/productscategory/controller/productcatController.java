package org.example.productscategory.controller;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.example.productscategory.Service.CategoryService;
import org.example.productscategory.Service.ProductService;
import org.example.productscategory.models.Category;
import org.example.productscategory.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class productcatController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String Home(HttpSession session) {
        List<Product> product= productService.getProducts();
        session.setAttribute("products",product);

        List<Category> category= categoryService.getCategories();
        session.setAttribute("category",category);

        return "Home page.jsp";
    }

    @GetMapping("/products/new")
    public String newProduct(@ModelAttribute("product") Product product, Model model) {
        model.addAttribute("product", product);
        return "product.jsp";
    }

    @PostMapping("/products")
    public String createProduct(@ModelAttribute("product") Product product, BindingResult result, Model model) {
        if(result.hasErrors()) {
            return "product.jsp";
        }
        productService.createProduct(product);
        return "redirect:/products/new";
    }

    @GetMapping("/category/new")
    public String newCategory(@ModelAttribute("category") Category category, Model model) {
        model.addAttribute("category", category);
        return "category.jsp";
    }
    @PostMapping("/category's")
    public String createCategory(@ModelAttribute("category") Category category, BindingResult result, Model model) {
        if(result.hasErrors()) {
            return "category.jsp";
        }
        categoryService.createCategry(category);
        return "redirect:/category/new";
    }

    @GetMapping("/products/{id}")
    public String showProduct(@PathVariable("id") Long id, Model model) {
        Product p = productService.getById(id);

        List<Category> allCategories =  categoryService.getCategories();
        allCategories.removeAll(p.getCategories());
        model.addAttribute("products", p);
        model.addAttribute("allCategories", allCategories);
        return "productpage.jsp";
    }
    @PostMapping("/commedites/{id}")
    public String addCategory(@PathVariable("id")Long id, @RequestParam("categoryId")Long categoryId, Model model) {

        Product products = productService.getById(id);
        Category category = categoryService.getById(categoryId);

        products.getCategories().add(category);
        productService.createProduct(products);
        return "redirect:/products/"+id;
    }

    @GetMapping("/categories/{id}")
    public String showCategories(@PathVariable("id")Long id ,Model model) {
        Category category = categoryService.getById(id);
        List<Product> allProducts= productService.getProducts();
        allProducts.removeAll(category.getProducts());


        model.addAttribute("category", category);
        model.addAttribute("allProducts", allProducts);

        return "categorypage.jsp";
    }
    @PostMapping("/category/{id}")
    public String addProduct(@PathVariable("id")Long id, @RequestParam("productId")Long productId ,Model model) {
        Category category = categoryService.getById(id);
        Product products = productService.getById(productId);
        category.getProducts().add(products);
        categoryService.createCategry(category);

        return "redirect:/categories"+id;
    }

}

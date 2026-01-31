package com.ecom.product.Config;

import com.ecom.product.Model.Category;
import com.ecom.product.Model.Product;
import com.ecom.product.Repository.CategoryRepository;
import com.ecom.product.Repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) {
        if (categoryRepository.count() > 0) return; // Skip if DB already seeded

        // Create Categories
        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category home = new Category();
        home.setName("Home and Kitchen");

        categoryRepository.saveAll(Arrays.asList(electronics, clothing, home));

        // Create Products
        Product phone = new Product();
        phone.setName("SmartPhone");
        phone.setDescription("Latest Model SmartPhone with Amazing Features.");
        phone.setImageUrl("https://placehold.co/600x400");
        phone.setPrice(699.99);
        phone.setCategory(electronics);

        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setDescription("High Performance Laptop.");
        laptop.setImageUrl("https://placehold.co/600x400");
        laptop.setPrice(999.99);
        laptop.setCategory(electronics);

        Product jacket = new Product();
        jacket.setName("Jacket");
        jacket.setDescription("Warm and Cozy Jacket for Winter.");
        jacket.setImageUrl("https://placehold.co/600x400");
        jacket.setPrice(129.99);
        jacket.setCategory(clothing);

        Product blender = new Product();
        blender.setName("Blender");
        blender.setDescription("Best Blender for Making Juices and Shakes.");
        blender.setImageUrl("https://placehold.co/600x400");
        blender.setPrice(200.99);
        blender.setCategory(home);

        productRepository.saveAll(Arrays.asList(phone, laptop, jacket, blender));
    }
}



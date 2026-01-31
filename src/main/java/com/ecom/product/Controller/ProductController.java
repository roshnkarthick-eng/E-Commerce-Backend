package com.ecom.product.Controller;

import com.ecom.product.Model.Product;
import com.ecom.product.Service.ProductService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // GET all products (paginated)
    @GetMapping
    public Page<Product> getAllProducts(Pageable pageable) {
        return productService.getAllProducts(pageable);
    }

    // GET product by ID
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    // GET products by category (paginated)
    @GetMapping("/category/{categoryId}")
    public Page<Product> getAllProductByCategory(
            @PathVariable Long categoryId,
            Pageable pageable) {
        return productService.getProductByCategory(categoryId, pageable);
    }

    // CREATE product
    @PostMapping("/category/{categoryId}")
    public Product createProduct(@Valid @RequestBody Product product,
                                 @PathVariable Long categoryId) {
        return productService.createProduct(product, categoryId);
    }

    // UPDATE product
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id,
                                 @Valid @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    // DELETE product
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}


package rondos.xdev.practicetaskreactive.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import rondos.xdev.practicetaskreactive.model.Product;
import rondos.xdev.practicetaskreactive.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public Flux<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
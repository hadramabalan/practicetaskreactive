package rondos.xdev.practicetaskreactive.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import rondos.xdev.practicetaskreactive.model.Product;

public interface ProductRepository extends ReactiveCrudRepository<Product, Long> {
}

package rondos.xdev.practicetaskreactive.model;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table("products")
public class Product {
    @Id
    private Long id;
    @NotBlank
    private String name;
    private ProductCategory category;
//    @JoinColumn(name = "customer_id")
    private Customer customer;
    private LocalDate validFrom;
    private LocalDate validTo;
}

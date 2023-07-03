package rondos.xdev.practicetaskreactive.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table("customers")
public class Customer {
    @Id
    private Long id;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
//    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Product> products;
    @NotBlank
//    @Enumerated(EnumType.STRING)
    private Status status;

    //attributes used for example matching
    //TODO change transient annotation to transient keyword after debugging (this way it shows up in query results)
    @Transient
    private int productsSizeMin;
    @Transient
    private int productsSizeMax;
    @Transient
    private int productsSize;
    @Transient
    private Long idLessThan;
    @Transient
    private Long idLessThanOrEqualTo;
    @Transient
    private Long idGreaterThan;
    @Transient
    private Long idGreaterThanOrEqualTo;
}

package ProductMgt;

import ProviderMgt.Provider;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter //generates all getters for all attributes
@Setter //generates all setters
@AllArgsConstructor //generates an constructor with all attributes
//@NoArgsConstructor //generates a no args constructor
@ToString //overrides the method toString using all attributes
//@EqualsAndHashCode //overrides equals and hashCode methods using all attributes
@EqualsAndHashCode(onlyExplicitlyIncluded = true)//uses only attributes annotated with Include for comparing
public class Product {
    private long id;
    private static long lastId=0;
    @EqualsAndHashCode.Include
    private String label;
    private BigDecimal price;
    @EqualsAndHashCode.Include
    private LocalDate expiredDate;
    @EqualsAndHashCode.Include
    private LocalDate fabricationDate;
    private int stock;
    private String description;
    @ToString.Exclude
    private byte[] photo;
    private Provider productProvider;
    public Product()
    {
        id=++lastId;
    }

}

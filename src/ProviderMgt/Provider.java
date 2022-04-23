package ProviderMgt;

import ProductMgt.Product;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Provider {
    private long id;
    private static long lastId=0;
    @EqualsAndHashCode.Include
    private String name;
    @NonNull //required
    @EqualsAndHashCode.Include
    private String email;
    private String telephoneNumber;
    private String url;
    @ToString.Exclude
    private Set<Product> lstProducts=new HashSet<>();
    public Provider() {
        this.id=++lastId;
}
}

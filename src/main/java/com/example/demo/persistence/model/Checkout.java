package com.example.demo.persistence.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Map;
import java.util.Objects;

@Data
@Entity
@Table(name = "Checkout")
public class Checkout {
    @Id
    @Column(unique = true)
    private Long customerId;

    private Map<Long,@Size(min = 1, max = 50,message = "Products on Checkout Should be Between 1 to 50") Integer>
            productList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Checkout checkout = (Checkout) o;
        return customerId.equals(checkout.customerId) && productList.equals(checkout.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, productList);
    }
}

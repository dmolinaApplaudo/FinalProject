package com.example.demo.persistence.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table(name = "CHECKOUT")
public class Checkout {
    @Id
    @Column(unique = true)
    private Long customerId;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="customer_id")
    private Set<CartItem> cartItem;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Checkout checkout = (Checkout) o;
        return customerId.equals(checkout.customerId) && cartItem.equals(checkout.cartItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, cartItem);
    }
}

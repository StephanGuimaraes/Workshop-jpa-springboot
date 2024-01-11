package com.stephanguimaraes.projetostephan.entities.pk;

import com.stephanguimaraes.projetostephan.entities.Order;
import com.stephanguimaraes.projetostephan.entities.Product;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderItemPk implements Serializable {

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Order getOrder() {
        return order;
    }

    public Product getProduct() {
        return product;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItemPk orderItemPk = (OrderItemPk) o;
        return Objects.equals(order, orderItemPk.order) && Objects.equals(product, orderItemPk.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, product);
    }
}

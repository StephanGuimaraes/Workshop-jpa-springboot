package com.stephanguimaraes.projetostephan.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stephanguimaraes.projetostephan.entities.enums.OrderStatus;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;


@Entity
@Table(name = "tb_order")
public class Order implements Serializable {


    private Integer orderStauts;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;


    public Order(){}

    public Order(Long id, Instant moment, OrderStatus orderStauts, User client) {
        this.id = id;
        this.moment = moment;
        setOrderStauts(orderStauts);
        this.client = client;

    }

    public Long getId() {
        return id;
    }

    public Instant getMoment() {
        return moment;
    }

    public User getClient() {
        return client;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public OrderStatus getOrderStauts() {
        return OrderStatus.valueOf(orderStauts);
    }

    public void setOrderStauts(OrderStatus orderStauts) {
        if(orderStauts != null) {
            this.orderStauts = orderStauts.getCode();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
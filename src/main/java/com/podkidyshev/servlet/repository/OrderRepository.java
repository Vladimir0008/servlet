package com.podkidyshev.servlet.repository;

import com.podkidyshev.servlet.entity.Order;
import com.podkidyshev.servlet.entity.Product;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {

    private final List<Order> orders;

    public OrderRepository() {
        this.orders = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "Beer", new BigDecimal(40.5)));
        products.add(new Product(2L, "Bread", new BigDecimal(20.0)));
        products.add(new Product(3L, "Meat", new BigDecimal(140.5)));
        products.add(new Product(4L, "Milk", new BigDecimal(35)));

        orders.add(new Order(1L, LocalDate.now(), new BigDecimal(236), products));

        List<Product> products2 = new ArrayList<>();
        products2.add(new Product(2L, "Bread", new BigDecimal(20.0)));
        products2.add(new Product(5L, "Cookies", new BigDecimal(50.0)));
        products2.add(new Product(4L, "Milk", new BigDecimal(35)));
        products2.add(new Product(6L, "Cheese", new BigDecimal(135)));

        orders.add(new Order(2L, LocalDate.now(), new BigDecimal(240), products2));

    }

    public Order findById(Long id) {
        return orders.stream()
                .filter(o -> o.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Order> findAll() {
        return orders;
    }

    public void add(Order order) {
        orders.add(order);
    }

}

package com.podkidyshev.servlet.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
public class Order {

    private Long id;

    private LocalDate date;

    private BigDecimal cost;

    private List<Product> products;
}

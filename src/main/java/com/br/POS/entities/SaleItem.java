package com.br.POS.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_saleitem")
public class SaleItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "sale_id")
    private Sale sale;

    @ManyToOne
    @JoinColumn(name = "product_id")
    public Product product;

    private int quantity;

}

package com.br.POS.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "sale")
@Getter
@Setter
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private BigDecimal total;
    private Date date;
    @OneToMany
    @JoinColumn(name = "item_id")
    public List<SaleItem> items;
    @OneToOne
    @JoinColumn(name = "client_id")
    public Customer customer;
    @OneToOne
    @JoinColumn(name = "user_id")
    public User user;
}

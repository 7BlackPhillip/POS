package com.br.POS.entities;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table()
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private BigDecimal price;
    private int amountProduct;
    @ManyToOne
    @JoinColumn(name = "product_id")
    public Product product;
    @OneToOne
    @JoinColumn(name = "client_id")
    public Client client;
    @OneToOne
    @JoinColumn(name = "user_id")
    public User user;
}

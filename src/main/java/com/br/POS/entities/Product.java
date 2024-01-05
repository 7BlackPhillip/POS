package com.br.POS.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
@Entity
@Table(name = "tb_product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String description;
	private BigDecimal price;
	@OneToOne
	@JoinColumn(name = "group_id")
	public ProductGroup group;
	private String measure;
	private int amount;

}

package com.br.POS.DTOs;

import com.br.POS.entities.SaleItem;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class SaleDTO {
    private long customerID;
    private List<SaleItemDTO> items;
    private Date date;
    private BigDecimal total;
}

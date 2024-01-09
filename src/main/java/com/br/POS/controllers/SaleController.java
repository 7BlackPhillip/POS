package com.br.POS.controllers;

import com.br.POS.DTOs.SaleDTO;
import com.br.POS.entities.Sale;
import com.br.POS.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sale")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @PostMapping
    public ResponseEntity<Sale> creatSale(@RequestBody SaleDTO saleDTO){
        Sale sale = saleService.createSale(saleDTO);
        return new ResponseEntity<>(sale, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Sale>> getAllSales(){
        List<Sale> sales = saleService.getAllSales();
        return new ResponseEntity<>(sales, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Sale> getSaleById(@PathVariable long id){
        Sale sale = saleService.getSaleById(id);
        return new ResponseEntity<>(sale, HttpStatus.OK);
    }
}

package com.br.POS.controllers;

import com.br.POS.DTOs.SaleItemDTO;
import com.br.POS.entities.Sale;
import com.br.POS.entities.SaleItem;
import com.br.POS.service.SaleItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/saleItem")
public class SaleItemController {

    @Autowired
    private SaleItemService saleItemService;

    @PostMapping
    public ResponseEntity<SaleItem> createSaleItem(@RequestBody SaleItemDTO saleItemDTO){
        SaleItem saleItem = saleItemService.creatSaleItem(saleItemDTO);
        return new ResponseEntity<>(saleItem, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<SaleItem>> getAllSaleItemBySaleId(@PathVariable long saleId){
        List<SaleItem> saleItems = saleItemService.getAllSaleItemsBySaleId(saleId);
        return new ResponseEntity<>(saleItems, HttpStatus.OK);
    }
}

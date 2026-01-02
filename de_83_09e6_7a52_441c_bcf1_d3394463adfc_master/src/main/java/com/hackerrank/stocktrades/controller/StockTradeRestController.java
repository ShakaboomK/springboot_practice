package com.hackerrank.stocktrades.controller;

import com.hackerrank.stocktrades.model.StockTrade;
import com.hackerrank.stocktrades.repository.StockTradeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trades")
public class StockTradeRestController {
    private final StockTradeRepository repository;

    public StockTradeRestController(StockTradeRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<StockTrade> createStockTrade(@RequestBody StockTrade request){
        return new ResponseEntity<>(repository.save(request), HttpStatus.CREATED);
    }
}

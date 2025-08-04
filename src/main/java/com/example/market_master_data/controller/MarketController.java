package com.example.market_master_data.controller;

import com.example.market_master_data.dto.MarketDto;
import com.example.market_master_data.service.MarketService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/markets")
public class MarketController {
    private final MarketService marketService;

    @GetMapping
    public ResponseEntity<Page<MarketDto>> getMarkets(Pageable pageable) {
        return ResponseEntity.ok(marketService.getMarkets(pageable));
    }

    @GetMapping("/{marketId}")
    public ResponseEntity<MarketDto> getMarketByMarketId(@PathVariable UUID marketId) {
        return ResponseEntity.ok(marketService.getMarketByMarketId(marketId));
    }

    @GetMapping("/brand/{brand}")
    public ResponseEntity<Page<MarketDto>> getMarketsByBrand(@PathVariable String brand, Pageable pageable) {
        return ResponseEntity.ok(marketService.getMarketsByBrand(brand, pageable));
    }
}

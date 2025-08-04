package com.example.market_master_data.service;

import com.example.market_master_data.dto.MarketDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface MarketService {
    Page<MarketDto> getMarkets(Pageable pageable);

    MarketDto getMarketByMarketId(UUID id);

    Page<MarketDto> getMarketsByBrand(String brand, Pageable pageable);
}

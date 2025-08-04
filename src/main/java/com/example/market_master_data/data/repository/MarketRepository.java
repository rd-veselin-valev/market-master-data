package com.example.market_master_data.data.repository;

import com.example.market_master_data.data.entity.market.Market;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MarketRepository extends JpaRepository<Market, Integer> {
    Market findMarketByMarketId(UUID marketId);

    Page<Market> findMarketsByBrand(String brand, Pageable pageable);
}

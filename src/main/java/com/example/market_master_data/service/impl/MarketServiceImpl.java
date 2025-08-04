package com.example.market_master_data.service.impl;

import com.example.market_master_data.data.repository.MarketRepository;
import com.example.market_master_data.dto.MarketDto;
import com.example.market_master_data.mapper.MarketMapper;
import com.example.market_master_data.service.MarketService;
import com.example.market_master_data.util.message.ErrorMessages;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MarketServiceImpl implements MarketService {
    private final MarketRepository marketRepository;
    private final MarketMapper marketMapper;

    @Override
    public Page<MarketDto> getMarkets(Pageable pageable) {
        return marketRepository
                .findAll(pageable)
                .map(marketMapper::toMarketDto);
    }

    @Override
    public MarketDto getMarketByMarketId(UUID marketId) {
        var market = marketRepository.findMarketByMarketId(marketId);

        if (market == null) {
            throw new EntityNotFoundException(ErrorMessages.MARKET_NOT_FOUND);
        }

        return marketMapper.toMarketDto(market);
    }

    @Override
    public Page<MarketDto> getMarketsByBrand(String brand, Pageable pageable) {
        return marketRepository
                .findMarketsByBrand(brand, pageable)
                .map(marketMapper::toMarketDto);
    }
}

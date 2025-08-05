package com.example.market_master_data.mapper;

import com.example.market_master_data.data.entity.Market;
import com.example.market_master_data.dto.MarketDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MarketMapper {
    MarketDto toMarketDto(Market mission);
}
package com.example.market_master_data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MarketDto {
    private int id;

    private LocalDateTime created;

    private LocalDateTime updated;

    private UUID marketId;

    private String address;

    private String city;

    private String country;

    private String brand;
}

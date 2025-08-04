CREATE INDEX IF NOT EXISTS idx_market_market_id
    ON market (market_id);

CREATE INDEX IF NOT EXISTS idx_market_brand
    ON market (brand);

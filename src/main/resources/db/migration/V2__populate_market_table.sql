DO $$
BEGIN
FOR i IN 1..7300 LOOP
    INSERT INTO market (
      created,
      updated,
      market_id,
      address,
      city,
      country,
      brand
    ) VALUES (
      NOW(),
      NOW(),
      gen_random_uuid(),
      'Address ' || i,
      'City ' || (trunc(random() * 100)::int + 1),
      'Country ' || (trunc(random() * 10)::int + 1),
      (ARRAY['REWE', 'PENNY', 'Billa', 'Toom'])[floor(random() * 4 + 1)]
    );
END LOOP;
END$$;

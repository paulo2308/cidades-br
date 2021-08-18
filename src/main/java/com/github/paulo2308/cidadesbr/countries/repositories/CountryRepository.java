package com.github.paulo2308.cidadesbr.countries.repositories;

import com.github.paulo2308.cidadesbr.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}

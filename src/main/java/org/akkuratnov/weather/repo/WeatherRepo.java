package org.akkuratnov.weather.repo;

import org.akkuratnov.weather.domain.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepo extends JpaRepository<Weather, Long> {
}

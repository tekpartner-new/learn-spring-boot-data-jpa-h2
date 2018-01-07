package net.tekpartner.learn.restjpa.persistence.jpa;

import net.tekpartner.learn.restjpa.persistence.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CityRepository extends JpaRepository<City, Long>, JpaSpecificationExecutor<City> {
}

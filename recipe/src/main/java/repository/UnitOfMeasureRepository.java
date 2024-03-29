package repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository <UnitOfMeasure, Long>{

	Optional<UnitOfMeasure> findByDescription(String string);

	Optional<UnitOfMeasure> findByDescription(String string);

}

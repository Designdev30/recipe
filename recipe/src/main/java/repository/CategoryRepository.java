package repository;

import java.util.Locale.Category;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository <Category, Long>{

}

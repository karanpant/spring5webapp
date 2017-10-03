package mydailyprocess.wordpress.com.spring5webapp.repositories;

import mydailyprocess.wordpress.com.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>{
}

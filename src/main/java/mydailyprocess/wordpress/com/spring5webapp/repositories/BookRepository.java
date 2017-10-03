package mydailyprocess.wordpress.com.spring5webapp.repositories;

import mydailyprocess.wordpress.com.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}

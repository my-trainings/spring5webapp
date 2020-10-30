package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Walid LARABI on Sep, 2020
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}

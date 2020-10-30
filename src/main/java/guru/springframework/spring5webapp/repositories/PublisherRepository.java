package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Walid LARABI on Sep, 2020
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

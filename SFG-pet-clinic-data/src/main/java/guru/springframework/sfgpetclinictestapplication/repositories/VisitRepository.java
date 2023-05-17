package guru.springframework.sfgpetclinictestapplication.repositories;

import guru.springframework.sfgpetclinictestapplication.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}

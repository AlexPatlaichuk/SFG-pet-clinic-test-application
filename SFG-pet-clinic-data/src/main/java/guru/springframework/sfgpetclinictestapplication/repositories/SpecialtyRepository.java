package guru.springframework.sfgpetclinictestapplication.repositories;

import guru.springframework.sfgpetclinictestapplication.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}

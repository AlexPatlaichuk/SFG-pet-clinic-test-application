package guru.springframework.sfgpetclinictestapplication.repositories;

import guru.springframework.sfgpetclinictestapplication.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}

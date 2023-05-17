package guru.springframework.sfgpetclinictestapplication.repositories;

import guru.springframework.sfgpetclinictestapplication.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}

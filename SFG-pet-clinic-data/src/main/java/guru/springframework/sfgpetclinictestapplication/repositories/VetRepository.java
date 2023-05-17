package guru.springframework.sfgpetclinictestapplication.repositories;

import guru.springframework.sfgpetclinictestapplication.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}

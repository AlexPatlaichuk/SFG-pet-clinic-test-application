package guru.springframework.sfgpetclinictestapplication.services;

import guru.springframework.sfgpetclinictestapplication.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save (Vet vet);

    Set<Vet> findAll();
}

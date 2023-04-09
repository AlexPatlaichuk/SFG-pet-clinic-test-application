package guru.springframework.sfgpetclinictestapplication.services;

import guru.springframework.sfgpetclinictestapplication.model.Owner;

public interface OwnerService extends CRUDService<Owner, Long> {

    Owner findByLastName(String lastName);

}

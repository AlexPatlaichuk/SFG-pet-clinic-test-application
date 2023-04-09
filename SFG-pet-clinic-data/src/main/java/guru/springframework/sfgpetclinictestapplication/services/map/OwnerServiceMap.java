package guru.springframework.sfgpetclinictestapplication.services.map;

import guru.springframework.sfgpetclinictestapplication.model.Owner;
import guru.springframework.sfgpetclinictestapplication.services.CRUDService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CRUDService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}

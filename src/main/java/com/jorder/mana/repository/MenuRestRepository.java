package com.jorder.mana.repository;
import com.jorder.mana.entity.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(
        path = "menus",
        collectionResourceRel = "menus"
)
public interface MenuRestRepository extends CrudRepository<Menu, UUID> {
}

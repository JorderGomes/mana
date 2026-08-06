package com.jorder.mana.repository;
import com.jorder.mana.entity.SideDish;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(
        path = "side-dishes",
        collectionResourceRel = "side-dishes"
)
public interface SideDishRestRepository extends CrudRepository<SideDish, UUID> {
}

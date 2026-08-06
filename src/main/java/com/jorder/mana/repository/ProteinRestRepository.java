package com.jorder.mana.repository;

import com.jorder.mana.entity.Protein;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(
        path = "proteins",
        collectionResourceRel = "proteins"
)
public interface ProteinRestRepository extends CrudRepository<Protein, UUID> {
}

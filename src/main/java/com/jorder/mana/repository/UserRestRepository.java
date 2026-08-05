package com.jorder.mana.repository;

import com.jorder.mana.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(
        path = "users",
        collectionResourceRel = "users"
)
public interface UserRestRepository extends CrudRepository<User, UUID> {
}

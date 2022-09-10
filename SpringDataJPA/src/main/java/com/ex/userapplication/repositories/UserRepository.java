package com.ex.userapplication.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ex.userapplication.entities.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer>{

}

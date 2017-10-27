package com.girish.entity;

import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends  CrudRepository<User, Long>
{

}

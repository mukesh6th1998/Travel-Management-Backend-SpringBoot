package com.example.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Users;

public interface UsersRepo extends CrudRepository<Users,String> {

}

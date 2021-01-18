package com.example.repo;
import org.springframework.data.repository.CrudRepository;

import com.example.model.Travels;
public interface TravelsRepo extends CrudRepository<Travels,Integer> {

}

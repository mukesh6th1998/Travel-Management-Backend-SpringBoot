package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Travels;
import com.example.repo.TravelsRepo;

@Service
public class TravelsService {
	
	@Autowired
	TravelsRepo tr;
	
	public void save(Travels t) {
		tr.save(t);
	}
	
	public void update(Travels t) {
		tr.save(t);
	}
	
	public List<Travels> getAll(){
		List<Travels> tl = new ArrayList<Travels>();
		tr.findAll().forEach(t -> tl.add(t));
		return tl;
	}
	
	
	public void delete(int id) {
		tr.deleteById(id);
	}

}

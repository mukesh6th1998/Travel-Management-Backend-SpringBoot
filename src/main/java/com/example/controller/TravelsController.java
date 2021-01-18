package com.example.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Travels;
import com.example.service.TravelsService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class TravelsController {
	
	@Autowired
	TravelsService ts;
	
	@GetMapping("/journeys")
	public List<Travels> getAll(){
		return ts.getAll();
	}
	
	
	@PostMapping("/add")
	public String save(@RequestBody Travels t) {
		ts.save(t);
		return "Journey added successfully.";
	}
	
	
	@PutMapping("/update")
	public String update(@RequestBody Travels t) {
		ts.update(t);
		return "Journey updated successfully.";
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		ts.delete(id);
		return "Journey deleted successfully.";
	}
	
	

}

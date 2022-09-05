package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.User;
import fr.solutec.repository.UserRepository;

@RestController @CrossOrigin("*")

public class UserRest {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/user")
	public Iterable<User> getAllUser() {
		return userRepo.findAll();
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getAllUser(@PathVariable Long id){
		return userRepo.findById(id);
	}
	
	
	@PostMapping("/login")
	public Optional <User> getLoginAndPassword(@RequestBody User u) {			
		return userRepo.findByLoginAndPassword(u.getLogin(),u.getPassword());					
	}	
	
	@PostMapping("/signin")
	public User saveNewUser(@RequestBody User u) {			
		return userRepo.save(u);					
	}	
	
	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User user) {
		return userRepo.save(user);
		
	}
		
	
	
	
}

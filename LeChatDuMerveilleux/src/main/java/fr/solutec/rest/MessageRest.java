package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import fr.solutec.entities.Message;
import fr.solutec.repository.MessageRepository;

@RestController @CrossOrigin("*")
public class MessageRest {
	
	@Autowired
	private MessageRepository messageRepo;

	@GetMapping("/chattin")
	public Iterable<Message> getAllMessage() {
		return messageRepo.findAll();
	}
	
	@PostMapping("chattin")
	public Message saveMemo(@RequestBody Message m) {
		return messageRepo.save(m);
	}
	
}

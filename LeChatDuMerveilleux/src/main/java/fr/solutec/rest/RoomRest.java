package fr.solutec.rest;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Message;
import fr.solutec.entities.Room;
import fr.solutec.repository.RoomRepository;


public class RoomRest {
	@Autowired
	private  RoomRepository roomRepo;
	
	@GetMapping("/rooms/names")
	public Iterable<Room> getAllRooms() {
		return roomRepo.findAll();
	}

}

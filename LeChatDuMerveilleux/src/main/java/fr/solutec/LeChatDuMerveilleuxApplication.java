package fr.solutec;



import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.Message;
import fr.solutec.entities.Room;
import fr.solutec.entities.User;
import fr.solutec.repository.MessageRepository;
import fr.solutec.repository.RoomRepository;
import fr.solutec.repository.UserRepository;

@SpringBootApplication
public class LeChatDuMerveilleuxApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private MessageRepository messageRepo;
	
	@Autowired
	private RoomRepository roomRepo;
	
	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	
	public static void main(String[] args) {
		System.out.println("Lancement démarré");
		SpringApplication.run(LeChatDuMerveilleuxApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Lancement terminé");
		
		User mohammed = new User(null, "Momo", "login1", "password1","0601020304",50, "https://avatars.dicebear.com/api/bottts/17508.svg"); 
		User guillaume = new User(null, "Guigui", "login2", "password2", "0611121314", 40,  "https://avatars.dicebear.com/api/bottts/15432.svg"); 
		User adrien = new User(null, "Dridri", "login3", "password3", "0621222324", 60,  "https://avatars.dicebear.com/api/bottts/42345.svg"); 
		User shajiesan = new User(null, "Sai", "login4", "password4", "0631323334", 100,  "https://avatars.dicebear.com/api/bottts/56722.svg");	
		userRepo.save(mohammed);
		userRepo.save(guillaume);
		userRepo.save(adrien);
		userRepo.save(shajiesan);
		
		
		Room Room1 = new Room("1", "Room1");
		roomRepo.save(Room1);
		Room Room2 = new Room("2", "Room2");
		roomRepo.save(Room2);
		roomRepo.save(new Room("3", "General"));
		roomRepo.save(new Room("4", "Projet"));

		messageRepo.save(new Message(null, "Contenu1", timestamp, guillaume, Room1));
		messageRepo.save(new Message(null, "Contenu2", timestamp, guillaume, Room1));
		messageRepo.save(new Message(null, "Contenu3", timestamp, guillaume, Room2));
		messageRepo.save(new Message(null, "Contenu4", timestamp, guillaume, Room2));

	}

}

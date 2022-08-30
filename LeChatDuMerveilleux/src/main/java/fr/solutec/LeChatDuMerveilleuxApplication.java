package fr.solutec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.Message;
import fr.solutec.entities.User;
import fr.solutec.repository.MessageRepository;
import fr.solutec.repository.UserRepository;

@SpringBootApplication
public class LeChatDuMerveilleuxApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private MessageRepository messageRepo;

	public static void main(String[] args) {
		System.out.println("Lancement démarré");
		SpringApplication.run(LeChatDuMerveilleuxApplication.class, args);
		
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Lancement terminé");
		
		
		
		User mohammed = new User(null, "Momo", "login1", "password1");
		User guillaume = new User(null, "Guigui", "login2", "password2");
		User adrien = new User(null, "Dridri", "login3", "password3");
		User shajiesan = new User(null, "Sai", "login4", "password4");
		
		userRepo.save(mohammed);
		userRepo.save(guillaume);
		userRepo.save(adrien);
		userRepo.save(shajiesan);
		
		

		messageRepo.save(new Message(null, "Contenu1", "2021-01-20", guillaume));
		messageRepo.save(new Message(null, "Contenu2", "2021-01-20", guillaume));
		messageRepo.save(new Message(null, "Contenu3", "2021-01-20", guillaume));
		messageRepo.save(new Message(null, "Contenu4", "2021-01-20", guillaume));

		
	}

}

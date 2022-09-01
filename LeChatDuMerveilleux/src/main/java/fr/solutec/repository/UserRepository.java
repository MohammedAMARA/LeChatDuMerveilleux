package fr.solutec.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import fr.solutec.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
	public Optional <User> findByLoginAndPassword(String login, String password);
	
	
}


		
		/*
		static List<fr.solutec.entities.User> loadUsersFromDb() {
			List<User> User = new ArrayList<User>();
			User.add();
			return User;
		}
		
		List<User> users = loadUsersFromDb();
		
		static List<User> getAllUsers(){
			return users;
		}
		
		public default void updateUser(User user) {
			for(User currentUser: users) {
				boolean resourceFound = false;
				if (currentUser.getId() == user.id) {
					resourceFound = true;
					// on update le pseudo, l'email et le N° de telephone
					currentUser.setPseudo(user.getPseudo());
					currentUser.setEmail(user.getEmail());
					currentUser.setTelephone(user.getTelephone());
				}
			}
		}*/
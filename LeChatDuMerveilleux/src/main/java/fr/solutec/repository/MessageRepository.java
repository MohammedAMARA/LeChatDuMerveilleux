package fr.solutec.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import fr.solutec.entities.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {
	public Iterable<Message> findByRoomId(Long id);

}

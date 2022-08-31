package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Room;

public interface RoomRepository extends CrudRepository<Room, Long> {

}

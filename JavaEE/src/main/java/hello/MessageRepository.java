package hello;

import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
    
	Iterable<Message> findByFromUser(String fromUser);
	Iterable<Message> findAll();
}
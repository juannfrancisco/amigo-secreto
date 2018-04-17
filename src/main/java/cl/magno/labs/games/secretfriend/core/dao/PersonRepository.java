package cl.magno.labs.games.secretfriend.core.dao;

import cl.magno.labs.games.secretfriend.core.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

}

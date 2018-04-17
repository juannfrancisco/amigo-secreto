package cl.magno.labs.games.secretfriend.core.controller;

import cl.magno.labs.games.secretfriend.core.dao.PersonRepository;
import cl.magno.labs.games.secretfriend.core.dao.RaffleRepository;
import cl.magno.labs.games.secretfriend.core.model.Person;
import cl.magno.labs.games.secretfriend.core.model.Raffle;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(value = "Person microservice", description = "This API has a CRUD for person")
//@RequestMapping( value="/api")
@RestController
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @InjectService
    public void setRepository(PersonRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET , value="/person/{id}")
    @ApiOperation(value = "Busca una persona por el id", notes = "Retorna un objeto de tipo Person" )
    public Person getPerson(@PathVariable("id") Long id ){
        return repository.findOne( id );
    }

    @RequestMapping(method = RequestMethod.GET , value="/person" )
    @ApiOperation(value = "Obtiene todos los sorteos almacenados", notes = "Retorna una lista de sorteos" )
    public List<Person> getPeople(){
        List<Person> people = new ArrayList<Person>();
        Iterable<Person> peopleIt =  repository.findAll();
        for(Person person : peopleIt ){
            people.add(person);
        }
        return people;
    }

    @RequestMapping(method = RequestMethod.POST , value="/person")
    @ApiOperation(value = "Obtiene todos los sorteos almacenados", notes = "Retorna una lista de sorteos" )
    public Person putPerson( Person person ){
        repository.save(person);
        return person;
    }
}
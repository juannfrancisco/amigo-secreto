package cl.magno.labs.games.secretfriend.core.controller;

import cl.magno.labs.games.secretfriend.core.dao.RaffleRepository;
import cl.magno.labs.games.secretfriend.core.model.Raffle;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(value = "Raffle microservice", description = "This API has a CRUD for raffle")
//@RequestMapping( value="/api")
@RestController
public class RaffleController {

    @Autowired
    private RaffleRepository repository;

    @InjectService
    public void setRepository(RaffleRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET , value="/raffle/{id}")
    @ApiOperation(value = "Busca un sorteo por el id", notes = "Retorna un objeto de tipo sorteo" )
    public Raffle getRaffle( @PathVariable("id") Integer id ){
        return repository.findOne( id );
    }

    @RequestMapping(method = RequestMethod.GET , value="/raffle" )
    @ApiOperation(value = "Obtiene todos los sorteos almacenados", notes = "Retorna una lista de sorteos" )
    public List<Raffle> getRaffles(){
        List<Raffle> raffles = new ArrayList<Raffle>();
        Iterable<Raffle> rafflesIt =  repository.findAll();
        for(Raffle raff : rafflesIt ){
            raffles.add(raff);
        }
        return raffles;
    }

    @RequestMapping(method = RequestMethod.POST , value="/raffle")
    @ApiOperation(value = "Obtiene todos los sorteos almacenados", notes = "Retorna una lista de sorteos" )
    public Raffle putRaffle( @RequestBody Raffle raffle ){
        System.out.print( raffle.getDescription() );
        System.out.print( raffle.getName() );
        repository.save(raffle);
        return raffle;
    }
}
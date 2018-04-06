package cl.magno.labs;


import cl.magno.labs.games.secretfriend.core.model.Person;
import cl.magno.labs.games.secretfriend.core.services.RaffleService;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    /**
     *
     * @param args
     */
    public static void main(String[] args){

        Person person1 = new Person("juan", "jmaldonado@kvz.cl");
        Person person2 = new Person("oscar", "oscar@kvz.cl");
        Person person3 = new Person("sebastian", "seba@kvz.cl");
        Person person4 = new Person("raul", "raul@kvz.cl");

        List<Person> people = new ArrayList<Person>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        RaffleService.doRaffle(people);


    }


}

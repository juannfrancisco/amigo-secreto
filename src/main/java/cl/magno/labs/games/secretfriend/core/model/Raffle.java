package cl.magno.labs.games.secretfriend.core.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "raffle")
public class Raffle implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;

    @Transient
    private List<String> rules;

    @Transient
    private List<Person> members;


    public Raffle() {
    }

    public Raffle(int id) {
        this.id = id;
    }

    public Raffle(int id, String name, String description, List<String> rules, List<Person> members) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.rules = rules;
        this.members = members;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getRules() {
        return rules;
    }

    public void setRules(List<String> rules) {
        this.rules = rules;
    }

    public List<Person> getMembers() {
        return members;
    }

    public void setMembers(List<Person> members) {
        this.members = members;
    }
}

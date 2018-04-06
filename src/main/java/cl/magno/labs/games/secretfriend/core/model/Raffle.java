package cl.magno.labs.games.secretfriend.core.model;

import java.util.List;

public class Raffle {

    private String id;
    private String name;
    private String description;
    private List<String> rules;
    private List<Person> members;


    public Raffle() {
    }

    public Raffle(String id) {
        this.id = id;
    }

    public Raffle(String id, String name, String description, List<String> rules, List<Person> members) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.rules = rules;
        this.members = members;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

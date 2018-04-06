package cl.magno.labs.games.secretfriend.core.model;

import java.util.List;

/**
 * @author JUAN MALDONADO LEON - MLABS
 * 2011
 */
public class Person {

    private int id;

    private String name;

    private String email;

    private String likes;

    private String dislikes;

    private List<String> clues;

    private Person secretFriend;


    /**
     *
     */
    public Person() {
    }

    /**
     *
     * @param id
     */
    public Person(int id) {
        this.id = id;
    }

    /**
     *
     * @param name
     */
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     *
     * @param id
     * @param name
     * @param email
     * @param likes
     * @param dislikes
     * @param clues
     * @param secretFriend
     */
    public Person(int id, String name, String email, String likes, String dislikes, List<String> clues, Person secretFriend) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.likes = likes;
        this.dislikes = dislikes;
        this.clues = clues;
        this.secretFriend = secretFriend;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getDislikes() {
        return dislikes;
    }

    public void setDislikes(String dislikes) {
        this.dislikes = dislikes;
    }

    public List<String> getClues() {
        return clues;
    }

    public void setClues(List<String> clues) {
        this.clues = clues;
    }

    public Person getSecretFriend() {
        return secretFriend;
    }

    public void setSecretFriend(Person secretFriend) {
        this.secretFriend = secretFriend;
    }
}

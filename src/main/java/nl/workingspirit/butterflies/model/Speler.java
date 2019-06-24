package nl.workingspirit.butterflies.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Speler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToMany
    private Set<Groep> groepen = new HashSet<>();

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Groep> getGroepen() {
        return groepen;
    }
}

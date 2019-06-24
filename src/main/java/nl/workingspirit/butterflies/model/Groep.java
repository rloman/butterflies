package nl.workingspirit.butterflies.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.boot.jaxb.hbm.internal.CacheAccessTypeConverter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Groep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;


    @ManyToMany(mappedBy = "groepen", fetch = FetchType.EAGER)
    @JsonIgnoreProperties("groepen")
    private Set<Speler> spelers = new HashSet<>();

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Speler> getSpelers() {
        return spelers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSpeler(Speler speler) {
        this.spelers.add(speler);
        speler.getGroepen().add(this);
    }
}

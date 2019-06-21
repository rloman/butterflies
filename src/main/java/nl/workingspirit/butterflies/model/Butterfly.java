package nl.workingspirit.butterflies.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity(name="vlinder")
@Data
@EqualsAndHashCode(of="name")
public class Butterfly {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(name="naam")
    private String name;


    private int age;

}

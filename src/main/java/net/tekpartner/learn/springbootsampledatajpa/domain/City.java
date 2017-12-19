package net.tekpartner.learn.springbootsampledatajpa.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class City implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "city_generator", sequenceName = "city_sequence", initialValue = 23)
    @GeneratedValue(generator = "city_generator")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String map;

    protected City() {
    }

    public City(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return this.name;
    }

    public String getState() {
        return this.state;
    }

    public String getCountry() {
        return this.country;
    }

    public String getMap() {
        return this.map;
    }

    @Override
    public String toString() {
        return getName() + "," + getState() + "," + getCountry();
    }
}

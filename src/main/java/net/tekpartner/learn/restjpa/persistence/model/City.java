package net.tekpartner.learn.restjpa.persistence.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "city_seq_generator")
    @SequenceGenerator(name = "city_seq_generator", sequenceName = "city_sequence", allocationSize = 1)
    private Long id;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String map;

    public City(String city, String country) {
        this.city = city;
        this.country = country;
    }
}

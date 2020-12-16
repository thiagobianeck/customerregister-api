package com.bianeck.customerregisterapi.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Entity
@Data
@NoArgsConstructor
public class State {

    @Id
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 2)
    private String uf;

    @Column(nullable = false, unique = true, length = 25)
    private String description;

    @OneToMany(mappedBy = "state")
    private List<City> cities = new ArrayList<>();

    public State(Long id, String uf, String name) {
        this.id = id;
        this.uf = uf;
        this.description = name;
    }
}

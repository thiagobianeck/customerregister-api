package com.bianeck.customerregisterapi.domain;

import com.bianeck.customerregisterapi.domain.common.Auditable;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Entity
@Data
@NoArgsConstructor
public class State extends Auditable {

    @Id
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "state")
    private List<City> cities = new ArrayList<>();

    public State(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}

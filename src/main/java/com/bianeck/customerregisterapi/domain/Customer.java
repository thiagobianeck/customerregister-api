package com.bianeck.customerregisterapi.domain;

import com.bianeck.customerregisterapi.domain.enums.CustomerType;
import com.bianeck.customerregisterapi.domain.enums.Gender;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@ToString
@EqualsAndHashCode
@Entity
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Getter @Setter
    @Column(nullable = false, unique = true, length = 100)
    private String cpfOrCnpj;

    @Column(nullable = false)
    private Integer type;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Getter
    @ElementCollection
    @CollectionTable(name = "phone")
    private Set<String> phones = new HashSet<>();

    @Getter
    @OneToMany(mappedBy = "customer")
    private List<Address> addresses = new ArrayList<>();

    public CustomerType getType() {
        return CustomerType.toEnum(this.type);
    }

    public void setType(CustomerType type) {
        this.type = type.getCode();
    }
}

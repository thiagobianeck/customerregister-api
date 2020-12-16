package com.bianeck.customerregisterapi.domain;

import com.bianeck.customerregisterapi.domain.common.Auditable;
import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "address", nullable = false)
    private String addressDescription;

    @Column(nullable = false, length = 10)
    private String number;

    @Column(nullable = false)
    private String complement;

    @Column(nullable = false)
    private String district;

    @Column(nullable = false, length = 10)
    private String zipCode;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

}

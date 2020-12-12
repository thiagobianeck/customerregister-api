package com.bianeck.customerregisterapi.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum CustomerType {

    NATURAL_PERSON(1, "Natural Person"),
    JURIDICAL_PERSON(2, "Juridical Person");

    private final Integer code;
    private final String description;

    public static CustomerType toEnum(Integer code) {
        if(code == null) return null;

        return Arrays.stream(CustomerType.values())
                .filter(x -> code.equals(x.getCode()))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("This id: " + code + " is not valid."));

    }
}

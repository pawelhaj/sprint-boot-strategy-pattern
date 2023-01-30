package com.example.sprintbootstrategypattern.domain;

import lombok.Getter;

import java.util.stream.Stream;

@Getter
public enum Vendor {

    JUNIPER, CHECKPOINT, CISCO, FORTINET;

    public static Vendor fromValue(String vendor) {
        return Stream.of(values())
                .filter(t -> t.name().equalsIgnoreCase(vendor))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unsupported vendor: " + vendor));
    }
}
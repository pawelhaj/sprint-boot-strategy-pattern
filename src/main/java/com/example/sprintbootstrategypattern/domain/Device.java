package com.example.sprintbootstrategypattern.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class Device {
    private String vendor;
    private String model;

    public static Device of(String vendor, String model) {
        return new Device(vendor, model);
    }
}


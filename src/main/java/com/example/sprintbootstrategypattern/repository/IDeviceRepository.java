package com.example.sprintbootstrategypattern.repository;

import com.example.sprintbootstrategypattern.domain.Device;

import java.util.List;

public interface IDeviceRepository {
    List<Device> getAll();
}

package com.example.sprintbootstrategypattern.repository;

import com.example.sprintbootstrategypattern.domain.Device;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DevicesRepository implements IDeviceRepository {

    public List<Device> getAll() {
        return new ArrayList<>(
                List.of(
                        Device.of("CheckPoint", "5600"),
                        Device.of("CheckPoint", "5100"),
                        Device.of("Cisco", "3620"),
                        Device.of("Cisco", "N9KC9364CGX"),
                        Device.of("F5", "BIG-IP 1600"),
                        Device.of("Fortinet", "fgt1500D"),
                        Device.of("Juniper", "SRX4200")));
    }
}

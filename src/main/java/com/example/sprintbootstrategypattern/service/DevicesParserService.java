package com.example.sprintbootstrategypattern.service;

import com.example.sprintbootstrategypattern.domain.Device;
import com.example.sprintbootstrategypattern.parsers.InterfaceParser;
import com.example.sprintbootstrategypattern.parsers.InterfaceResolver;
import com.example.sprintbootstrategypattern.repository.IDeviceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DevicesParserService {
    private final IDeviceRepository deviceRepository;
    private final InterfaceResolver interfaceResolver;

    public DevicesParserService(IDeviceRepository deviceRepository, InterfaceResolver interfaceResolver) {
        this.deviceRepository = deviceRepository;
        this.interfaceResolver = interfaceResolver;
    }

    public void parseAll() {
        List<Device> devices = deviceRepository.getAll();
        for (Device device : devices) {
            log.info("Parsing device " + device);
            try {
                InterfaceParser parser = interfaceResolver.getParser(device);
                parser.parse("content");
            } catch (IllegalArgumentException ex) {
                log.error(ex.getMessage());
            }

        }
    }
}

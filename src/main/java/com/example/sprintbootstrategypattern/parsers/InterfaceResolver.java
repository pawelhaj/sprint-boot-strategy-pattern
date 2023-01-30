package com.example.sprintbootstrategypattern.parsers;

import com.example.sprintbootstrategypattern.domain.Device;
import com.example.sprintbootstrategypattern.domain.Vendor;
import org.springframework.stereotype.Service;

import static com.example.sprintbootstrategypattern.parsers.ParserName.*;

@Service
public class InterfaceResolver {

    private static final String NEXUS_PREFIX = "N";
    private final InterfaceParserFactory interfaceParserFactory;

    public InterfaceResolver(InterfaceParserFactory interfaceParserFactory) {
        this.interfaceParserFactory = interfaceParserFactory;
    }

    public InterfaceParser getParser(Device device) {
        Vendor vendor = Vendor.fromValue(device.getVendor());

        ParserName parserName;
        switch (vendor) {
            case CHECKPOINT:
                parserName = CHECKPOINT;
                break;
            case FORTINET:
                parserName = FORTINET;
                break;
            case JUNIPER:
                parserName = JUNIPER;
                break;
            case CISCO:
                parserName = device.getModel().startsWith(NEXUS_PREFIX) ? CISCO_NXOS : CISCO_IOS;
                break;
            default:
                throw new IllegalArgumentException("Unsupported device: " + device);
        }

        return interfaceParserFactory.getParserStrategy(parserName);
    }
}

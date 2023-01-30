package com.example.sprintbootstrategypattern.parsers.strategies;

import com.example.sprintbootstrategypattern.parsers.InterfaceParser;
import com.example.sprintbootstrategypattern.parsers.ParserName;
import org.springframework.stereotype.Component;

@Component
public class CiscoNXOSParser implements InterfaceParser {
    @Override
    public String parse(String input) {
        return "Parsed CiscoNXOS configuration: " + input;
    }

    @Override
    public ParserName getName() {
        return ParserName.CISCO_NXOS;
    }
}

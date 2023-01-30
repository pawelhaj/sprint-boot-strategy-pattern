package com.example.sprintbootstrategypattern.parsers.strategies;

import com.example.sprintbootstrategypattern.parsers.InterfaceParser;
import com.example.sprintbootstrategypattern.parsers.ParserName;
import org.springframework.stereotype.Component;

@Component
public class FortiNetParser implements InterfaceParser {
    @Override
    public String parse(String input) {
        return "Parsed FortiNet configuration: " + input;
    }

    @Override
    public ParserName getName() {
        return ParserName.FORTINET;
    }
}

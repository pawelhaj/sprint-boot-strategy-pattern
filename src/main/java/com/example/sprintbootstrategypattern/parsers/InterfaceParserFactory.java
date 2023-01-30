package com.example.sprintbootstrategypattern.parsers;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class InterfaceParserFactory {
    private Map<ParserName, InterfaceParser> strategies;

    public InterfaceParserFactory(Set<InterfaceParser> strategies) {
        this.strategies = new HashMap<>();
        strategies.forEach(
                strategy -> this.strategies.put(strategy.getName(), strategy)
        );
    }

    public InterfaceParser getParserStrategy(ParserName strategyName) {
        return strategies.get(strategyName);
    }
}

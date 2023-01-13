package com.example.demo.strategies;

import com.example.demo.enums.KernelToInterfaceEnum;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class KernelToInterfaceStrategyFactory {

    private Map<KernelToInterfaceEnum, KernelToInterfaceStrategy> strategies;

    public KernelToInterfaceStrategyFactory(Set<KernelToInterfaceStrategy> strategiesSet) {
        createStrategies(strategiesSet);
    }

    private void createStrategies(Set<KernelToInterfaceStrategy> strategiesSet) {
        strategies = new HashMap<>();

        strategiesSet.forEach(
                strategy -> strategies.put(strategy.getDistroInfo(), strategy)
        );
    }

    public KernelToInterfaceStrategy getStrategy(KernelToInterfaceEnum strategyType){
        return strategies.get(strategyType);
    }
}

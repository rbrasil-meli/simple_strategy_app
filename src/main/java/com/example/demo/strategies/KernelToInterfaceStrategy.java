package com.example.demo.strategies;

import com.example.demo.enums.KernelToInterfaceEnum;

public interface KernelToInterfaceStrategy {

    String whatIsMyDistro();
    KernelToInterfaceEnum getDistroInfo();
}

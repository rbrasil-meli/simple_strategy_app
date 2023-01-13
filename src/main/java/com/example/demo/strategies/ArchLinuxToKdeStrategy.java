package com.example.demo.strategies;

import com.example.demo.enums.KernelToInterfaceEnum;
import org.springframework.stereotype.Component;

@Component
public class ArchLinuxToKdeStrategy implements KernelToInterfaceStrategy {

    @Override
    public String whatIsMyDistro() {
        return "It is a Arch Kernel with KDE as interface";
    }

    @Override
    public KernelToInterfaceEnum getDistroInfo() {
        return KernelToInterfaceEnum.ARCH_KDE;
    }
}

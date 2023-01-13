package com.example.demo.strategies;

import com.example.demo.enums.KernelToInterfaceEnum;
import org.springframework.stereotype.Component;

@Component
public class ArchLinuxToGnomeStrategy implements KernelToInterfaceStrategy {
    @Override
    public String whatIsMyDistro() {
        return "It is a Arch Kernel with Gnome as interface";
    }

    @Override
    public KernelToInterfaceEnum getDistroInfo() {
        return KernelToInterfaceEnum.ARCH_GNOME;
    }
}

package com.example.demo.strategies;

import com.example.demo.enums.KernelToInterfaceEnum;
import org.springframework.stereotype.Component;

@Component
public class UbuntuToGnomeStrategy implements KernelToInterfaceStrategy{
    @Override
    public String whatIsMyDistro() {
        return "It is a Ubuntu Kernel with Gnome as interface";
    }

    @Override
    public KernelToInterfaceEnum getDistroInfo() {
        return KernelToInterfaceEnum.UBUNTU_GNOME;
    }
}

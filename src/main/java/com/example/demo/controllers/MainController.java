package com.example.demo.controllers;

import com.example.demo.enums.KernelToInterfaceEnum;
import com.example.demo.strategies.KernelToInterfaceStrategyFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    KernelToInterfaceStrategyFactory strategyFactory;

    public MainController(KernelToInterfaceStrategyFactory strategyFactory) {
        this.strategyFactory = strategyFactory;
    }

    @GetMapping("/arch/gnome")
    public String simpleGet1(){
        var myStrategy = strategyFactory.getStrategy(KernelToInterfaceEnum.ARCH_GNOME);
        return myStrategy.whatIsMyDistro();
    }

    @GetMapping("/ubuntu/gnome")
    public String simpleGet2(){
        var myStrategy = strategyFactory.getStrategy(KernelToInterfaceEnum.UBUNTU_GNOME);
        return myStrategy.whatIsMyDistro();
    }

    @GetMapping("/arch/kde")
    public String simpleGet3(){
        var myStrategy = strategyFactory.getStrategy(KernelToInterfaceEnum.ARCH_KDE);
        return myStrategy.whatIsMyDistro();
    }
}

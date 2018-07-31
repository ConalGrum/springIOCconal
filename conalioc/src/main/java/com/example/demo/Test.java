package com.example.demo;

import com.example.demo.Farm.Farm;
import com.example.demo.FarmCoop.DerryCoop;
import com.example.demo.FarmCoop.FarmCoop;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Test {


    @Autowired
    FarmCoop farmBusiness;

    public FarmCoop getFarmBusiness() {
        System.out.println(farmBusiness.toString());
        return farmBusiness;

    }
}

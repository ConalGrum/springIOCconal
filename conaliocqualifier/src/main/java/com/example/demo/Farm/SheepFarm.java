package com.example.demo.Farm;

import com.example.demo.Animal.Animal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("SheepFarm")
public class SheepFarm implements Farm {

    private int woolCount = 0;
    private List<Animal> animals;


    public SheepFarm(@Qualifier("Sheep") List<Animal> animals) {

        this.animals = animals;
        getClassName();
        getWool();

    }

    public String getClassName() {
        String className;
        className = getClass().toString();
        return className.substring(className.lastIndexOf('.') + 1);
    }

    public int getWool() {

        for (int i = 0; i < animals.size(); i++) {

            woolCount++;
        }

        return woolCount;
    }
}

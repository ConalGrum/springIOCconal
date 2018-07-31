package com.example.demo.Business;

import com.example.demo.Animal.Animal;
import com.example.demo.Animal.Sheep;
import com.example.demo.Farm.Farm;
import com.example.demo.Farm.SheepFarm;
import com.example.demo.FarmCoop.DerryCoop;
import com.example.demo.FarmCoop.DonegalCoop;
import com.example.demo.FarmCoop.FarmCoop;

import java.util.ArrayList;
import java.util.List;

public class Business {


    public static void main(String[] args) {

        //farm buisness 1
        Sheep lamb = new Sheep();
        Sheep lamb2 = new Sheep();

        List<Animal> animals = new ArrayList<>();
        animals.add(lamb);
        animals.add(lamb2);

        List<Farm> farms = new ArrayList<>();

        SheepFarm sheepFarm = new SheepFarm(animals);
        farms.add(sheepFarm);

        FarmCoop farmBusiness = new DerryCoop(farms);







        //farm buisness 2
        Sheep lamb3 = new Sheep();
        Sheep lamb4 = new Sheep();

        List<Animal> animals2 = new ArrayList<>();
        animals2.add(lamb3);
        animals2.add(lamb4);

        List<Farm> farms2 = new ArrayList<>();

        SheepFarm sheepFarm2 = new SheepFarm(animals);
        farms2.add(sheepFarm2);

        FarmCoop farmBusiness2 = new DonegalCoop(farms2);


        System.out.println(farmBusiness);
        System.out.println(farmBusiness2);
    }

}

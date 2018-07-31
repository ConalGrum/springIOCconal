package com.example.demo;

import com.example.demo.FarmCoop.FarmCoop;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BusinessPortfolio {

    private FarmCoop derryFarmBusiness;
    private FarmCoop donegalFarmBusiness;


    @Autowired
    public BusinessPortfolio(@Qualifier("DerryCoop") FarmCoop derryFarmBusiness, @Qualifier("DonegalCoop") FarmCoop donegalFarmBusiness) {
        this.derryFarmBusiness = derryFarmBusiness;
        this.donegalFarmBusiness = donegalFarmBusiness;
    }


    @RequestMapping(value = "/businessportfolio", method = RequestMethod.GET)
    @ResponseBody
    public String getPortfolio() {

        Gson gson_pretty = new GsonBuilder().setPrettyPrinting().create();
        List<FarmCoop> displayFarms = new ArrayList<>();
        displayFarms.add(donegalFarmBusiness);
        displayFarms.add(derryFarmBusiness);

        return gson_pretty.toJson(displayFarms);

    }

}



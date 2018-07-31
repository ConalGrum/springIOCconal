package com.example.demo;

import com.example.demo.FarmCoop.FarmCoop;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BusinessPortfolio {

    private FarmCoop farmBusiness;


    @Autowired
    public BusinessPortfolio(FarmCoop farmBusiness) {
        this.farmBusiness = farmBusiness;
    }


    @RequestMapping(value = "/businessportfolio", method = RequestMethod.GET)
    @ResponseBody
    public String getPortfolio() {

        Gson gson_pretty = new GsonBuilder().setPrettyPrinting().create();
        return gson_pretty.toJson(farmBusiness);

    }

}



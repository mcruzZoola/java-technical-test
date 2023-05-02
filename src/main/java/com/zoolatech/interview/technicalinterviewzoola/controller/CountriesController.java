package com.zoolatech.interview.technicalinterviewzoola.controller;

import com.zoolatech.interview.technicalinterviewzoola.model.Country;
import com.zoolatech.interview.technicalinterviewzoola.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountriesController {

  @Autowired
  private CountryService countryService;

  @GetMapping("/getCountriesFromFile")
  public List<Country> getCountriesFromFile(){
    return countryService.getCountriesFromFile();
  }

  @GetMapping("/getPopulationFromCountry/{countryName}")
  public Integer getPopulationFromCountry(@PathVariable String countryName){
    return 0;
  }

  @GetMapping("/getCountriesSurpassingPopulation/{population}")
  public List<Country> getCountriesSurpassingPopulation (@PathVariable String population){
    return null;
  }
}

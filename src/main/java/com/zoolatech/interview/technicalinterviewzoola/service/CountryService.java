package com.zoolatech.interview.technicalinterviewzoola.service;

import com.zoolatech.interview.technicalinterviewzoola.model.Country;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class CountryService {

  @Value("classpath:countries.csv")
  Resource countriesFileResource;

  public List<Country> getCountriesFromFile(){
    List<Country> countryList = new ArrayList<>();
    Scanner scanner;
    try {
      scanner = new Scanner(countriesFileResource.getFile());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    while (scanner.hasNextLine()){
      String lineToProcess = scanner.nextLine();
      String[] tokens = lineToProcess.split(",");
      Country country = new Country();
      country.setName(tokens[0]);
      country.setCapitolStateCode(tokens[1]);
      country.setCapitolCityCode(tokens[2]);
      country.setCapitol(tokens[3]);
      country.setPopulation(Integer.parseInt(tokens[4]));
      countryList.add(country);
    }
    return countryList;
  }
}

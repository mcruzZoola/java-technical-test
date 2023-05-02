package com.zoolatech.interview.technicalinterviewzoola.model;

public class Country {
  private String name;
  private String capitolStateCode;
  private String capitolCityCode;
  private String capitol;
  private Integer population;

  public String getCapitol() {
    return capitol;
  }

  public void setCapitol(String capitol) {
    this.capitol = capitol;
  }

  public Integer getPopulation() {
    return population;
  }

  public void setPopulation(Integer population) {
    this.population = population;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCapitolStateCode() {
    return capitolStateCode;
  }

  public void setCapitolStateCode(String capitolStateCode) {
    this.capitolStateCode = capitolStateCode;
  }

  public String getCapitolCityCode() {
    return capitolCityCode;
  }

  public void setCapitolCityCode(String capitolCityCode) {
    this.capitolCityCode = capitolCityCode;
  }
}

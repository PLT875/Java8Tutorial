package com.petertran.java8tutorial.town;

/**
 * @author petertran
 */
public class Town {
  private String name;
  private String city;
  private String country;
  private int population;
  
  public Town(){ }
  
  public Town(String name, String city, String country, int population){
    this.name = name;
    this.city = city;
    this.country = country;
    this.population = population;
  }
  
  public int getPopulation(){
    return population;
  }
   
  public String toString(){
    String format = "Name: %s, City: %s, Country: %s, Population: %d\n";
    return String.format(format, this.name, this.city, this.country, this.population);
  }
}

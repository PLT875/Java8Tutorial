package com.petertran.java8tutorial;

import com.petertran.java8tutorial.town.Town;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


/**
 * Exploring the new features of Java 8
 * 
 * @author petertran
 * 
 * @usage mvn exec:java -Dexec.mainClass="com.petertran.java8tutorial.Main"
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args){
    Town t0 = new Town("Ruislip", "London", "United Kingdom", 31000);
    Town t1 = new Town("Northwood", "London", "United Kingdom", 21901);
    Town t2 = new Town("Pinner", "London", "United Kingdom", 19158);
    Town t3 = new Town("Uxbridge", "London", "United Kingdom", 52774);
    
    List<Town> towns;
    towns = new ArrayList<>();
    towns.add(t0);
    towns.add(t1);
    towns.add(t2);
    towns.add(t3);
    
    System.out.println("-- Towns - Population Ascending --");
    Collections.sort(towns, (Town town0, Town town1) -> town0.getPopulation() - town1.getPopulation());
    
    towns.stream().forEach((town) -> {
      System.out.println(town);
    });
    
    
    
    /** Therefore no longer required
     *  Collections.sort(towns, new Town(){
     *  @Override
     *    public int compare(Town town0, Town town1){
     *      return town0.getPopulation() - town1.getPopulation();
     *    }
     *  }
     */
    
  }
  
}


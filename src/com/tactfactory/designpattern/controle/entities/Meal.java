package com.tactfactory.designpattern.controle.entities;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	
	  private List<Item> items = new ArrayList<Item>();
	  private static Meal meal;
	  
	  public Meal() {}
	  
	  public Meal addItem(Item item) {
		  items.add(item);
		  return this;
	  }
	
	  public Meal addItem(Item item, Integer number) {
		  for (int i = 0; i < number; i++) {
			  items.add(item);
		  }
		  return this;
	  }
	
	  public float getCost() {
		  float cost = 0.0f;
			
		  for (Item item : items) {
			  cost += item.price();
		  }
		  return cost;
	  }
	
	  public void showItems() {
	
	    for (Item item : items) {
	      System.out.print("Item : " + item.name());
		  System.out.print(", Packing : " + item.packing().pack());
		  System.out.println(", Price : " + item.price());
	    }
	  }

	  public static Meal getMeal() {
			if (meal == null) {
				meal = new Meal();
			}
			return meal;
	  }
	
	  public static void newMeal() {
		  meal = new Meal();
	  }

}


package dronesimulation;

import java.util.HashMap;

public class Meal {
	//Value is number of that item in this meal
	private HashMap<FoodItem, Integer> foodItems;
	
	public Meal(HashMap<FoodItem, Integer> items) {
		foodItems = items;
	}
	
	public double getWeight() {
		int weight = 0;
		
		for(FoodItem item : foodItems.keySet()) {
			weight += item.getWeight() * foodItems.get(item);
		}
		
		return weight;
	}
}

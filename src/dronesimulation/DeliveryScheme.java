package dronesimulation;

import java.util.List;
import java.util.Queue;

public interface DeliveryScheme {
	//Fills drone with meals until it gets too close to weight capacity
	public List<DeliveryPoint> fillDrone(double weightCap);
	
	public void addOrder(Order order);
}

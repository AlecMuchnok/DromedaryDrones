package dronesimulation;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FIFO implements DeliveryScheme {
	Queue<Order> orders;
	
	public FIFO() {
		orders = new LinkedList<>();
	}
	
	@Override
	public List<DeliveryPoint> fillDrone(final double weightCap) {
		int weight = 0;
		List<DeliveryPoint> deliveries = new LinkedList<>();
		
		//Add orders until next order would make drone too heavy
		while(weight + orders.peek().getMealWeight() < weightCap) {
			Order order = orders.poll();
			
			deliveries.add(order.getPoint());
			
			weight += order.getMealWeight();
		}
		
		return deliveries;
	}
	
	@Override
	public void addOrder(Order order) {
		orders.add(order);
	}
}

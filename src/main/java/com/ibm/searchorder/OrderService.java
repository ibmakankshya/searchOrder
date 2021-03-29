package com.ibm.searchorder;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.order;
import com.ibm.repo.orderRepository;




@Service
public class OrderService {//spring beans classes with special annotation
	@Autowired     //dependency of repository class
	orderRepository orderepository;

	public List<order> getOrders() {
		
		return orderepository.findAll();
	}
	
	/*public String createOrder(Order order) {
		Order savedOrder = orderepository.save(order) ;
		return savedOrder.getID();
		}
	//search all orders

	public List<Order> getOrders(){
		//return new ArrayList<Order>();
		return orderepository.findAll();
	}

	public void updateOrder(Order order) {
		orderepository.save(order);
		//return "Order is updated!";
	}
	public void deletedOrder(String orderID) {
		orderepository.deleteById(orderID);
		//return "Order is deleted!";
	}
	public Optional<Order> getOrder(String orderID) {

		return orderepository.findById(orderID);
	}*/
}

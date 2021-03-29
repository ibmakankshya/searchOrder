package com.ibm.searchorder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ibm.entity.order;

@RestController
public class orderSearchController {
	@Autowired
	OrderService orderservice;
	@GetMapping("/order")
	List<order> getOrders() {
		return orderservice.getOrders();// multiple orders
	}

}

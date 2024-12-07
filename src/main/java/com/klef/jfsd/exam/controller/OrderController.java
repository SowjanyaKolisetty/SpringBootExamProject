package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.model.Order;
import com.klef.jfsd.exam.repository.OrderRepository;
import com.klef.jfsd.exam.service.OrderService;

@RestController
public class OrderController 
{
@Autowired
private OrderRepository orderRepository;
@Autowired
private OrderService orderService;


@GetMapping("allorders")
public List<Order> viewallorders ()
{
	 return orderService.displayAllOrders();
}


}

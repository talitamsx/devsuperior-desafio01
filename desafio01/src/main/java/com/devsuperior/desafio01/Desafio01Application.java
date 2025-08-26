package com.devsuperior.desafio01;

import com.devsuperior.desafio01.entities.Order;
import com.devsuperior.desafio01.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {

		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(1034, 150.00, 20.0);
		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor total: " + orderService.total(order)+"\n");

		Order order1 = new Order(2282, 800.00, 10.0);
		System.out.println("Pedido código: " + order1.getCode());
		System.out.println("Valor total: " + orderService.total(order1)+"\n");

		Order order2 = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código: " + order2.getCode());
		System.out.println("Valor total: " + orderService.total(order2)+"\n");
	}
}

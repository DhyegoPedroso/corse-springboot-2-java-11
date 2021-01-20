package com.dhyegopedroso.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dhyegopedroso.course.Repositories.OrderRepository;
import com.dhyegopedroso.course.Repositories.UserRepository;
import com.dhyegopedroso.course.entities.Order;
import com.dhyegopedroso.course.entities.User;
import com.dhyegopedroso.course.entities.enums.OrderStatus;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Dhyego Pedroso", "dhyego.pedroso@gmail.com", "966666666", "123456");
		User u4 = new User(null, "Enzo Meira", "enzo.meira@gmail.com", "955555555", "123456");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED, u3);
		Order o4 = new Order(null, Instant.parse("2019-08-20T19:53:07Z"), OrderStatus.PAID, u3);
		Order o5 = new Order(null, Instant.parse("2019-08-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u4);
		Order o6 = new Order(null, Instant.parse("2019-09-22T15:21:22Z"), OrderStatus.PAID, u4);
		Order o7 = new Order(null, Instant.parse("2019-09-20T19:53:07Z"), OrderStatus.CANCELED, u1);
		Order o8 = new Order(null, Instant.parse("2019-09-21T03:42:10Z"), OrderStatus.DELIVERED, u2);
		Order o9 = new Order(null, Instant.parse("2019-10-22T15:21:22Z"), OrderStatus.SHIPPED, u4);

		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));

		orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4, o5, o6, o7, o8, o9));

	}

}

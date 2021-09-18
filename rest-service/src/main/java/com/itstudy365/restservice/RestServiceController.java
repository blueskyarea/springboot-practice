package com.itstudy365.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.itstudy365.restservice.model.Order;

import org.springframework.jdbc.core.JdbcTemplate;

@Controller
public class RestServiceController {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@GetMapping("/")
	public String init() {
		return "index";
	}

	@PostMapping("/insert")
	public String insertOrder(Model model, Order order) {

		String sqlText = "INSERT INTO ANIMAL (ANIMAL_ID,ANIMAL_NAME) " + "VALUES (?,?)";

		jdbcTemplate.update(sqlText, order.getOrderId(), order.getItemId());
		model.addAttribute("ResultMessage", "INSERT SUCCESS!!!");

		return "index";
	}
}

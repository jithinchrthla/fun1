package com.money.demo.controller.rest;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.money.demo.model.service.Operations;

@RestController
@RequestMapping("operations")
public class OperationController {
	
	@Autowired
	private Operations operations;
	
	@GetMapping("sum")
	public Double sum(@RequestParam Double a, @RequestParam Double b) {
		return operations.sum(a, b);
	}
	
	@GetMapping("testCase")
	public String getTestCade() throws IOException {
		return operations.getTestCase();
	}


	
}

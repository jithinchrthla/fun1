package com.money.demo.model.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class Operations {
	public Double sum(double a, double b) {
		return a+b;
	}
	
	public String getTestCase() throws IOException {
		String testCase="";
		Resource resource;
		resource = new ClassPathResource("static/TC1.txt");
		InputStream reportBook;
		reportBook = resource.getInputStream();
		Scanner sc = new Scanner(reportBook); 
		while (sc.hasNextLine()) {
			testCase = testCase + System.lineSeparator() +sc.nextLine();
		} 
		return testCase;
	}
}
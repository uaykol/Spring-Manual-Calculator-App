package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.configuration.CalculatorConfiguration;

@SpringBootApplication
public class ManualCalculator {

	public static void main(String[] args) {
		
		var context = SpringApplication.run(ManualCalculator.class, args);

		CalculatorConfiguration calculator = context.getBean(CalculatorConfiguration.class);
		
		System.out.println(calculator.calculator(1, 3, '*'));

		System.out.println(calculator.calculator(1, 7, '+'));

		System.out.println(calculator.calculator(18, 9, '/'));

		System.out.println(calculator.calculator(3, 9, '+'));

		//Will Throw Exception Because Second Value of The Division Operation Can't be 0
		System.out.println(calculator.calculator(35, 0, '/'));
		
		System.out.println(calculator.calculator(3, 9, '-'));

		System.out.println(calculator.calculator(11, 9, '%'));

		System.out.println(calculator.calculator(35, 9, '/'));

		//Will Throw Exception Because Second Value of The Mod Operation Can't be 0
		System.out.println(calculator.calculator(23, 0, '%'));
		
	}

}

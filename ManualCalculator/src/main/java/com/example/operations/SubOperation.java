package com.example.operations;

import org.springframework.stereotype.Component;

@Component
public class SubOperation implements IOperation {

	@Override
	public int doOperation(int val1, int val2) 
	{
		return val1 - val2;
	}

	@Override
	public boolean isValid(char operation)
	{
		return operation == '-';
	}

	@Override
	public String toString() 
	{
		return "SubOperation ";
	}	
	
}

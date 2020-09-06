package com.example.operations;

import org.springframework.stereotype.Component;

import com.example.myexceptions.exception.ModOperationException;

@Component
public class ModOperation implements IOperation{
	
	@Override
	public int doOperation(int val1, int val2) 
	{	
		
		try {
			if(!(val2 == 0))
				return val1 % val2;
			else 
				throw new ModOperationException("Second Value of The Mod Operation Can't be 0!");		
		}
		catch(ModOperationException modOperationException)
		{
			System.out.println(modOperationException);
		}
	
		return -1;
	}

	@Override
	public boolean isValid(char operation) 
	{		
		return operation == '%';		
	}
	
	@Override
	public String toString() {
		return "ModOperation ";
	}
	
}

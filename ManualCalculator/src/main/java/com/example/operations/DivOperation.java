package com.example.operations;

import org.springframework.stereotype.Component;

import com.example.myexceptions.exception.DivOperationException;

@Component
public class DivOperation implements IOperation {

	@Override
	public int doOperation(int val1, int val2) 
	{	
		try {
			if(!(val2 == 0))
				return val1 / val2;
			else 
				throw new DivOperationException("Second Value of The Division Operation Can't be 0!");	
		}
		catch(DivOperationException divOperationException)
		{
			System.out.println(divOperationException);
		}
			
		return -1;
	}

	
	@Override
	public boolean isValid(char operation)
	{	
		return operation == '/';
	}
	
	@Override
	public String toString() 
	{
		return "DivOperation ";
	}


	
}

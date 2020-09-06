package com.example.configuration;

import java.util.Collection;

import org.springframework.context.annotation.Configuration;
import com.example.operations.IOperation;
@Configuration
public class CalculatorConfiguration {
	
	private final Collection<IOperation> operations;

    public CalculatorConfiguration(Collection<IOperation> operations)
    {    
        this.operations = operations;    
    }

    public String calculator(int val1, int val2, char operation)
    {		
        for (IOperation iop : this.operations) {
            if (iop.isValid(operation))
                return iop.toString() + "Result : " + iop.doOperation(val1, val2);
        }

        throw new UnsupportedOperationException("Invalid operation:" + operation);     
    }
    
}
package com.example.myexceptions.exception;


@SuppressWarnings("serial")
public class DivOperationException extends RuntimeException {

	public DivOperationException(String str) 
	{
		super(str);
	}
	
	public String toString()
    {
        return String.format("%s", super.toString());
    }

}

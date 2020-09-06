package com.example.myexceptions.exception;

@SuppressWarnings("serial")
public class ModOperationException extends RuntimeException{

	public ModOperationException(String str) 
	{
		super(str);
	}
	
	public ModOperationException() 
	{
		super("Second Value of the Mod Operation Can't be 0!");
	}
	
	public String toString()
    {
        return String.format("%s", super.toString());
    }
	
}

package com.mvc.model;

public class Calculation {
	public double calculate (int maths , int physics , int chemistry  , int english)
	{
		double average = (maths +  physics +chemistry + english)/4;
		return average; 
	}
}

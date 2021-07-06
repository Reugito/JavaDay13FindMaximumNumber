package com.bridgelabz.programs;

import java.util.Scanner;

public class TestMaximum  {
	Scanner sc = new Scanner(System.in);
	
	public Double getMaxNumber(Double num1, Double num2, Double num3) {
		Double max = num1;
		if(num2.compareTo(max) > 0) 
			max = num2;
		else if(num3.compareTo(max) > 0)
			max = num3;
		
		 return max;
	}
}

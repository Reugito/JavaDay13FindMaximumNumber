package com.bridgelabz.programs;

import java.util.Scanner;

public class TestMaximum  {
	Scanner sc = new Scanner(System.in);
	
	public Integer getMaxNumber(Integer num1, Integer num2, Integer num3) {
		Integer max = num1;
		if(num2.compareTo(max) > 0) 
			max = num2;
		else if(num3.compareTo(max) > 0)
			max = num3;
		
		 return max;
	}
}

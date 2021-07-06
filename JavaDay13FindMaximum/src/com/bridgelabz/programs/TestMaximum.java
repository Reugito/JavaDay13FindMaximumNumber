package com.bridgelabz.programs;

import java.util.Scanner;

public class TestMaximum  {
	Scanner sc = new Scanner(System.in);
	
	public String getMaxStr(String num1, String num2, String num3) {
		String max = num1;
		if(max.compareTo(num2) > max.length()) 
			max = num2;
		if(max.compareTo(num3) > max.length())
			max = num3;
		System.out.println("====>"+max);
		return max;
	}
}

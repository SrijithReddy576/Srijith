package com.dao.task;

import java.util.Scanner;

public class TemperatureTask {
	static Scanner sc = new Scanner(System.in);
	
	void temperature(){
		System.out.println("Enter the Temperature in Fahrenheit");
		float Fahrenheit = sc.nextFloat();
		float  Celsius= (Fahrenheit-32)*5/9;
		System.out.println("Temperature in Celsius is :"+Celsius);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TemperatureTask tt = new TemperatureTask();
		tt.temperature();
		

	}

}

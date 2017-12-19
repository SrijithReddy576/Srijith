package com.dao.task;

import java.util.Scanner;

public class GuessNumberTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int GuessNumber = 45;
boolean b=true;
System.out.println("Enter the number");
while(b){
	
	int Number = sc.nextInt();
	if(GuessNumber==Number)
	{
		System.out.println("Number Matched");
		b=false;
	}
	else if(GuessNumber>Number){
		System.out.println("Number should be Greater");
	}
	else if(GuessNumber<Number)
	{
	System.out.println("Number should be Smaller");
}
	}

}
}
package com.dao.task;

public class FizzBuzzTask {
	void numbers(){
		for(int Number=1;Number<=100;Number++)
		{
			if(Number%3==0&&Number%5==0){
				System.out.println("Fizz Buzz");
			}
			else if(Number%3==0){
				System.out.println("Fizz");
			}
			else if(Number%5==0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(Number);
			}
		}
			
			}

		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FizzBuzzTask fbt = new FizzBuzzTask();
fbt.numbers();
}}

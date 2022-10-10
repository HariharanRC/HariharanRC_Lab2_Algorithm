package com.gl.PayMoney;

import java.util.Scanner;

public class payMoney {
	
	public static void main(String[] args) {
		
		int[] transaction;
		int size = 0;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of transaction: ");
			
			size = sc.nextInt();
			
			transaction = new int[size];
			
			System.out.println("Enter the elements of array");
			
			for (int i = 0 ; i < size ; i++) {
				transaction[i] = sc.nextInt();	
			}
			
			System.out.println("Enter the number of targets to be achieved:");

			int targetNum = sc.nextInt();
			
			do {
				
				boolean isTargetAchieved = false;
				int sum=0;
				int count = 0;
				System.out.println("Enter the value of target");
				int targetValue = sc.nextInt();
				
				for(int i=0; i<transaction.length; i++) {
					sum = sum + transaction[i];
					count++;
					
					if(sum >= targetValue) {
						isTargetAchieved = true;
						System.out.println("Target achieved after "+ count +" transactions");
						break;
					}							
				}
				
				if (isTargetAchieved == false) 
					System.out.println("Given target is not achieved ");
				
				targetNum--;
			
			} while(targetNum > 0);	
		}
	}
}
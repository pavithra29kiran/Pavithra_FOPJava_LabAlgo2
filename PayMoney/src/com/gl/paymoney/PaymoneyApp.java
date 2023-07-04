package com.gl.paymoney;
import java.util.Arrays;
import java.util.Scanner;

public class PaymoneyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ther transaction array");
		int size=sc.nextInt();
		int[] transactions=new int[size];
		for(int i=0;i<transactions.length;i++)
		{
			System.out.println("enter  the daily income");
		transactions[i]=sc.nextInt();
	}
	System.out.println("Given transaction array: "+ Arrays.toString(transactions));
	System.out.println("Enter the total number of targets achieved");
	int numberofTarget=sc.nextInt();
	for(int i=0;i<numberofTarget;i++)
	{
		System.out.println("enter the target amount");
	   int targetAmount=sc.nextInt();
	   int sum=0;
	   int flag=0;
	   for(int j=0;j<transactions.length;j++) {
		   sum+=transactions[j];
	   if(sum>=targetAmount)
	   {
		   flag=1;
		   System.out.println("target achieved after  "+(j+1)+ " transactions" );
	   
	   break;
	   }
	   }

		   System.out.println("sorry, the given target is not achieved");
	   }
		   	
	   }
		
	
	}



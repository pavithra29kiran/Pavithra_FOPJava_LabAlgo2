package com.gl.paymoney;
import java.util.Arrays;
import java.util.Scanner;

public class CurrencyCounter {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ther total number of currency denomination");
		
		int size=sc.nextInt();
		
		int[] currencyArr=new int[size];
		
		for(int i=0;i<currencyArr.length;i++)
		{
			System.out.println("enter  the denomination value in random order");
			currencyArr[i]=sc.nextInt();
		}
		System.out.println("Before sorting currency: "+ Arrays.toString(currencyArr));
		
		bubblesort(currencyArr);
		
		System.out.println("After sorting currency: "+ Arrays.toString(currencyArr));
		
		System.out.println("Enter the total amount to be paid");
		
		int amount=sc.nextInt();
		
		NetCount  nc=new NetCount();
		
		nc.counting(currencyArr,amount);
		
		}	

	public static void bubblesort(int[] arr)
	{
		int size=arr.length;
		int temp=0;
		for(int i=0;i<size;i++)
		{
			for(int j=1;j<(size-i);j++)
			{			
			
			if(arr[j]>arr[j-1])
			{
				
			
			temp=arr[j-1];
			arr[j-1]=arr[j];
			arr[j]=temp;
		}
	
		}
		}
	}
}
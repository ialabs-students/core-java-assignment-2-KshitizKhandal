package Arraylistsort;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSort 
{
	public static void main(String[] args) 
		{	
		    Scanner input = new Scanner(System.in);
			ArrayList<BigInteger> nums = new ArrayList<BigInteger>();
			BigInteger[] temp_array = new BigInteger[5];
			
			System.out.println("Enter Elements : ");
			
			for(int i=0 ; i<5 ;i++)
			{
				temp_array[i] = input.nextBigInteger();
			}
			
			for(int j=0 ; j<5 ; j++) 
			{
				nums.add(temp_array[j]);
				
			}
			
			System.out.print("Descending Order : ");
			arrayListSortDesc(nums);
		}

	private static void arrayListSortDesc(ArrayList<BigInteger> nums) 
	{
		Collections.sort(nums, Collections.reverseOrder());
		System.out.println(nums);
	}
}

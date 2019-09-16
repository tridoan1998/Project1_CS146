package cs146F19.Doan.project1;

/*
Name: Tri Doan
Course: CS 146
Date: 09/15/2019
Description: Read in from file data, shuffle their index, and read out to another file 
 */
import java.util.*;
import java.io.*;

public class data_shuffling {

	public static void main(String[] args) {
	try {
		BufferedReader In =new BufferedReader (new FileReader ("C:\\Users\\Tri Doan\\eclipse-workspace\\Project1_CS146\\ErdosCA.txt"));
		String firstline = In.readLine();
		//the first line contains the distinct numbers in each
		//column (2 values) and the total number of rows.
		StringTokenizer token = new StringTokenizer(firstline);
		int count0 = 0;
		String first_column_distinct_number = "";
		String second_column_distinct_number = "";
		String third_column_distinct_number = "";
		while(token.hasMoreTokens())
		{
			String temp = token.nextToken();
			//if((temp.at(0)<= '9' && temp.at(0)>='0') || )
			if(count0 == 1)
			{
				first_column_distinct_number = temp;
			}
			else if(count0 == 2)
			{
				second_column_distinct_number = temp;
			}
			else if(count0 == 3)
			{
				third_column_distinct_number = temp;
			}
			count0++;
		}
		
		
		//consvert token into interger
		int first_column_distinct = Integer.parseInt(first_column_distinct_number);
		int second_column_distinct = Integer.parseInt(second_column_distinct_number);
		int third_column_distinct = Integer.parseInt(third_column_distinct_number);
		
		//make three arrays 
		//arr1 to keep the total number of row
		String [] arr1 = new String[third_column_distinct];
		//keep distinct number in each column
		int [] arr2 = new int[second_column_distinct];
		int [] total_number_of_row = new int[third_column_distinct];
		
		//read data into String array arr1
		int count1 = 0; 
		while(count1 < third_column_distinct)
		{
			arr1[count1] = In.readLine();
			count1++;
		}
		
		//print out to test
		for(int i = 0; i < third_column_distinct; i++)
		{
		//	System.out.println(arr1[i]);
		}
	
		System.out.println(System.currentTimeMillis());
		Random r=new Random();
		r.setSeed(20);
		//swap 
		String temp = "";
		for(int i = third_column_distinct-1; i >= 0; i--)
		{
			//generate a random number
			double d = r.nextDouble();
			int j = (int)(d*i);
			//swap
			temp = arr1[i];
			arr1[i] = arr1[j];
			arr1[j]= temp;
		}
		
		System.out.println(System.currentTimeMillis());


		for(int i = 0; i < third_column_distinct; i++)
		{
			//System.out.println(arr1[i]);
		}	
		
		BufferedWriter Out=new BufferedWriter (new FileWriter ("C:\\Users\\Tri Doan\\eclipse-workspace\\Project1_CS146\\LastNameFirstNameShuffled.txt"));
		for(int i = 0; i < third_column_distinct; i++)
		{
			Out.write(arr1[i]);
			Out.write("\n");
		}
		In.close();
		Out.close();
		}
		catch(IOException e)
			{
				System.out.println("Can't read in file!");
			}
	}
}
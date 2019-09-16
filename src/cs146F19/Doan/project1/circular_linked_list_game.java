package cs146F19.Doan.project1;

/*
 Name: Tri Doan
 Course: CS 146
 Description: create a circular linked list, get integer k and delete node according 
 to the k position until the linked list remain one node left.  
 */
import java.util.*;

public class circular_linked_list_game {

	public static void main(String[] args) {
		circular_linked_list CLL = new circular_linked_list();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of prisoner: ");
		int number_of_prionser = input.nextInt();
		for(int i = 1; i <= number_of_prionser; i++)
		{
			CLL.insert(i);
		}
		System.out.println("This is the list of how many prisoners: ");
		CLL.print();
		System.out.println("\nPLease enter the position to take out one prioner at a time: ");
		int k = input.nextInt();
		CLL.print();
		System.out.println();
		CLL.delete(k);
		input.close();
	}
}
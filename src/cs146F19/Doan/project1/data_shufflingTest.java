package cs146F19.Doan.project1;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class data_shufflingTest {

	@Test
	void test() throws IOException
	{
		BufferedReader Out=new BufferedReader (new FileReader ("C:\\Users\\Tri Doan\\eclipse-workspace\\Project1_CS146\\LastNameFirstNameShuffled.txt"));
		BufferedReader In=new BufferedReader (new FileReader ("C:\\Users\\Tri Doan\\eclipse-workspace\\Project1_CS146\\Target1.txt"));
		
		String expectedLine = "";
		while ((expectedLine = In.readLine ()) != null) {
		 String actualLine = Out.readLine ();
		 assertEquals (expectedLine, actualLine);
		 }
		Out.close();
		In.close();
	}
}

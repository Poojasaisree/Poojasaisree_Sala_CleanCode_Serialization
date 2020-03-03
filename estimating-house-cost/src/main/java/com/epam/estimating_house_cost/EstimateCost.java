package com.epam.estimating_house_cost;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class EstimateCost {
	PrintStream pout = new PrintStream(new FileOutputStream(FileDescriptor.out));

	
	public void houseCost(float area, int costPerSquareFeet) {
		// TODO Auto-generated method stub
		pout.println("Estimated cost:" + area*costPerSquareFeet + "INR");
		
	}

	

}

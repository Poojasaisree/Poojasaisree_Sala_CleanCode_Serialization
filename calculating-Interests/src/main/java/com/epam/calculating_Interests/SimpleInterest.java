package com.epam.calculating_Interests;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class SimpleInterest {

	public void calculateSimpleInterest(float principleAmount, float rateOfInterest, float numberOfperiods) {
		// TODO Auto-generated method stub
		PrintStream pout = new PrintStream(new FileOutputStream(FileDescriptor.out));
		pout.println("Simple Interest :" + (principleAmount*rateOfInterest*numberOfperiods)/100);
		
	}

}

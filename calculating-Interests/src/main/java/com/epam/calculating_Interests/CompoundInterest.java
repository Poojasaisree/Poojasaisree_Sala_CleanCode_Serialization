package com.epam.calculating_Interests;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class CompoundInterest {
	PrintStream pout = new PrintStream(new FileOutputStream(FileDescriptor.out));

	public void calculateCompoundInterest(float principleAmount, float rateOfInterest, float numberOfPeriods) {
		// TODO Auto-generated method stub
		rateOfInterest = rateOfInterest/100;
		double compoundAmount = principleAmount*Math.pow((1+rateOfInterest), numberOfPeriods);
		
		pout.println("Compound Interest : "+ (compoundAmount-principleAmount));
	}

}

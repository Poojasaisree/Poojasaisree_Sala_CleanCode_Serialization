package com.epam.calculating_Interests;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Input {
	static float principleAmount;
	static float rateOfInterest;
	static float numberOfperiods;
	
	static int flag = 1;
	Scanner sc = new Scanner(System.in);
	
	
	
	public void takeAttributes() {
		// TODO Auto-generated method stub
		PrintStream pout = new PrintStream(new FileOutputStream(FileDescriptor.out));
		while(flag == 1) {
			pout.println("Enter the attributes:");
			principleAmount= sc.nextFloat();
			rateOfInterest = sc.nextFloat();
			numberOfperiods = sc.nextFloat();
			pout.println("Enter your choice: 1.Calculate simple interest 2.Calculate compound interest 3.Exit");
			int choice = sc.nextInt();
			calculate(choice);
			
			
		}
		
		
	}

	private void calculate(int choice) {
		// TODO Auto-generated method stub
		switch(choice) {
		case 1:
			SimpleInterest si = new SimpleInterest();
			si.calculateSimpleInterest(principleAmount,rateOfInterest, numberOfperiods);
			break;
		case 2:
			CompoundInterest ci = new CompoundInterest();
			ci.calculateCompoundInterest(principleAmount,rateOfInterest, numberOfperiods);
			break;
		case 3:
			flag = 0;
			break;
		default:
			System.out.println("Enter the valid input:");
			break;
		}
		
	}
	

}

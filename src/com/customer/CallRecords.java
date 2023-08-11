package com.customer;

import java.io.*;
public class CallRecords {
	CallQuality callQuantity;

	public void saveCall(CallQuality callQuantity)
	{
		 try {
		FileOutputStream fileout=new FileOutputStream(callQuantity.getCustomerName()+".dat");
		 ObjectOutputStream objectout=new ObjectOutputStream(fileout);
		 objectout.writeObject(callQuantity);
		 objectout.flush();
		 objectout.close();
		 }
		 catch(FileNotFoundException e)
		 {
			 System.out.println(e);
		 }
		 catch(IOException e1)
		 {
			 System.out.println(e1);
		 }
	}
	public void displayCustomer(String name)
	{
		
		try {
			FileInputStream filein =new FileInputStream(name+".dat");
			ObjectInputStream objectin=new ObjectInputStream(filein);
			CallQuality callQuantity =(CallQuality)objectin.readObject();
			
			System.out.println("CallID: "+callQuantity.getCallId());
			System.out.println("CallDuration "+callQuantity.getCallDuration());
			System.out.println("CallQualityGrade "+callQuantity.getCallQualityGrade());
			System.out.println("Customer Name "+callQuantity.getCustomerName());
		
		}
		catch(FileNotFoundException e1)
		{
			System.out.println(e1);
		}
		catch(IOException e2)
		{
			System.out.println(e2);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
	
	}
	public static void main(String[] args) {
		
      CallQuality obj1=new CallQuality(02,36,"Excellent","Ava");
      CallRecords records=new CallRecords();
      records.saveCall(obj1);
      records.displayCustomer(obj1.getCustomerName());



	}

}
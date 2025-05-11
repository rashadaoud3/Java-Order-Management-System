package Assignment3;

import java.util.Date;

public class PhoneOrder extends Order {
	private int callDuration;
	private String customerRepresntative;
	private Customer customer;
	
	public PhoneOrder(Customer customer,Date date) {
		super(customer, date);
		
	}
	
//	public PhoneOrder(Customer customer,String name) {
//		super(customer,new Date());//check customer
//		this.customer=customer;
//		this.customerRepresntative=name;
//	}
	public void setCallDuration(int durtaion) {
	this.callDuration=durtaion;	
	}
	public int getCallDuration() {
		return callDuration;
	}
	public void setName(String name) {
	this.customerRepresntative=name;
	}
	
	public String toString() {
		return "PhoneOrder callDuration:" + callDuration + ", customer Represntative:" + this.customerRepresntative+"";
	}
	 
	public void createOrder() {
		System.out.println("Enter customer name : ");
		 String name=read.nextLine();
		 this.customerRepresntative=name;
		// insert call duration
	}
	
	
}

package Assignment3;
import java.util.*;
public class Customer {
	private long customerId;
	private String name; 
	 private String address;
	ArrayList<Order> orderList=new ArrayList();
	
	public Customer(long id,String name,String address) {
		customerId=id;
		this.name=name;
		this.address=address;
	}//store the info. in the arrayList
	
	public Customer(long id) {
		customerId=id;
	}
	
	public String getName() {
		return name;
	}
	
	public long getCustomerID() {
		return customerId;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public void displayOrderList() {
		System.out.println(orderList);
	}
	
	public String toString() {
		return "Customer customerId:" + customerId + ", name:" + name + ", address:" + address + ", orderList:"
				+ orderList +"\n";
	}
	
	
	
	public boolean equals(Object o) {
		return this.customerId==((Customer)o).customerId;
	}
	

}

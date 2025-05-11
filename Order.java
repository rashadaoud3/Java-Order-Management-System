package Assignment3;
import java.util.*;
public abstract class Order implements Comparable<Order> {
	public static Scanner read=new Scanner(System.in);
	private static long id;
	private Customer customer;
	private Date date;
	private int itemCount;
	public static ArrayList<OrderItem> orderItems=new ArrayList<>();
	private static int orderSequantial=0;
	
	public Order(Customer customer,Date date) {
		this.customer=customer;
		this.date=date;
		id=++orderSequantial;
	}
	
	public abstract void createOrder();//2 types:mailOrder - PhoneOrder
	
	public int compareTo(Order o) {//check
		return getOrderDate().compareTo(o.getOrderDate());
	}
	
	
	public String getCustomerInfo() {
		return toString();
	}
	
	public String getOrderDate() {
		return date.toString();
	}
	
	public long getOrderID() {
		return id;
	}
	
	public double orderTotal() {
		return orderSequantial;
	}


	public void printOrder() {
		System.out.println("Order Detaaails");
		System.out.println("The id :"+this.id);
		System.out.println("The date is:"+this.date);// check
		System.out.println("The customer name : "+customer.getName());
		System.out.println("The address : "+customer.getAddress());
	}
	public void printOrderItem() {
		System.out.println(orderItems);
	}

	
	public String toString() {
		return "Order id:" + id + ", customer:" + customer + ", date:"+ date + ", itemCoun:" + itemCount
				+ ", orderItems:" + orderItems ;
	}
	
	

	

}

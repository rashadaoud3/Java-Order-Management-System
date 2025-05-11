package Assignment3;

public class OrderItem {
	private long productID;
	private String description;
	private double price;
	private int quantity;
	public OrderItem(long id,String desc,double price,int qty) {
		productID=id;
		description=desc;
		this.price=price;
		quantity=qty;
	}
	public double subTotal() {
		return quantity*price;
	}
	
	public String toString() {
		return "product id : "+productID+" ,description : "+description+" ,price : "+price+" ,quantity : "+quantity +
				" ,sub Total : "+subTotal()+ ", Amount :";//completed in the driver 
	}
	
	
	
	

}

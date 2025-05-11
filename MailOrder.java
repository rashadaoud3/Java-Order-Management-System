package Assignment3;
import java.util.*;

public class MailOrder extends Order {
	private Date postDate;
	
	public MailOrder(Customer customer,Date date) {
		super(customer,new Date());
		this.postDate=date;
		
	}
	public String getPostDate() {
		return postDate.toString();
	}
	public void setPostDate(Date date) {
		this.postDate=date;
	}
	public String toString() {
		return "MailOrder postDate:" + postDate;
	}
	@Override
	public void createOrder() {
		postDate=new Date();
		
	}
	
	

}

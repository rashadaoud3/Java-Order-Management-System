package Assignment3;

//import java.lang.ProcessHandle.Info;
//import java.security.PublicKey;
import java.util.*;

public class driver {// enter all info. from object customer
	static Scanner read = new Scanner(System.in);
	static Customer customers;
	public static ArrayList<Customer> InfoArrayList = new ArrayList<>();
	static Customer IdTest;

	public static void main(String[] args) {
		while (true) {
			MENU();
			return;
		}

	}

	public static void ReOrder(OrderItem items) {
		System.out.println("Do you want to insert another order ?");
		System.out.println("Enter ~1~ for YES!");
		System.out.println("Enter ~2~ for NO!");
		int YesNo = read.nextInt();
		switch (YesNo) {
		case 1:
			creatItemsListForBothType();
			break;
		case 2:
			System.out.println("Your order list is :");
			for (int i = 0; i < Order.orderItems.size(); i++) {
				System.out.println(Order.orderItems.get(i));
			}

			break;
		default:
			System.out.println("Your order list is :");
			for (int i = 0; i < Order.orderItems.size(); i++) {
				System.out.println(Order.orderItems.get(i));
			}
			break;

		}
	}

	public static void creatItemsListForBothType() {
		System.out.println("Enter the Product ID: ");
		int id = read.nextInt();
		read.nextLine();// to fix the problem of nextLine
		System.out.println("Enter a describtion for the item :");
		String desc = read.nextLine();
		System.out.println("Ente the price : ");
		double price = read.nextDouble();
		System.out.println("Ennter the quantity of the item you want :");
		int quantity = read.nextInt();
		OrderItem items = new OrderItem(id, desc, price, quantity);
		Order.orderItems.add(items);
		System.out.println("Your order is:");
		System.out.println(items.toString());
		ReOrder(items);

	}

	public static <T> void options(int n) {

		switch (n) {// to add new customer
		case 1:
			option1();
			MENU();
			break;

		case 2:// to make a new order

			option2();

//			MENU();
			break;

		case 3:// to display customer's order
			option3();
			MENU();
			break;
		default:
			break;

		}

	}

	public static void option3() {
		System.out.println("Enter yout ID : ");
		int id = read.nextInt();
		ArrayList<Customer> copy = new ArrayList<>();
		if (checkID(InfoArrayList, customers)) {
//			//		Collections.sort((List<T>) InfoArrayList);
//			Collections.sort(List<Order<Object>>);
//			Collections.sort(List<Order>);

		}
		else {
			System.out.println("the customer has not been found in the customer\r\n"
					+ "list.");
		}

	}

	public static void option2() {
		// :b: from point 2
		System.out.println("Enter your ID :");
		long id = read.nextLong();
		IdTest = new Customer(id);
//		System.out.println(customers.getCustomerID()); 
		if (!InfoArrayList.contains(IdTest)) {// false
			System.out.println("This Id was not found");
			System.out.println("Enter ~1~ to Enter differnt Id :");
			System.out.println("Enter ~2~ to create a new one :");
			System.out.println("Enter any else number to Quit!");
			int num = read.nextInt();
			switch (num) {
			case (1):
				option2();
				break;
			case (2):
				option1();
				break;
			default:
				break;

			}

		} else {
			System.out.println("Enter ~1~ for Phone Order!");
			System.out.println("Enter ~2~ for Mail Order!");
			int typeOfOrder = read.nextInt();

			switch (typeOfOrder) {
			case 1:
				PhoneOrder phone = new PhoneOrder(customers, new Date());
				phone.createOrder();
				creatItemsListForBothType();
				System.out.println("Enter call duration:");
				int callDur = read.nextInt();
				phone.setCallDuration(callDur);
				System.out.println(phone.toString());
				System.out.print(phone.orderTotal());
				phone.printOrder();
				MENU();
//				ReOrder();  

				break;
			case 2:
				MailOrder mail = new MailOrder(customers, new Date());
				mail.createOrder();
				System.out.println("mail order done");
				creatItemsListForBothType();
				System.out.println(mail.toString());
				mail.printOrder();
				MENU();
//				ReOrder();
				break;
			default:
				break;
			}

		}
	}

	public static void option1() {
		// :a: from point 2
		EnterInfo();
		if (!checkID(InfoArrayList, customers)) {
			addCustomers();
			MENU();
		} else {
			System.out.println("You're exist!");
			MENU();
		}
	}

	// void method enter all info. customer
	public static void EnterInfo() {

		System.out.println("Enter id:");
		long id = read.nextLong();
		read.nextLine();// to fix the problem of don't take the value of next nextLine()
		System.out.println("Enter the name:");
		String name = read.nextLine();
		System.out.println("Enter address:");
		String address = read.nextLine();
		customers = new Customer(id, name, address);
	}

	public static boolean checkID(ArrayList<Customer> InfoArrayList, Customer customers) {
		if (InfoArrayList.contains(customers)) {
			return true;
		} else {
			return false;
		}
	}

	public static void addCustomers() {
		if (checkID(InfoArrayList, customers) == false) {
			System.out.println(customers);
			InfoArrayList.add(customers);
			System.out.println("You're not exist ,we will add you!");
		} else {
			System.out.println("You're already exist!");
		}
	}

	public static void MENU() {
		System.out.println("Enter ~1~ to add a customer!");
		System.out.println("Enter ~2~ to make a new order!");
		System.out.println("Enter ~3~ to Display Customer's Orders!");
		System.out.println("Enter ~4~ to Quit!");
		int option = read.nextInt();
		options(option);
	}

}

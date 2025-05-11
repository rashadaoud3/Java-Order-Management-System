# Java Order Management System

This project is a basic **Order Processing System** implemented in Java, structured within the `Assignment3` package. It demonstrates core Object-Oriented Programming (OOP) concepts such as **inheritance**, **polymorphism**, and **abstraction** by managing customer orders through two types: **Mail Order** and **Phone Order**.

---

## 📦 Project Structure

### 🔹 Core Classes

#### `Customer.java`
- Represents a customer with:
  - Unique customer ID
  - Name and address
  - A list of associated orders (`ArrayList<Order>`)
- Includes:
  - Methods to display customer information and orders
  - `equals()` overridden to compare by customer ID

#### `Order.java` *(Abstract Class)*
- Base class for all orders
- Contains:
  - Auto-incremented `orderID`
  - Reference to the `Customer`
  - `orderDate`
  - Static `ArrayList<OrderItem>` for order items *(shared across all orders)*
- Defines:
  - Abstract method `createOrder()`
  - Implements `Comparable<Order>` to enable sorting by date

#### `OrderItem.java`
- Represents a single item in an order:
  - Product ID
  - Description
  - Unit price
  - Quantity
- Computes and returns the subtotal (price × quantity)

---

### 🔸 Order Subclasses

#### `MailOrder.java`
- Extends `Order`
- Adds:
  - `postDate` field
- Implements:
  - `createOrder()` for mail-specific logic

#### `PhoneOrder.java`
- Extends `Order`
- Adds:
  - `callDuration`
  - `customerRep` (Customer Representative)
- Implements:
  - `createOrder()` for phone-specific logic

---

### 🏁 Driver Class

#### `driver.java`
- Main entry point of the program
- Provides a **menu-driven interface** for:
  - Adding customers
  - Creating orders (Mail or Phone)
  - Viewing customer orders
  - Exiting the application
- Maintains all customers in a static `ArrayList<Customer>`

---

## ✅ Key Features

### 👤 Customer Management
- Add new customers
- Search for existing customers by ID
- Update customer information (if needed)

### 🧾 Order Management
- Create:
  - Mail orders with post date
  - Phone orders with call duration and rep
- Add multiple items to each order
- Automatically assign order IDs
- Calculate and display total order amounts

### 🖥️ User Interface
- Simple console-based interface
- Menu options:
  1. Add a customer
  2. Create an order
  3. View all customer orders
  4. Exit the system

---

## ⚙️ Technical Details

### 🎯 OOP Concepts Used
- **Abstraction:** `Order` is an abstract class
- **Inheritance:** `MailOrder` and `PhoneOrder` extend `Order`
- **Polymorphism:** Order creation via overridden `createOrder()` methods
- **Encapsulation:** Private fields with getters/setters
- **Collections:** Use of `ArrayList` for dynamic data storage
- **Comparable:** Orders can be sorted by date

### 🧪 Implementation Notes
- `orderTotal()` currently returns an incorrect value — should be fixed
- `OrderItem` list is `static` — all orders share the same item list
- Some `toString()` methods provide incomplete output
- Partial implementation for PhoneOrder representative handling
- Recursive menu calls may lead to **stack overflow**

### ❌ Limitations
- No data persistence (everything is lost on program exit)
- Poor input validation
- No exception handling
- Incomplete sorting in option 3
- Shared `orderItems` list can lead to logic bugs

---

## 💡 Suggested Improvements

- Make `orderItems` an instance-level variable (not static)
- Fix the order total calculation logic
- Add robust input validation
- Implement file or database persistence
- Improve user feedback and error messages
- Separate UI from core logic for better structure
- Complete sorting functionality for viewing orders


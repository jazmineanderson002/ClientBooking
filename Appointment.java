package bookings;
import java.util.*;

// Parent class 
public class Appointment {
// instance variables
private String name;
private String date;
private int time;
private String service;
private double price;



//class constructor 
public Appointment(String n, String d, int t, String s, double p) {
setName(n); // client name
setDate(d); // date of appointment
time = t; // time of appointment
setService(s); // service being done
setPrice(p); // price of service
}

//show methods
void show() {
System.out.println("Name: " + getName());
System.out.println("Date: " + getDate());
System.out.println("Time: " + time);
System.out.println("Service: " + getService());
System.out.println("Price: " + getPrice());
}

//getters and setters
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getService() {
	return service;
}

public void setService(String service) {
	this.service = service;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
}







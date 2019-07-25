package bookings;
// child class of Appointment
public class BookAppointment extends Appointment {
private boolean discount;

	public BookAppointment(String n, String d, int t, String s, double p, boolean dis) {
		super(n, d, t, s, p);
		discount = dis;
	}
	public void show() {
		super.show();
		System.out.println("There is a discount: " + discount);
		System.out.println();
	}
	
	
	public boolean getDis()
	{
		return discount;
	}
	public void setDiscount(boolean discount) {
		this.discount = discount;
	}
	
}

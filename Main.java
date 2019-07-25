package bookings;

public class Main {
// main method / object creation
	
	public static void main(String args[]) {
		// array holding appointments
		Appointment bookings[] = new Appointment[5];
		
		bookings[0] = new BookAppointment("Kayla", "July 5th", 3, "eyelashes", 25.00, true);
		
		bookings[1] = new BookAppointment("David", "July 8th", 2, "trim", 15.00, false);
		
		bookings[2] = new BookAppointment("Jazmine", "July 11th", 5, "braids", 75.00, false);
		
		bookings[3] = new BookAppointment("Amaya", "July 11th", 9, "nails", 40.00, false);
		
		bookings[4] = new BookAppointment ("Savanah", "July 13th", 12, "dye", 55.00, true);
		
		for(int i = 0; i < bookings.length; i++)
		{
			bookings[i].show();
		}
		
	}
}

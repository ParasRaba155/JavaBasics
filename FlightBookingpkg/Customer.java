package FlightBookingpkg;

import FlightBookingpkg.enumpkg.FlightOprator;
import FlightBookingpkg.enumpkg.FlightType;
import FlightBookingpkg.Booking.BookingSystem;

public class Customer {
    public static void main(String[] args){
        try {
            CommonFlightInterface b1 = BookingSystem.Flight(FlightOprator.AIRBUS,FlightType.DOMESTIC);
            b1.setter(15);
            b1.welcome();
            BookingSystem.bookFlight(b1, 1);
            BookingSystem.bookFlight(b1, 2);

            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

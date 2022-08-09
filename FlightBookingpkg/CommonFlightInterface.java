package FlightBookingpkg;

import java.util.ArrayList;

public interface CommonFlightInterface {
     
    void welcome();
    int getTotalSeats();
    ArrayList<Integer> getAvailableSeats();
    ArrayList<Integer> getBookedSeats();
    void setter(int totalSeats);
}

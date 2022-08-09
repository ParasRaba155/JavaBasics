package FlightBookingpkg.Booking;

import FlightBookingpkg.CommonFlightInterface;
import FlightBookingpkg.FlightFactory;
import FlightBookingpkg.FlightInterface;
import FlightBookingpkg.Exceptions.InvalidFlightTypeException;
import FlightBookingpkg.Exceptions.SeatNOtAvailable;
import FlightBookingpkg.enumpkg.FlightOprator;
import FlightBookingpkg.enumpkg.FlightType;


public abstract class BookingSystem {
    public static CommonFlightInterface Flight(FlightOprator flightOprator,FlightType flightType) throws InvalidFlightTypeException {

        FlightInterface f = FlightFactory.createFlight(flightOprator);
        switch(flightOprator){
            case BOEING:
                return (CommonFlightInterface) f.createBoeingFlight(flightType);
            case AIRBUS:
                return (CommonFlightInterface) f.createAirbusFlight(flightType);
            default:
                break;
        }
        throw new InvalidFlightTypeException("Invalid flight exception");
    }

    public static void bookFlight(CommonFlightInterface flight, int seatNo) throws SeatNOtAvailable{
       
        if(checkSeat(flight, seatNo)){
            flight.getAvailableSeats().remove(seatNo-1);
            flight.getBookedSeats().set(seatNo-1, 0);
            System.out.println("Seat Number "+seatNo+" has been booked succesfully");
        }
        else{
            throw new SeatNOtAvailable("The entered seat is not avaialble");
        }

    }

    public static boolean checkSeat(CommonFlightInterface flight, int seatNo){
      
        if((flight.getAvailableSeats().contains(seatNo)) && (flight.getBookedSeats().indexOf(seatNo-1) != 0)){
            return true;
        } 
        return false;
    }
}

package FlightBookingpkg;

import FlightBookingpkg.Exceptions.InvalidFlightTypeException;
import FlightBookingpkg.enumpkg.FlightOprator;

public abstract class FlightFactory {
    public static FlightInterface createFlight(FlightOprator flightOprator) throws InvalidFlightTypeException{
        switch(flightOprator){
            case BOEING:
                return new BoeingFlight();
            case AIRBUS:
                return new AirbusFlight();
        }
        throw new InvalidFlightTypeException("Invalid flight operator");
    }
}

class BookingSystem {

    public static CommonFlightInterface Flight() {
        return null;
    }



}

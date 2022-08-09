package FlightBookingpkg;

import FlightBookingpkg.Exceptions.InvalidFlightTypeException;
import FlightBookingpkg.enumpkg.FlightType;

public interface FlightInterface {
    BoeingInterface createBoeingFlight(FlightType flightType) throws InvalidFlightTypeException;
    AirbusInterface createAirbusFlight(FlightType flightType) throws InvalidFlightTypeException;
}

class BoeingFlight implements FlightInterface{

    @Override
    public BoeingInterface createBoeingFlight(FlightType flightType) throws InvalidFlightTypeException {
        switch(flightType){
            case DOMESTIC:
                return new BoeingDomestic();
            case INTERNATIONAL:
                return new BoeingInternational();
        }
        throw new InvalidFlightTypeException("Invalid Flight type");
    }

    @Override
    public AirbusInterface createAirbusFlight(FlightType flightType) {
        return null;
    }
    
}

class AirbusFlight implements FlightInterface{

    @Override
    public BoeingInterface createBoeingFlight(FlightType flightType) {
        return null;
    }

    @Override
    public AirbusInterface createAirbusFlight(FlightType flightType) throws InvalidFlightTypeException {
        switch(flightType){
            case DOMESTIC:
                return new AirbusDomestic();
            case INTERNATIONAL:
                return new AirbusInternational();
        }
        throw new InvalidFlightTypeException("Invalid Flight type");

    }

}

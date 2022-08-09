package FlightBookingpkg;

import java.util.ArrayList;

public interface BoeingInterface {
    
    int getTotalSeats();
    ArrayList<Integer> getAvailableSeats();
    ArrayList<Integer> getBookedSeats();
    void setter(int totalSeats);
}

class BoeingDomestic implements BoeingInterface,CommonFlightInterface{

    private int totalSeats;
    private ArrayList<Integer> availableSeats = new ArrayList<>(totalSeats);
    private ArrayList<Integer> bookedSeats = new ArrayList<>(totalSeats);

    @Override
    public int getTotalSeats() {
        return totalSeats;
    }

    @Override
    public ArrayList<Integer> getAvailableSeats() {
        return availableSeats;
    }

    @Override
    public ArrayList<Integer> getBookedSeats() {
        return bookedSeats;
    }
    
    @Override
    public void setter(int totalSeats) {
        this.totalSeats = totalSeats;

        for(int i=1; i<= totalSeats; i++){
            this.availableSeats.add(i);
            this.bookedSeats.add(i);
        }
    }

    @Override
    public void welcome() {
        System.out.println("welcome to Boeing Domestic flight");
    }
}


class BoeingInternational implements BoeingInterface,CommonFlightInterface{

    private int totalSeats;
    private ArrayList<Integer> availableSeats = new ArrayList<>(totalSeats);
    private ArrayList<Integer> bookedSeats = new ArrayList<>(totalSeats);

    @Override
    public int getTotalSeats() {
        return totalSeats;
    }

    @Override
    public ArrayList<Integer> getAvailableSeats() {
        return availableSeats;
    }

    @Override
    public ArrayList<Integer> getBookedSeats() {
        return bookedSeats;
    }
    
    @Override
    public void setter(int totalSeats) {
        this.totalSeats = totalSeats;

        for(int i=1; i<= totalSeats; i++){
            this.availableSeats.add(i);
            this.bookedSeats.add(i);
        }
    }

    @Override
    public void welcome() {
        System.out.println("welcome to Boeing International flight");
    }
}

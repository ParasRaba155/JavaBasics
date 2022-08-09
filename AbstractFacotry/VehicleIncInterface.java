package AbstractFacotry;

public interface VehicleIncInterface {
    void getInc();
}


class LongTermVehicleInc implements VehicleIncInterface{

    @Override
    public void getInc() {
        System.out.println("Long term Vehicle Insurance");
    }
}

class ShortTermVehicleInc implements VehicleIncInterface{

    @Override
    public void getInc() {
        System.out.println("Short term Vehicle Insurance"); 
    }
}
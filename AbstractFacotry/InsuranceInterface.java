package AbstractFacotry;

public interface InsuranceInterface {
    HealthIncInterface getHealthInsurance(TermType termType);
    VehicleIncInterface getVehicleInsurance(TermType termType);
}

class HealthInsurance implements InsuranceInterface{

    @Override
    public HealthIncInterface getHealthInsurance(TermType termType) {
        switch(termType){
            case LONG:
                return new LongTermHealthInc();
            case SHORT:
                return new ShortTermHealthInc();
        }
        return null;
    }

    @Override
    public VehicleIncInterface getVehicleInsurance(TermType termType) {
        return null;
    }
    
}

class VehicleInsurance implements InsuranceInterface{

    @Override
    public HealthIncInterface getHealthInsurance(TermType termType) {
        return null;
    }

    @Override
    public VehicleIncInterface getVehicleInsurance(TermType termType) {
        switch(termType){
            case LONG:
                return new LongTermVehicleInc();
            case SHORT:
                return new ShortTermVehicleInc();
        }
        return null;
    }

}

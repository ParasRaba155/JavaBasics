package AbstractFacotry;

public class InsuranceFactory {
    public static InsuranceInterface createInsurance(IncType incType){
        switch(incType){
            case HEALTH:
                return new HealthInsurance();
            case VEHICLE:
                return new VehicleInsurance();
        }
        return null;
    }
}

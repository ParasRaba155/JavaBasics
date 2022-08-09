package AbstractFacotry;

public class Client {
    public static void main(String[] args){
            InsuranceInterface I = InsuranceFactory.createInsurance(IncType.HEALTH);
            HealthIncInterface H = I.getHealthInsurance(TermType.LONG);
            H.getInc();;    
    }
}

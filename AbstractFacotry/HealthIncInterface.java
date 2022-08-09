package AbstractFacotry;

public interface HealthIncInterface {
    void getInc();
}

class LongTermHealthInc implements HealthIncInterface{

    @Override
    public void getInc() {
        System.out.println("Long term Health Insurance");
    }
}

class ShortTermHealthInc implements HealthIncInterface{

    @Override
    public void getInc() {
        System.out.println("Short term Health Insurance"); 
    }
}

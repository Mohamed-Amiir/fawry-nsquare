package models;

public class HybridEngine implements Engine {

    public GasEngine gas;
    public ElectricEngine electric;
    public Engine currentEng = new ElectricEngine();

    public HybridEngine(GasEngine gas, ElectricEngine electric) {
        this.gas = gas;
        this.electric = electric;
    }
    
    public void setEngine(Engine engine) {
        this.currentEng = engine;
    }
    public Engine getCurrentHybridEngine() {
        return this.currentEng;
    }   




    public void checkSpeed(int speed) {
        Engine temp = currentEng;
        if (speed < 50) {
            currentEng = electric;
        } else {
            currentEng = gas;
        }
        if(currentEng != temp) {
            System.out.println("Switching to " + currentEng.getClass().getSimpleName());
        }
        // currentEng.setSpeed(this.currentEng.getSpeed());
    }


    @Override
    public int increaseSpeed(int speed) {
        int newSpeed = currentEng.increaseSpeed(speed);
        checkSpeed(newSpeed);
        return newSpeed;
    }
    @Override
    public int decreaseSpeed(int speed) {
        int newSpeed = currentEng.decreaseSpeed(speed);
        checkSpeed(newSpeed);
        return newSpeed;    
    }


}

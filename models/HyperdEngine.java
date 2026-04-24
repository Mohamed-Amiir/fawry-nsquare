package models;

public class HyperdEngine implements Engine {
    private int speed = 0;
    public GasEngine gas;
    public ElectricEngine electric;
    public Engine currentEng = electric;

    public HyperdEngine(GasEngine gas, ElectricEngine electric) {
        this.gas = gas;
        this.electric = electric;
    }
    
    public void setEngine(Engine engine) {
        this.currentEng = engine;
    }
    public Engine getCurrentHyperdEngine() {
        return this.currentEng;
    }   
    public int getSpeed() {
        return this.speed;
    }
    public void checkSpeed() {
        if (this.speed < 50) {
            currentEng = electric;
        } else {
            currentEng = gas;
        }
        currentEng.setSpeed(speed);
    }
    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        checkSpeed();
    }
    @Override
    public void increaseSpeed() {
        currentEng.increaseSpeed();
        checkSpeed();
    }
    @Override
    public void decreaseSpeed() {
        currentEng.decreaseSpeed();
        checkSpeed();
    }


}

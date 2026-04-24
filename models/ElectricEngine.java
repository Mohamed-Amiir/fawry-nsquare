package models;

public class ElectricEngine implements Engine {
    private int speed;

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public int getSpeed() {
        return this.speed;
    }   

    @Override
    public void increaseSpeed() {
        this.speed ++;
    }

    @Override
    public void decreaseSpeed() {
        this.speed --;
    }
    
}

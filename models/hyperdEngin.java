package models;

public class hyperdEngin implements engine {
    private int speed = 0;
    public gasEngine g;
    public electricEngin e;
    public engine currentEng = e;

    public hyperdEngin(gasEngine g, electricEngin e) {
        this.g = g;
        this.e = e;
    }
    
    public void setEngine(engine engine) {
        this.currentEng = engine;
    }
    public engine getCurrentHyperdEngine() {
        return this.currentEng;
    }   
    public int getSpeed() {
        return this.speed;
    }
    public void checkSpeed() {
        if (this.speed < 50) {
            currentEng = e;
        } else {
            currentEng = g;
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

package models;

public class GasEngine implements Engine {
    private int speed;
        public int getSpeed() {
            return this.speed;
        }
    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed++;
    }

    @Override
    public void decreaseSpeed() {
        this.speed--;
    }
    
}

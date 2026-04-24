package models;

public class Car {
    private int speed;

    private Engine engine;
    private final int maxSpeed = 200;
    public Car(Engine engine) {
        this.engine = engine;
    }
    public int getSpeed() {
        return this.speed;
    }
    public void setEngine(Engine engine) {
        stop();
        this.engine = engine;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void start() {
        this.speed = 0;
    }

    public void stop() {
        this.speed = 0;
    }

    public void accelerate() {
     
        int i = 20;
        while (this.speed < maxSpeed && i-- > 0) {
            this.speed = engine.increaseSpeed(this.speed);
        }

        
    }

    public void brake() {
       
        int i = 20;
        while (this.speed > 0 && i-- > 0) {
            this.speed = engine.decreaseSpeed(this.speed);
        }
        
    }
}

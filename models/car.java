package models;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        int currentSpeed = this.engine.getSpeed();
        this.engine = engine;
        this.engine.setSpeed(currentSpeed);
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void start() {
        engine.setSpeed(0);
    }

    public void stop() {
        engine.setSpeed(0);
    }

    public void accelerate() {
        if (engine.getSpeed() < 200) {
            engine.setSpeed(engine.getSpeed() + 20);

        }
    }

    public void brake() {
        if (engine.getSpeed() > 0) {
            engine.setSpeed(engine.getSpeed() - 20);
        }
    }
}

package models;

public class car {

    private engine engine;

    public car(engine engine) {
        this.engine = engine;
    }

    public void setEngine(engine engine) {
        int currentSpeed = this.engine.getSpeed();
        this.engine = engine;
        this.engine.setSpeed(currentSpeed);
    }

    public engine getEngine() {
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

package models;

public class Factory {
    public Car createCar(Engine engine) {
        return new Car(engine);
    }
    public void replaceEngine(Car car, Engine newEngine) {
        car.setEngine(newEngine);        
    }
}

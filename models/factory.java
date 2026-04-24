package models;

public class factory {
    public car createCar(engine engine) {
        return new car(engine);
    }
    public void replaceEngine(car car, engine newEngine) {
        car.setEngine(newEngine);        
    }
}

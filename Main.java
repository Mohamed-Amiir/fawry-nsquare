import models.Car;
import models.ElectricEngine;
import models.Engine;
import models.Factory;
import models.GasEngine;
import models.HyperdEngine;

public class Main {
    public static void main(String[] args) {

        // HELLO FAWRY 
        // I setted a test flow for the car and the engines to show how the car can switch between engines and how the speed changes with each engine
        // Run this code and check the console output to see the results

        System.out.println("Hello, World!");
        
        GasEngine ge = new GasEngine();
        ElectricEngine ee = new ElectricEngine();
        HyperdEngine he = new HyperdEngine(ge, ee);

        Factory carFactory = new Factory();


        Car myCar = carFactory.createCar(ge);
        myCar.start();
        System.out.println("HERE WE GO.....");
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current speed: " + myCar.getEngine().getSpeed());
        System.out.println("Accelerating...");
        myCar.accelerate();
        System.out.println("Current speed: " + myCar.getEngine().getSpeed());
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Accelerating...");
        myCar.accelerate();
        System.out.println("Current speed: " + myCar.getEngine().getSpeed());
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Braking...");   
        myCar.brake();
        System.out.println("Current speed: " + myCar.getEngine().getSpeed());
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Changing Engine.... "  );
        

        carFactory.replaceEngine(myCar, he);
        System.out.println("Current speed: " + myCar.getEngine().getSpeed());
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current Hyperd Engine: " + ((HyperdEngine)myCar.getEngine()).getCurrentHyperdEngine().getClass().getSimpleName());
        System.out.println("Accelerating...");
        myCar.accelerate();
        System.out.println("Current speed: " + myCar.getEngine().getSpeed());
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current Hyperd Engine: " + ((HyperdEngine)myCar.getEngine()).getCurrentHyperdEngine().getClass().getSimpleName());
        System.out.println("Accelerating...");
        myCar.accelerate();
        System.out.println("Current speed: " + myCar.getEngine().getSpeed());   
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current Hyperd Engine: " + ((HyperdEngine)myCar.getEngine()).getCurrentHyperdEngine().getClass().getSimpleName());
        System.out.println("Accelerating...");
        myCar.accelerate();
        System.out.println("Current speed: " + myCar.getEngine().getSpeed());   
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current Hyperd Engine: " + ((HyperdEngine)myCar.getEngine()).getCurrentHyperdEngine().getClass().getSimpleName());
        System.out.println("Accelerating...");
        myCar.accelerate();
        System.out.println("Current speed: " + myCar.getEngine().getSpeed());   
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current Hyperd Engine: " + ((HyperdEngine)myCar.getEngine()).getCurrentHyperdEngine().getClass().getSimpleName());
        System.out.println("Accelerating...");
        myCar.accelerate();
        System.out.println("Current speed: " + myCar.getEngine().getSpeed());   
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current Hyperd Engine: " + ((HyperdEngine)myCar.getEngine()).getCurrentHyperdEngine().getClass().getSimpleName());
        System.out.println("Braking...");
        myCar.brake();
        System.out.println("Current speed: " + myCar.getEngine().getSpeed());
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current Hyperd Engine: " + ((HyperdEngine)myCar.getEngine()).getCurrentHyperdEngine().getClass().getSimpleName());
        System.out.println("Braking...");
        myCar.brake();
        System.out.println("Current speed: " + myCar.getEngine().getSpeed());
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current Hyperd Engine: " + ((HyperdEngine)myCar.getEngine()).getCurrentHyperdEngine().getClass().getSimpleName());
        myCar.brake();
        System.out.println("Current speed: " + myCar.getEngine().getSpeed());
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current Hyperd Engine: " + ((HyperdEngine)myCar.getEngine()).getCurrentHyperdEngine().getClass().getSimpleName());
        System.out.println("Braking...");
        myCar.brake();
        System.out.println("Current speed: " + myCar.getEngine().getSpeed());
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current Hyperd Engine: " + ((HyperdEngine)myCar.getEngine()).getCurrentHyperdEngine().getClass().getSimpleName());

        // System.out.println("Stopping the car...");
        // myCar.stop();
        // System.out.println("Current speed: " + myCar.getEngine().getSpeed());
        // System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        // System.out.println("Current Hyperd Engine: " + ((hyperdEngin)myCar.getEngine()).getCurrentHyperdEngine().getClass().getSimpleName());

        // SWITCH ENGINE

        carFactory.replaceEngine(myCar, ge);
        System.out.println("Changing Engine.... "  );
        System.out.println("Current speed: " + myCar.getEngine().getSpeed());
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
    }
}

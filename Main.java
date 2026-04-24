import models.Car;
import models.ElectricEngine;
import models.Engine;
import models.Factory;
import models.GasEngine;
import models.HybridEngine;

public class Main {
    public static void main(String[] args) {

        // HELLO FAWRY 
        // I setted a test flow for the car and the engines to show how the car can switch between engines and how the speed changes with each engine
        // Run this code and check the console output to see the results

        System.out.println("Hello, World!");
        
        GasEngine gas = new GasEngine();
        ElectricEngine electric = new ElectricEngine();
        HybridEngine hybrid = new HybridEngine(gas, electric);

        Factory carFactory = new Factory();


        Car myCar = carFactory.createCar(gas);
        myCar.start();
        System.out.println("HERE WE GO.....");
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current speed: " + myCar.getSpeed());
        System.out.println("Accelerating...");
        System.out.println("*************************************************");
        myCar.accelerate();
        System.out.println("Current speed: " + myCar.getSpeed());
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Accelerating...");
        System.out.println("*************************************************");

        myCar.accelerate();
        System.out.println("Current speed: " + myCar.getSpeed());
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Braking...");   
        System.out.println("*************************************************");
        myCar.brake();
        System.out.println("Current speed: " + myCar.getSpeed());
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());

        System.out.println("*************************************************");  
        System.out.println("Changing Engine.... "  );
        System.out.println("*************************************************");
        

        carFactory.replaceEngine(myCar, hybrid);


        System.out.println("Current speed: " + myCar.getSpeed());
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current Hybrid Engine: " + ((HybridEngine)myCar.getEngine()).getCurrentHybridEngine().getClass().getSimpleName());
        System.out.println("Accelerating...");
        System.out.println("*************************************************");
        myCar.accelerate();
        System.out.println("Current speed: " + myCar.getSpeed());
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current Hybrid Engine: " + ((HybridEngine)myCar.getEngine()).getCurrentHybridEngine().getClass().getSimpleName());
        System.out.println("Accelerating...");
        System.out.println("*************************************************");
        myCar.accelerate();
        System.out.println("Current speed: " + myCar.getSpeed());   
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current Hybrid Engine: " + ((HybridEngine)myCar.getEngine()).getCurrentHybridEngine().getClass().getSimpleName());
        System.out.println("Accelerating...");
        System.out.println("*************************************************");
        myCar.accelerate();
        System.out.println("Current speed: " + myCar.getSpeed());   
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current Hybrid Engine: " + ((HybridEngine)myCar.getEngine()).getCurrentHybridEngine().getClass().getSimpleName());
        System.out.println("Accelerating...");
        System.out.println("*************************************************");
        myCar.accelerate();
        System.out.println("Current speed: " + myCar.getSpeed());   
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current Hybrid Engine: " + ((HybridEngine)myCar.getEngine()).getCurrentHybridEngine().getClass().getSimpleName());
        System.out.println("Accelerating...");
        System.out.println("*************************************************");
        myCar.accelerate();
        System.out.println("Current speed: " + myCar.getSpeed());   
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current Hybrid Engine: " + ((HybridEngine)myCar.getEngine()).getCurrentHybridEngine().getClass().getSimpleName());
        System.out.println("Braking...");
        System.out.println("*************************************************");
        myCar.brake();
        System.out.println("Current speed: " + myCar.getSpeed());
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current Hybrid Engine: " + ((HybridEngine)myCar.getEngine()).getCurrentHybridEngine().getClass().getSimpleName());
        System.out.println("Braking...");
        System.out.println("*************************************************");
        myCar.brake();
        System.out.println("Current speed: " + myCar.getSpeed());
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current Hybrid Engine: " + ((HybridEngine)myCar.getEngine()).getCurrentHybridEngine().getClass().getSimpleName());
        System.out.println("Braking...");
        System.out.println("*************************************************");
        myCar.brake();
        System.out.println("Current speed: " + myCar.getSpeed());
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current Hybrid Engine: " + ((HybridEngine)myCar.getEngine()).getCurrentHybridEngine().getClass().getSimpleName());
        System.out.println("Braking...");
        System.out.println("*************************************************");
        myCar.brake();
        System.out.println("Current speed: " + myCar.getSpeed());
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        System.out.println("Current Hybrid Engine: " + ((HybridEngine)myCar.getEngine()).getCurrentHybridEngine().getClass().getSimpleName());

        // System.out.println("Stopping the car...");
        // myCar.stop();
        // System.out.println("Current speed: " + myCar.getEngine().getSpeed());
        // System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        // System.out.println("Current Hybrid Engine: " + ((HybridEngine)myCar.getEngine()).getCurrentHybridEngine().getClass().getSimpleName());

        carFactory.replaceEngine(myCar, gas);
        System.out.println("Changing Engine.... "  );
        System.out.println("Current speed: " + myCar.getSpeed());
        System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
    }
}

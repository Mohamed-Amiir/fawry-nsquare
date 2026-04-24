error id: file:///C:/Users/lenovo/Desktop/My-Github/fawry-nsquare/Main.java:models/car#accelerate().
file:///C:/Users/lenovo/Desktop/My-Github/fawry-nsquare/Main.java
empty definition using pc, found symbol in pc: models/car#accelerate().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 681
uri: file:///C:/Users/lenovo/Desktop/My-Github/fawry-nsquare/Main.java
text:
```scala
import models.car;
import models.electricEngin;
import models.engine;
import models.factory;
import models.gasEngine;
import models.hyperdEngin;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        gasEngine ge = new gasEngine();
        electricEngin ee = new electricEngin();
        hyperdEngin he = new hyperdEngin(ge, ee);

        factory carFactory = new factory();

        // lats start with a gas engine
        car myCar = carFactory.createCar(ge);
        myCar.start();
        System.out.println("Current speed: " + myCar.getEngine().getSpeed());
        myCar.accelerate@@();
        System.out.println("Current speed: " + myCar.getEngine().getSpeed());
        myCar.accelerate();
        System.out.println("Current speed: " + myCar.getEngine().getSpeed());
        myCar.brake();
        System.out.println("Current speed: " + myCar.getEngine().getSpeed());

        // // now we replace the engine with a hyperdEngine
        // carFactory.replaceEngine(myCar, he);
        // System.out.println("Current speed: " + myCar.getEngine().getSpeed());
        // System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        // myCar.accelerate();
        // System.out.println("Current speed: " + myCar.getEngine().getSpeed());
        // System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        // myCar.accelerate();
        // System.out.println("Current speed: " + myCar.getEngine().getSpeed());   
        // System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        // myCar.accelerate();
        // System.out.println("Current speed: " + myCar.getEngine().getSpeed());   
        // System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        // myCar.accelerate();
        // System.out.println("Current speed: " + myCar.getEngine().getSpeed());   
        // System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        // myCar.accelerate();
        // System.out.println("Current speed: " + myCar.getEngine().getSpeed());   
        // System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        // myCar.brake();
        // System.out.println("Current speed: " + myCar.getEngine().getSpeed());
        // System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
        // myCar.brake();
        // System.out.println("Current speed: " + myCar.getEngine().getSpeed());
        // System.out.println("Current engine: " + myCar.getEngine().getClass().getSimpleName());
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: models/car#accelerate().
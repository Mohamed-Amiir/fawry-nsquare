error id: file:///C:/Users/lenovo/Desktop/My-Github/fawry-nsquare/models/car.java:models/engine#setSpeed().
file:///C:/Users/lenovo/Desktop/My-Github/fawry-nsquare/models/car.java
empty definition using pc, found symbol in pc: models/engine#setSpeed().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 446
uri: file:///C:/Users/lenovo/Desktop/My-Github/fawry-nsquare/models/car.java
text:
```scala
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
        engine.setSpeed@@(0);
    }

    public void stop() {
        engine.setSpeed(0);
    }

    public void accelerate() {
        if (engine.getSpeed() < 200) {
            engine.setSpeed(engine.getSpeed() + 20);
            engine.increaseSpeed();
        }
    }

    public void brake() {
        if (engine.getSpeed() > 0) {
            engine.setSpeed(engine.getSpeed() - 20);
            engine.decreaseSpeed();
        }
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: models/engine#setSpeed().
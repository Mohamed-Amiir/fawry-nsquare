error id: file:///C:/Users/lenovo/Desktop/My-Github/fawry-nsquare/models/car.java:
file:///C:/Users/lenovo/Desktop/My-Github/fawry-nsquare/models/car.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 99
uri: file:///C:/Users/lenovo/Desktop/My-Github/fawry-nsquare/models/car.java
text:
```scala
public class Car {
    private int speed = 0;
    private Engine engine;

    public Car(Engine@@ engine) {
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        speed = 0;
        engine.setSpeed(speed);
    }

    public void stop() {
        speed = 0;
        engine.setSpeed(speed);
    }

    public void accelerate() {
        if (speed < 200) {
            speed += 20;
            engine.setSpeed(speed);
            engine.increase();
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= 20;
            engine.setSpeed(speed);
            engine.decrease();
        }
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 
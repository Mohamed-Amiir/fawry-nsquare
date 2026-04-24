error id: file:///C:/Users/lenovo/Desktop/My-Github/fawry-nsquare/models/car.java:_empty_/Engine#
file:///C:/Users/lenovo/Desktop/My-Github/fawry-nsquare/models/car.java
empty definition using pc, found symbol in pc: _empty_/Engine#
found definition using semanticdb; symbol models/car#`<init>`().
empty definition using fallback
non-local guesses:

offset: 62
uri: file:///C:/Users/lenovo/Desktop/My-Github/fawry-nsquare/models/car.java
text:
```scala
public class Car {
    private int speed = 0;
    private En@@gine engine;

    public Car(Engine engine) {
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

empty definition using pc, found symbol in pc: _empty_/Engine#
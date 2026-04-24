package models;

public class GasEngine implements Engine {



    
    @Override
    public int increaseSpeed(int speed) {
        return speed += 1;
      
    }

    @Override
    public int decreaseSpeed(int speed ) {
        return speed -= 1;
    }
    
}

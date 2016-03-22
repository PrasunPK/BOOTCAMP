package storage;

import java.util.ArrayList;

public class Bag {
    private static int MAX_SIZE_OF_BAG = 12;
    private final ArrayList<Ball> bag;
    private int numberOfBalls = 0;

    public Bag() {
        bag = new ArrayList<>(MAX_SIZE_OF_BAG);
    }

    public void put(Ball newBall) throws BagIsFullException {
        if(numberOfBalls >= MAX_SIZE_OF_BAG)
            throw new BagIsFullException();
        bag.add(newBall);
        numberOfBalls++;
    }

    public int size() {
        return numberOfBalls;
    }
}

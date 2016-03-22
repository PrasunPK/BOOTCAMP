package storage;

import java.util.HashMap;

public class Bag {
    private static int MAX_SIZE_OF_BAG = 12;
    private int numberOfBalls = 0;

    private HashMap<BallColor, Integer> bag;
    private BallColor colors[];

    public Bag(BallColor[] colors) {
        this.colors = colors;
        this.bag = new HashMap<>(MAX_SIZE_OF_BAG);
    }

    public void put(Ball newBall) throws BagIsFullException, BallColorIsFullException {
        if (numberOfBalls >= MAX_SIZE_OF_BAG)
            throw new BagIsFullException();
        for (BallColor color : colors) {
            if (isValidColorBall(newBall, color)) {
                putInBag(color);
                numberOfBalls++;
            }
        }
    }

    private void putInBag(BallColor color) throws BallColorIsFullException {
        int totalNumberOfBalls = 0;
        if (!bag.containsKey(color) && !isBallColorFilled(color)) {
            bag.put(color, totalNumberOfBalls + 1);
        }
        if(isBallColorFilled(color)){
            throw  new BallColorIsFullException();
        }
        totalNumberOfBalls = bag.get(color);
        totalNumberOfBalls += 1;
        bag.put(color, totalNumberOfBalls);
    }

    private boolean isValidColorBall(Ball newBall, BallColor color) {
        return newBall.isOfColor(color);
    }

    public int size() {
        return numberOfBalls;
    }

    public boolean isBallColorFilled(BallColor color) {
        if (bag.size() == 0) return false;
        if (bag.containsKey(color))
            return color.isFull(bag.get(color));
        return false;
    }
}

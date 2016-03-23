package bag;

import ball.Ball;
import ball.Balls;
import exceptions.BagIsFullException;
import exceptions.GreenBallFullException;
import exceptions.YellowBallException;
import rules.RedBallFullException;
import rules.Rule;
import rules.Rules;

public class Bag {
    private  Rules rules;
    private Balls balls;
    private final int capacity;

    private Bag(int capacity, Balls balls, Rules rules) {
        this.capacity = capacity;
        this.balls = balls;
        this.rules = rules;
    }

    public int size() {
        return this.balls.size();
    }

    public static Bag createBag(int capacity, Balls balls, Rules rules) {
        return new Bag(capacity, balls, rules);
    }

    public boolean add(Ball ball) throws BagIsFullException, GreenBallFullException, RedBallFullException, YellowBallException {
        if(isFull())
            throw new BagIsFullException();
        for (Rule rule : rules) {
            if(!rule.canBeAdded(balls, ball))
                return false;
        }
        return balls.add(ball);
    }

    public boolean isFull() {
        return size() == capacity;
    }
}

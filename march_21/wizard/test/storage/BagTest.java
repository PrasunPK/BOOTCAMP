package storage;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class BagTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void should_add_a_green_ball_to_the_bag() throws BagIsFullException, BallColorIsFullException {
        Bag bag = new Bag(BallColor.values());
        bag.put(new Ball(BallColor.GREEN));
        assertEquals(1, bag.size());
    }

    @Test
    public void can_add_multiple_balls() throws BagIsFullException, BallColorIsFullException {
        Bag bag = new Bag(BallColor.values());
        bag.put(new Ball(BallColor.GREEN));
        bag.put(new Ball(BallColor.GREEN));
        bag.put(new Ball(BallColor.GREEN));
        assertEquals(3, bag.size());
    }

    @Test
    public void can_add_twelve_balls_only() throws BagIsFullException, BallColorIsFullException {
        Bag bag = new Bag(BallColor.values());
        bag.put(new Ball(BallColor.GREEN));
        bag.put(new Ball(BallColor.GREEN));
        bag.put(new Ball(BallColor.GREEN));
        bag.put(new Ball(BallColor.RED));
        bag.put(new Ball(BallColor.RED));
        bag.put(new Ball(BallColor.RED));
        bag.put(new Ball(BallColor.RED));
        bag.put(new Ball(BallColor.RED));
        bag.put(new Ball(BallColor.BLUE));
        bag.put(new Ball(BallColor.BLUE));
        bag.put(new Ball(BallColor.BLUE));
        bag.put(new Ball(BallColor.BLUE));

        thrown.expect(BagIsFullException.class);
        thrown.expectMessage("Bag is full");

        bag.put(new Ball(BallColor.BLUE));
    }

    @Test
    public void can_add_only_three_green_balls() throws BagIsFullException, BallColorIsFullException {
        Bag bag = new Bag(BallColor.values());
        bag.put(new Ball(BallColor.GREEN));
        bag.put(new Ball(BallColor.GREEN));
        bag.put(new Ball(BallColor.GREEN));

        thrown.expect(BallColorIsFullException.class);
        bag.put(new Ball(BallColor.GREEN));
    }
}
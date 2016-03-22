package storage;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class BagTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void should_add_a_green_ball_to_the_bag() throws BagIsFullException {
        Bag bag = new Bag();
        bag.put(new Ball(BallColor.GREEN));
        assertEquals(1, bag.size());
    }

    @Test
    public void can_add_multiple_balls() throws BagIsFullException {
        Bag bag = new Bag();
        bag.put(new Ball(BallColor.GREEN));
        bag.put(new Ball(BallColor.GREEN));
        bag.put(new Ball(BallColor.GREEN));
        assertEquals(3, bag.size());
    }

    @Test
    public void can_add_twelve_balls_only() throws BagIsFullException {
        Bag bag = new Bag();
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
}
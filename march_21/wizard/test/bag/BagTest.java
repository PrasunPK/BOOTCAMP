package bag;

import ball.Ball;
import ball.Balls;
import exceptions.BagIsFullException;
import exceptions.GreenBallFullException;
import exceptions.YellowBallException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import rules.*;

import static org.junit.Assert.assertEquals;

public class BagTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void can_add_one_green_ball() throws BagIsFullException, GreenBallFullException, RedBallFullException, YellowBallException {
        Rules rules = new Rules();
        rules.add(new GreenBallRule());

        Balls balls = new Balls();

        Bag bag = Bag.createBag(12, balls, rules);
        bag.add(Ball.createGreenBall());

        assertEquals(1, bag.size());
    }

    @Test
    public void can_add_three_green_balls_only() throws BagIsFullException, GreenBallFullException, RedBallFullException, YellowBallException {
        Rules rules = new Rules();
        rules.add(new GreenBallRule());

        Balls balls = new Balls();
        Bag bag = Bag.createBag(12, balls, rules);

        bag.add(Ball.createGreenBall());
        bag.add(Ball.createGreenBall());
        bag.add(Ball.createGreenBall());
        assertEquals(3, bag.size());

        thrown.expect(GreenBallFullException.class);
        bag.add(Ball.createGreenBall());

    }

    @Test
    public void can_add_red_ball_only_when_there_is_at_least_one_green_ball() throws BagIsFullException, GreenBallFullException, RedBallFullException, YellowBallException {
        Rules rules = new Rules();
        rules.add(new GreenBallRule());
        rules.add(new RedBallRule());

        Balls balls = new Balls();
        Bag bag = Bag.createBag(12, balls, rules);

        bag.add(Ball.createGreenBall());
        bag.add(Ball.createRedBall());

        assertEquals(2, bag.size());
    }

    @Test
    public void throws_exception_when_there_is_no_green_ball_in_the_collection() throws RedBallFullException, BagIsFullException, GreenBallFullException, YellowBallException {
        Rules rules = new Rules();
        rules.add(new GreenBallRule());
        rules.add(new RedBallRule());

        Balls balls = new Balls();
        Bag bag = Bag.createBag(1, balls, rules);

        thrown.expect(RedBallFullException.class);
        bag.add(Ball.createRedBall());
    }

    @Test
    public void can_not_add_four_red_balls_when_there_are_two_green_balls() throws RedBallFullException, BagIsFullException, GreenBallFullException, YellowBallException {
        Rules rules = new Rules();
        rules.add(new GreenBallRule());
        rules.add(new RedBallRule());

        Balls balls = new Balls();
        Bag bag = Bag.createBag(12, balls, rules);

        bag.add(Ball.createGreenBall());
        bag.add(Ball.createGreenBall());

        bag.add(Ball.createRedBall());
        bag.add(Ball.createRedBall());
        bag.add(Ball.createRedBall());

        thrown.expect(RedBallFullException.class);
        bag.add(Ball.createRedBall());
    }

    @Test
    public void can_add_two_yellow_balls_when_there_are_five_other_balls() throws RedBallFullException, BagIsFullException, GreenBallFullException, YellowBallException {
        Rules rules = new Rules();
        rules.add(new GreenBallRule());
        rules.add(new RedBallRule());
        rules.add(new YellowBallRule());

        Balls balls = new Balls();
        Bag bag = Bag.createBag(12, balls, rules);

        bag.add(Ball.createGreenBall());
        bag.add(Ball.createGreenBall());

        bag.add(Ball.createRedBall());
        bag.add(Ball.createRedBall());
        bag.add(Ball.createRedBall());

        bag.add(Ball.createYellowBall());
        bag.add(Ball.createYellowBall());

        assertEquals(7, bag.size());

    }


    @Test
    public void can_not_add_any_yellow_ball_when_there_is_no_balls() throws GreenBallFullException, YellowBallException, RedBallFullException, BagIsFullException {
        Rules rules = new Rules();
        rules.add(new GreenBallRule());
        rules.add(new RedBallRule());
        rules.add(new YellowBallRule());

        Balls balls = new Balls();
        Bag bag = Bag.createBag(12, balls, rules);

        thrown.expect(YellowBallException.class);
        bag.add(Ball.createYellowBall());

    }

    @Test
    public void can_add_any_amount_of_blue_balls() throws GreenBallFullException, YellowBallException, RedBallFullException, BagIsFullException {

        Rules rules = new Rules();
        rules.add(new GreenBallRule());
        rules.add(new RedBallRule());
        rules.add(new YellowBallRule());

        Balls balls = new Balls();
        Bag bag = Bag.createBag(3, balls, rules);

        bag.add(Ball.createBlueBall());
        bag.add(Ball.createBlueBall());
        bag.add(Ball.createBlueBall());
    }
}
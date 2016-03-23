package rules;

import ball.Ball;
import ball.Balls;
import exceptions.GreenBallFullException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class RedBallRuleTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void should_return_true_when_a_green_ball_is_present_in_the_collection() throws RedBallFullException, GreenBallFullException {
        Balls balls = new Balls();
        balls.add(Ball.createGreenBall());
        Ball ball = Ball.createRedBall();

        RedBallRule redRule = new RedBallRule();
        assertEquals(true, redRule.canBeAdded(balls, ball));
    }

    @Test
    public void should_throw_exception_when_green_ball_is_present() throws RedBallFullException, GreenBallFullException {
        Balls balls = new Balls();
        Ball ball = Ball.createRedBall();

        RedBallRule redRule = new RedBallRule();

        thrown.expect(RedBallFullException.class);
        redRule.canBeAdded(balls, ball);
    }


}
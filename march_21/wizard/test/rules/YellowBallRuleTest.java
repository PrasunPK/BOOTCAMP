package rules;

import ball.Ball;
import ball.Balls;
import exceptions.GreenBallFullException;
import exceptions.YellowBallException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class YellowBallRuleTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void throws_exception_when_yellow_ball_is_added_first_time() throws YellowBallException, RedBallFullException, GreenBallFullException {
        YellowBallRule yellowRule = new YellowBallRule();

        Balls balls = new Balls();
        thrown.expect(YellowBallException.class);
         yellowRule.canBeAdded(balls, Ball.createYellowBall());
    }

    @Test
    public void can_add_one_yellow_ball_when_three_green_balls_are_there() throws GreenBallFullException, YellowBallException, RedBallFullException {
        YellowBallRule yellowRule = new YellowBallRule();

        Balls balls = new Balls();
        balls.add(Ball.createGreenBall());
        balls.add(Ball.createGreenBall());
        balls.add(Ball.createGreenBall());

        balls.add(Ball.createYellowBall());
        balls.add(Ball.createYellowBall());

        thrown.expect(YellowBallException.class);
        yellowRule.canBeAdded(balls, Ball.createYellowBall());
    }
}
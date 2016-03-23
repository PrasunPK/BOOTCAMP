package ball;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BallsTest {

    @Test
    public void should_add_multiple_balls_to_the_balls() {
        Balls balls = new Balls();
        balls.add(Ball.createGreenBall());
        balls.add(Ball.createGreenBall());
        balls.add(Ball.createGreenBall());
        assertEquals(3, balls.size());
    }


}
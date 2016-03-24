package summary;

import ball.Ball;
import ball.Balls;
import org.junit.Test;

public class TotalSummarizerTest {
    @Test
    public void should_give_summary__when_two_green_balls_and_two_blue_balls_are_added() {
        Balls balls = new Balls();
        balls.add(Ball.createGreenBall());
        balls.add(Ball.createGreenBall());

        balls.add(Ball.createBlueBall());
        balls.add(Ball.createBlueBall());

        TotalSummarizer summarizer = new TotalSummarizer();
        Summary summary = summarizer.summarize(balls);

    }
}
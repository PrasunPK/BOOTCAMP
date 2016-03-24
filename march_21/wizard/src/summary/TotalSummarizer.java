package summary;

import ball.Balls;
import javafx.util.Pair;

import java.util.ArrayList;

public class TotalSummarizer implements Summarizer {
    @Override
    public Summary summarize(Balls balls) {
        ArrayList<String> ballColorSummary = balls.createColorSummary();
        return makeSummary(ballColorSummary);
    }

    private Summary makeSummary(ArrayList<String> ballColorSummary) {
        ArrayList<Pair<String, Integer>> colorSet = new ArrayList<>();
        for (String color : ballColorSummary) {
            Pair<String, Integer> pair;
        }
        return null;
    }
}

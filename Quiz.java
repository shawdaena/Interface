package Interface;

public class Quiz implements Measurable {
    private double score;

    public Quiz(double aScore) {
        score = aScore;
    }

    @Override
    public double getMeasurement() {
        return score;
    }
}

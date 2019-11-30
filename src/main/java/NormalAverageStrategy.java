import java.util.*;

public class NormalAverageStrategy implements  AverageStrategy{

    public double computeAverage(List<Double> assignments, List<Double> exams) {
        double totalAssignmentScores = 0.0;
        for (Double score: assignments) {
            totalAssignmentScores += score;
        }
        double totalExamScores = 0.0;
        for (Double score: exams) {
            totalExamScores += score;
        }
        double result = (totalAssignmentScores / (assignments.size() * 100)) * 0.4
                + (totalExamScores / (exams.size() * 100)) * 0.6;
        return result;
    }
}
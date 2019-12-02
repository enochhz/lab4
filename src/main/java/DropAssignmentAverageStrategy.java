import java.util.*;

public class DropAssignmentAverageStrategy implements AverageStrategy{
    public double computeAverage(List<Double> assignments, List<Double> exams) {
        Collections.sort(assignments);
        if (assignments.size() > 1) assignments.remove(0);
        double totalAssignmentScores = 0.0;
        for (Double score: assignments) {
            totalAssignmentScores += score;
        }
        double totalExamScores = 0.0;
        for (Double score: exams) {
            totalExamScores += score;
        }
        double result = (totalAssignmentScores / (assignments.size() * 100)) * 40
                + (totalExamScores / (exams.size() * 100)) * 60;
        return result;
    }
}

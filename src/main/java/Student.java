import java.util.*;

public class Student {

    private String name;
    private List<Double> assignmentScores;
    private List<Double> examScores;

    public static void main(String[] args) {
        System.out.println("test");
    }

    public Student(String name) {
        this.name = name;
        this.assignmentScores = new ArrayList<>();
        this.examScores = new ArrayList<>();
    }

    public void addAssignmentScore(double score) {
        this.assignmentScores.add(score);
    }

    public void addExamScore(double score) {
        this.examScores.add(score);
    }

    public double getAverage(AverageStrategy averageStrategy) {
        return averageStrategy.computeAverage(assignmentScores, examScores);
    }

    public String toString() {
        return "name: " + name;
    }
}

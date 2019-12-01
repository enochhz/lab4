import java.util.*;

public class Student {

    private String name;
    private List<Double> assignmentScores;
    private List<Double> examScores;
    private AverageStrategy averageStrategy;
    private GradeTracker gradeTracker;

    public static void main(String[] args) {
        System.out.println("test");
    }

    public Student(String name) {
        this.name = name;
        this.assignmentScores = new ArrayList<>();
        this.examScores = new ArrayList<>();
        this.averageStrategy = new NormalAverageStrategy();
    }

    public void addAssignmentScore(double score) {
        this.assignmentScores.add(score);
        notifyObserver();
    }

    public void addExamScore(double score) {
        this.examScores.add(score);
        notifyObserver();
    }

    public void setGradeTracker(GradeTracker gradeTracker) {
        this.gradeTracker = gradeTracker;
    }

    private void notifyObserver() {
        if (gradeTracker != null) {
            gradeTracker.updateGrade(getAverage());
        }
    }

    public void setAverageStrategy(AverageStrategy averageStrategy) {
        this.averageStrategy = averageStrategy;
    }

    public double getAverage() {
        return averageStrategy.computeAverage(assignmentScores, examScores);
    }

    public String toString() {
        return "name: " + name;
    }
}

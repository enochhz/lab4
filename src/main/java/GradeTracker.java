public class GradeTracker {

    private double average;

    public GradeTracker(Student student) {
        this.average = student.getAverage();
        student.setGradeTracker(this);
    }

    public void updateGrade(double average) {
        this.average = average;
    }

    public String getGrade() {
        if (average >= 0.9) {
            return "A";
        } else if (average >= 0.8) {
            return "B";
        } else if (average >= 0.7) {
            return "C";
        } else if (average >= 0.6) {
            return "D";
        } else {
            return "F";
        }
    }

}

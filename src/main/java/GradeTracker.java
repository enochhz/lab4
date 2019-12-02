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
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 70) {
            return "D";
        } else {
            return "F";
        }
    }

}

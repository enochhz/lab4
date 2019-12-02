public class GradeTracker {

    private Student student;

    public GradeTracker(Student student) {
        this.student = student;
        student.setGradeTracker(this);
    }

    public void updateStudent(Student student) {
        this.student = student;
    }

    public String getGrade() {
        double average = student.getAverage();
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

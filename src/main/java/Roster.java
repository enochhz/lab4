import java.util.*;

public class Roster {

    public String courseName;
    public String courseNumber;
    public List<Student> students;

    public static void main(String[] args) {
        System.out.println("Test");
    }

    public Roster(String name, String number) {
        this.courseName = name;
        this.courseNumber = number;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public AvgDispenser getAverageIterator() {
        List<Double> averages = new ArrayList<>();
        for (Student student: students) {
            averages.add(student.getAverage());
        }
        return new AverageIterator(averages);
    }
}

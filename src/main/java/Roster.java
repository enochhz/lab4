import java.util.*;

public class Roster {

    private String courseName;
    private String courseNumber;
    private List<Student> students;

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
        return new AverageIterator(students);
    }
}

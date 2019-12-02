import org.junit.*;

public class GradeTrackerTest {

    private Student student;
    private GradeTracker gradeTracker;

    @Before
    public void init() {
        student = new Student("David");
        student.addAssignmentScore(100);
        student.addAssignmentScore(100);
        student.addAssignmentScore(0);
        student.addExamScore(100);
        student.addExamScore(100);
        gradeTracker = new GradeTracker(student);
    }

    @Test
    public void testGradeTracker() {
        String grade = gradeTracker.getGrade();
        System.out.println(grade);
        Assert.assertTrue(grade == "B");
    }

    @Test
    public void testGradeTracker2() {
        student.addExamScore(90);
        student.addAssignmentScore(100);
        student.addAssignmentScore(100);
        student.addAssignmentScore(100);
        student.addAssignmentScore(100);
        student.addAssignmentScore(100);
        student.addAssignmentScore(100);
        String grade = gradeTracker.getGrade();
        System.out.println(grade);
        Assert.assertTrue(grade == "A");
    }
}

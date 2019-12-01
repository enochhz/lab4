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
        System.out.println(gradeTracker.getGrade());
        Assert.assertTrue(false);
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
        System.out.println(gradeTracker.getGrade());
        Assert.assertTrue(false);
    }
}

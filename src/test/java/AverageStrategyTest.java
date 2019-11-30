import org.junit.*;

public class AverageStrategyTest {

    private Student student;

    @Before
    public void init() {
        student = new Student("David");
        student.addAssignmentScore(0);
        student.addAssignmentScore(100);
        student.addAssignmentScore(0);
        student.addExamScore(100);
        student.addExamScore(100);
    }

    @Test
    public void testNormalAverageStrategy() {
        double average = student.getAverage(new NormalAverageStrategy());
        System.out.println(average);
        Assert.assertTrue(false);
    }

    @Test
    public void testDropAssignmentAverageStrategy() {
        double average = student.getAverage(new DropAssignmentAverageStrategy());
        System.out.println(average);
        Assert.assertTrue(false);
    }

    @Test
    public void testNormalAverageStrategy2() {
        double average = student.getAverage(new NormalAverageStrategy());
        System.out.println(average);
        Assert.assertTrue(false);
    }
}

import org.junit.*;

public class AverageStrategyTest {

    private Student student;

    @Before
    public void init() {
        student = new Student("David");
        student.addAssignmentScore(50);
        student.addAssignmentScore(100);
        student.addAssignmentScore(0);
        student.addExamScore(100);
        student.addExamScore(100);
    }

    @Test
    public void testNormalAverageStrategy() {
        student.setAverageStrategy(new NormalAverageStrategy());
        double average = student.getAverage();
        System.out.println(average);
        Assert.assertTrue(average == 80);
    }

    @Test
    public void testDropAssignmentAverageStrategy() {
        student.setAverageStrategy(new DropAssignmentAverageStrategy());
        double average = student.getAverage();
        System.out.println(average);
        Assert.assertTrue(average == 90);
    }

    @Test
    public void testNormalAverageStrategy2() {
        student.setAverageStrategy(new NormalAverageStrategy());
        student.addAssignmentScore(100);
        double average = student.getAverage();
        System.out.println(average);
        Assert.assertTrue(average == 85);
    }
}

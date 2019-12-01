import org.junit.*;

public class AverageIteratorTest {

    private Roster roster;

    @Before
    public void init() {
        roster = new Roster("Software Engineering", "5800");
        Student student1 = new Student("David");
        student1.addAssignmentScore(0);
        student1.addAssignmentScore(100);
        student1.addAssignmentScore(0);
        student1.addExamScore(100);
        student1.addExamScore(100);
        roster.addStudent(student1);
        Student student2 = new Student("Kevin");
        student2.addAssignmentScore(100);
        student2.addAssignmentScore(100);
        student2.addAssignmentScore(100);
        student2.addExamScore(100);
        student2.addExamScore(100);
        roster.addStudent(student2);
    }

    @Test
    public void testAverageIterator() {
        AvgDispenser averageIterator = roster.getAverageIterator();
        while (averageIterator.hasNext()) {
            System.out.println(averageIterator.next());
        }
        Assert.assertTrue(false);
    }
}

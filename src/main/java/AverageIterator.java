import java.util.*;

public class AverageIterator  implements AvgDispenser{

    private List<Double> averages;
    private int next;

    public AverageIterator(List<Student> students) {
        averages = new ArrayList<>();
        for (Student student: students) {
            averages.add(student.getAverage());
        }
        this.next = 0;
    }

    public double next() {
        double average = averages.get(next);
        next++;
        return average;
    }

    public boolean hasNext() {
        if (next >= averages.size()) {
            return false;
        } else {
            return true;
        }
    }
}

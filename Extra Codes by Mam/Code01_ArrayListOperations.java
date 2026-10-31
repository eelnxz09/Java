import java.util.ArrayList;
import java.util.Collections;

public class Code01_ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(95);

        System.out.println("Original Scores: " + scores);
        Collections.sort(scores);
        System.out.println("Sorted Scores: " + scores);
        System.out.println("Highest Score: " + Collections.max(scores));
        System.out.println("Lowest Score: " + Collections.min(scores));
    }
}

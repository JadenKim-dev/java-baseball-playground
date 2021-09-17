package baseball;

import java.util.Random;

public class AnswerGenerator {
    public Balls generate() {
        Random random = new Random();
        int[] answersArray = random.ints(1, 10)
                .distinct().limit(3).toArray();
        return new Balls(answersArray[0], answersArray[1], answersArray[2]);
    }
}

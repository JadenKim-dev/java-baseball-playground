package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private final List<Ball> ballList = new ArrayList<>();

    public Balls(int first, int second, int third) {
        ballList.add(new Ball(1, first));
        ballList.add(new Ball(2, second));
        ballList.add(new Ball(3, third));
    }

    public List<Ball> getBallList() {
        return ballList;
    }

    public GameResult compare(Balls answers) {
        GameResult result = new GameResult();
        ballList.stream()
                .map(b -> b.compare(answers))
                .forEach(result::add);
        return result;
    }
}

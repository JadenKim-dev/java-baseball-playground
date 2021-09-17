package baseball;

public class Ball {
    private final int num;
    private final int index;

    public Ball(int index, int num) {
        this.index = index;
        this.num = num;
    }

    public BallStatus compare(Ball ball) {
        if(this.equals(ball)) {
            return BallStatus.STRIKE;
        }
        if(this.num == ball.getNum()) {
            return BallStatus.BALL;
        }

        return BallStatus.NOTHING;
    }

    public boolean equals(Ball ball) {
        return this.num == ball.getNum() && this.index == ball.getIndex();
    }

    private int getIndex() {
        return this.index;
    }

    private int getNum() {
        return this.num;
    }

    public BallStatus compare(Balls balls) {
        return balls.getBallList().stream()
                .map(this::compare)
                .filter(s -> !s.isNothing())
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }
}

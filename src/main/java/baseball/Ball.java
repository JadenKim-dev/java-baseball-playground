package baseball;

public class Ball {
    public static final int MIN_INDEX = 1;
    public static final int MAX_INDEX = 3;
    public static final int MIN_NUM = 1;
    public static final int MAX_NUM = 9;
    private final int num;
    private final int index;

    public Ball(int index, int num) {
        validateIndexAndNum(index, num);
        this.index = index;
        this.num = num;
    }

    private void validateIndexAndNum(int index, int num) {
        if (index < MIN_INDEX || index > MAX_INDEX) {
            throw new IllegalArgumentException("index는 1~3까지의 정수만 가능합니다");
        }
        if (num < MIN_NUM || num > MAX_NUM) {
            throw new IllegalArgumentException("숫자는 1~9까지의 정수만 가능합니다");
        }
    }

    public BallStatus compare(Ball ball) {
        if (this.equals(ball)) {
            return BallStatus.STRIKE;
        }
        if (this.num == ball.getNum()) {
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

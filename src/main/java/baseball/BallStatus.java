package baseball;

public enum BallStatus {
    NOTHING, STRIKE, BALL;

    public boolean isNothing() {
        return this == BallStatus.NOTHING;
    }

    public boolean isStrike() {
        return this == BallStatus.STRIKE;
    }

    public boolean isBall() {
        return this == BallStatus.BALL;
    }
}

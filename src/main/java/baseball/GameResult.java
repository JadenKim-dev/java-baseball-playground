package baseball;

public class GameResult {
    private int strike = 0;
    private int ball = 0;

    public boolean validate(int strike, int ball) {
        return this.strike == strike && this.ball == ball;
    }

    public void add(BallStatus status) {
        if(status.isStrike()) {
            strike++;
        }
        if(status.isBall()) {
            ball++;
        }
    }

    public boolean hasBall() {
        return this.ball > 0;
    }

    public int getBall() {
        return this.ball;
    }

    public boolean hasStrike() {
        return this.strike > 0;
    }

    public int getStrike() {
        return this.strike;
    }

    public boolean isNothing() {
        return this.ball == 0 && this.strike == 0;
    }

    public boolean isFullStrike() {
        return this.strike == 3;
    }
}

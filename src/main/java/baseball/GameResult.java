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
}

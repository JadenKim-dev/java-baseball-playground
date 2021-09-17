package baseball;

public class ResultView {
    private final InputView inputView;

    public ResultView(InputView inputView) {
        this.inputView = inputView;
    }

    public RestartState printResult(GameResult result) {
        if(result.hasBall()) {
            System.out.print(result.getBall() + "볼 ");
        }
        if(result.hasStrike()) {
            System.out.print(result.getStrike() + "스트라이크");
        }
        if(result.isFullStrike()) {
            System.out.println("\n3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return inputView.inputRestartState();
        }
        if(result.isNothing()) {
            System.out.print("낫싱");
        }
        System.out.println();
        return RestartState.CONTINUE;
    }
}

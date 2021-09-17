package baseball;

import java.util.Scanner;

public class InputView {
    Scanner sc;

    public InputView() {
        sc = new Scanner(System.in);
    }

    public int inputNumber() {
        System.out.print("숫자를 입력해 주세요 : ");
        return sc.nextInt();
    }

    public RestartState inputRestartState() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return mapRestartState(sc.nextInt());
    }

    private RestartState mapRestartState(int num) {
        if(num == 0){
            return RestartState.CONTINUE;
        }
        if(num == 1) {
            return RestartState.RESTART;
        }
        if(num == 2) {
            return RestartState.END;
        }
        throw new IllegalArgumentException("재시작/종료 여부로는 1,2만 입력 가능합니다.");
    }
}

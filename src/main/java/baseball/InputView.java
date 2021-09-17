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

    public int inputRestartState() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return sc.nextInt();
    }
}

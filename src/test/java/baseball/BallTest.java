package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    @Test
    @DisplayName("두 개의 공을 비교하는 로직 : strike")
    void compare_strike() {
        Ball answer = new Ball(1, 1);
        Ball input = new Ball(1, 1);

        BallStatus result = answer.compare(input);
        assertThat(result.isStrike()).isTrue();
    }

    @Test
    @DisplayName("두 개의 공을 비교하는 로직 : ball")
    void compare_ball() {
        Ball answer = new Ball(1, 1);
        Ball input = new Ball(2, 1);

        BallStatus result = answer.compare(input);
        assertThat(result.isBall()).isTrue();
    }


    @Test
    @DisplayName("두 개의 공을 비교하는 로직 : nothing")
    void compare_nothing() {
        Ball answer = new Ball(1, 1);
        Ball input = new Ball(1, 3);

        BallStatus result = answer.compare(input);
        assertThat(result.isNothing()).isTrue();
    }
}

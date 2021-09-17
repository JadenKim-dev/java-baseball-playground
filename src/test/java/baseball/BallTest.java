package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BallTest {

    private Ball answer;
    private Balls answers;

    @BeforeEach
    void setUp() {
        answer = new Ball(1, 1);
        answers = new Balls(1, 2, 3);
    }

    @Test
    @DisplayName("Input의 공 하나와 Output을 비교하는 로직 : strike")
    void compare_Balls_strike() {
        Ball input = new Ball(1, 1);

        BallStatus result = input.compare(answers);
        assertThat(result.isStrike()).isTrue();
    }

    @Test
    @DisplayName("Input의 공 하나와 Output을 비교하는 로직 : ball")
    void compare_Balls_ball() {
        Ball input = new Ball(1, 3);

        BallStatus result = input.compare(answers);
        assertThat(result.isBall()).isTrue();
    }

    @Test
    @DisplayName("Input의 공 하나와 Output을 비교하는 로직 : nothing")
    void compare_Balls_nothing() {
        Ball input = new Ball(1, 4);

        BallStatus result = input.compare(answers);
        assertThat(result.isNothing()).isTrue();
    }

    @Test
    @DisplayName("두 개의 공을 비교하는 로직 : strike")
    void compare_strike() {
        Ball input = new Ball(1, 1);

        BallStatus result = input.compare(answer);
        assertThat(result.isStrike()).isTrue();
    }

    @Test
    @DisplayName("두 개의 공을 비교하는 로직 : ball")
    void compare_ball() {
        Ball input = new Ball(2, 1);

        BallStatus result = input.compare(answer);
        assertThat(result.isBall()).isTrue();
    }


    @Test
    @DisplayName("두 개의 공을 비교하는 로직 : nothing")
    void compare_nothing() {
        Ball input = new Ball(1, 3);

        BallStatus result = input.compare(answer);
        assertThat(result.isNothing()).isTrue();
    }

    @Test
    @DisplayName("잘못된 index로 Ball 생성시 IllegalArgumentException 발생")
    void create_with_wrong_index() {
        assertThatThrownBy(() -> new Ball(0, 1)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Ball(4, 1)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("잘못된 num으로 Ball 생성시 IllegalArgumentException 발생")
    void create_with_wrong_num() {
        assertThatThrownBy(() -> new Ball(1, 0)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Ball(1, 10)).isInstanceOf(IllegalArgumentException.class);
    }
}

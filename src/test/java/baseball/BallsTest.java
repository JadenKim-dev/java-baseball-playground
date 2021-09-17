package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {

    private Balls answers;

    @BeforeEach
    void setUp() {
        answers = new Balls(1, 2, 3);
    }

    @Test
    @DisplayName("Input과 Answer를 비교하는 로직 - 2strike")
    void compare_2strike() {
        Balls inputs = new Balls(1, 2, 9);

        GameResult result = inputs.compare(answers);
        assertThat(result.validate(2, 0)).isTrue();
    }

    @Test
    @DisplayName("Input과 Answer를 비교하는 로직 - 1strike2ball")
    void compare_1strike2ball() {
        Balls inputs = new Balls(1, 3, 2);

        GameResult result = inputs.compare(answers);
        assertThat(result.validate(1, 2)).isTrue();
    }

    @Test
    @DisplayName("Input과 Answer를 비교하는 로직 - out")
    void compare_out() {
        Balls inputs = new Balls(4, 5, 6);

        GameResult result = inputs.compare(answers);
        assertThat(result.validate(0, 0)).isTrue();
    }
}

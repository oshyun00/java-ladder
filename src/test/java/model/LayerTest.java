package model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LayerTest {
    List<Step> steps;
    Layer layer;

    @BeforeEach
    void setUp() {
        steps = new ArrayList<>(List.of(Step.EMPTY, Step.EXIST, Step.EMPTY));
        layer = new Layer(steps);
    }

    @Test
    void 오른쪽으로_이동할수있으면_이동한다() {
        int startIndex = 1;
        int expectedMovedIndex = 2;

        assertThat(layer.move(startIndex)).isEqualTo(expectedMovedIndex);
    }

    @Test
    void 오른쪽으로_이동할수없으면_멈춰있는다() {
        int startIndex = 0;
        int expectedMovedIndex = 0;

        assertThat(layer.move(startIndex)).isEqualTo(expectedMovedIndex);
    }

    @Test
    void 왼쪽으로_이동할수있으면_이동한다() {
        int startIndex = 2;
        int expectedMovedIndex = 1;

        assertThat(layer.move(startIndex)).isEqualTo(expectedMovedIndex);
    }

    @Test
    void 왼쪽으로_이동할수없으면_멈춰있는다() {
        int startIndex = 3;
        int expectedMovedIndex = 3;

        assertThat(layer.move(startIndex)).isEqualTo(expectedMovedIndex);
    }
}

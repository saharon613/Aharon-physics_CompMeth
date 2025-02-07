package aharon.physics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForceTest {
    @Test
    public void add() {
        // set variables in given
        Force a = new Force(32, 10);
        Force b = new Force(105, 10);

        // test method in when
        Force c = a.add(b);

        // check results in then
        assertEquals(68.5, c.getDegrees(), .1);
        assertEquals(16.08, c.getMagnitude(), .1);
    }

    @Test
    void scale() {
        // given
        Force a = new Force(30, 15);

        // when
        Force scale = a.scale(.391);

        // then
        assertEquals(30, scale.getDegrees(), .1);
        assertEquals(5.865, scale.getMagnitude(), .001);
    }
}
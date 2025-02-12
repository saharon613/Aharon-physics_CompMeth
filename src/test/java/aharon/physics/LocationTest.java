package aharon.physics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {

    @Test
    void apply()
    {
        // given
        Location a = new Location(7, 3);
        Force f = new Force(36.87, 5);

        // when
        Location b = a.apply(f);

        // then
        assertEquals(11, b.getX(), .1);
        assertEquals(6, b.getY(), .1);
    }
}
package aharon.physics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectileTest {

    @Test
    void add() {
        Location initialLocation = new Location(0, 0);
        Force initialForce = new Force(5, 5);
        Projectile projectile = new Projectile(initialLocation, initialForce);

        Force additionalForce = new Force(3, -2);
        projectile.add(additionalForce);

        assertEquals(8, projectile.getForce().getX(), 0.0001);
        assertEquals(3, projectile.getForce().getY(), 0.0001);
    }

    @Test
    void move() {
        Location initialLocation = new Location(0, 0);
        Force initialForce = new Force(2, 3);
        Projectile projectile = new Projectile(initialLocation, initialForce);

        projectile.move(2);

        assertEquals(4, projectile.getLocation().getX(), 0.0001);
        assertEquals(6, projectile.getLocation().getY(), 0.0001);
    }
}
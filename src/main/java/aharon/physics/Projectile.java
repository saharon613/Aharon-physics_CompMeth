package aharon.physics;

public class Projectile
{
    private Location location;
    private Force force;

    public Projectile(Location location, Force force) {
        this.location = location;
        this.force = force;
    }

    public Force getForce() {return force;}

    public Location getLocation() {return location;}

    public void add(Force force)
    {
        this.force = this.force.add(force);
    }

    public void move(double time)
    {
        Force scaled = force.scale(time);
        location = location.move(scaled);
    }
}

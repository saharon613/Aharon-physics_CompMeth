package aharon.physics;
public class Location
{
    private double x;
    private double y;

    public Location(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Location apply(Force force) {
        double newX = this.x + force.getMagnitude() * Math.cos(Math.toRadians(force.getDegrees()));
        double newY = this.y + force.getMagnitude() * Math.sin(Math.toRadians(force.getDegrees()));

        return new Location(newX, newY);
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }
}

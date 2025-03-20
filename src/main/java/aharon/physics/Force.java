package aharon.physics;

public class Force {

    public static final Force GRAVITY = new Force(0, -9.8);     // static means it is a constant

    private double x;
    private double y;

    Force(Degrees degrees, double magnitude)
    {
        x = magnitude * Math.cos(degrees.toRadians());
        y = magnitude * Math.sin(degrees.toRadians());
    }

    public Force(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Force add(Force force2) {
        double firstX = force2.getX();
        double secondX = this.getX();
        double firstY = force2.getY();
        double secondY = this.getY();

        double finalX = firstX + secondX;
        double finalY = firstY + secondY;

        return new Force(finalX, finalY);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDegrees() {
        return Math.toDegrees(Math.atan2(y, x));
    }

    public double getMagnitude() {
        return Math.hypot(x, y);
    }

    public Force scale(double scale) {
        return new Force(x * scale, y * scale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(x).append(", ").append(y).append("\n");
        return sb.toString();
    }
}


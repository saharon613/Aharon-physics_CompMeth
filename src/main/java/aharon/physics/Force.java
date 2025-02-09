package aharon.physics;

public class Force {
    private double degrees;
    private double magnitude;

    public Force(double degrees, double magnitude) {
        this.degrees = degrees;
        this.magnitude = magnitude;
    }

    public Force add(Force force2) {
        double firstX = force2.getX();
        double secondX = this.getX();
        double firstY = force2.getY();
        double secondY = this.getY();

        double finalX = firstX + secondX;
        double finalY = firstY + secondY;

        double finalAngle = Math.toDegrees(Math.atan2(finalY, finalX));
        double magnitude = Math.hypot(finalX, finalY);

        return new Force(finalAngle, magnitude);
    }

    public double getX() {
        return magnitude * Math.cos(Math.toRadians(degrees));
    }

    public double getY() {
        return magnitude * Math.sin(Math.toRadians(degrees));
    }

    public double getDegrees() {
        return degrees;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public Force scale(double scale) {
        return new Force(degrees, magnitude * scale);
    }
}


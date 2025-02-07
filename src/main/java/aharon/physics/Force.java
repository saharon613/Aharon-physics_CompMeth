package aharon.physics;
/***
 * Force should have:
 * degree
 * magnitude
 * and a constructor
 * method:
 *Force add(Force f)
 */

//public class Force {
//    private double degrees;
//    private double magnitude;
//    private double xAxis;
//    private double yAxis;
//
//    public Force(double degrees, double magnitude) {
//        this.degrees = degrees;
//        this.magnitude = magnitude;
//        xAxis = magnitude * Math.cos(Math.toRadians(degrees));
//        yAxis = magnitude * Math.sin(Math.toRadians(degrees));
//    }
//
//    public Force add(Force force2) {
//        double finalX = this.xAxis + force2.xAxis;
//        double finalY = this.yAxis + force2.yAxis;
//
//        double resultingMagnitude = Math.hypot(finalX, finalY);
//        double resultingDegrees = Math.toDegrees(Math.atan2(finalY, finalX));
//
//        return new Force(resultingDegrees, resultingMagnitude);
//    }
//
//    public double getDegrees() {
//        return degrees;
//    }
//
//    public double getMagnitude() {
//        return magnitude;
//    }
//}

public class Force {
    private double degrees;
    private double magnitude;

    public Force(double degrees, double magnitude) {
        this.degrees = degrees;
        this.magnitude = magnitude;
    }

    public Force add(Force force2) {
        double firstX = force2.magnitude * Math.cos(Math.toRadians(force2.degrees));
        double secondX = this.magnitude * Math.cos(Math.toRadians(this.degrees));
        double firstY = force2.magnitude * Math.sin(Math.toRadians(force2.degrees));
        double secondY = this.magnitude * Math.sin(Math.toRadians(this.degrees));

        double finalX = firstX + secondX;
        double finalY = firstY + secondY;

        double finalAngle = Math.toDegrees(Math.atan2(finalY, finalX));
        double magnitude = Math.hypot(finalX, finalY);

        return new Force(finalAngle, magnitude);
    }

    public double getDegrees() {
        return degrees;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public Force scale(double scale) {
        return new Force(degrees,magnitude * scale);
    }
}


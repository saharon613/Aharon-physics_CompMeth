package aharon.physics;

public class Forces {
    public static double magCosDegree(double magnitude, double degree) {
        return magnitude * Math.cos(Math.toRadians(degree));
    }

    public static double magSinDegree(double magnitude, double degree) {
        return magnitude * Math.sin(Math.toRadians(degree));
    }

    public static double getMag(double finalX, double finalY) {
        double squareX = Math.pow(finalX, 2);
        double squareY = Math.pow(finalY, 2);
        double totalSquared = squareX + squareY;
        return Math.sqrt(totalSquared);
    }

    public static double getAngle(double finalX, double finalY) {
        double tanNum = finalY / finalX;
        double tanResult = Math.atan(tanNum);
        return Math.toDegrees(tanResult);
    }

    public static void main(String[] args) {
        double firstX = magCosDegree(10, 32);
        double secondX = magCosDegree(10, 105);
        double firstY = magSinDegree(10, 32);
        double secondY = magSinDegree(10, 105);

        double finalX = firstX + secondX;
        double finalY = firstY + secondY;

        double magnitude = getMag(finalX, finalY);
        System.out.println("The resulting magnitude is: " + String.format("%.2f", magnitude));

        double finalAngle = getAngle(finalX, finalY);
        System.out.println("The resulting angle is: " + String.format("%.2f", finalAngle) + " degrees");
    }
}
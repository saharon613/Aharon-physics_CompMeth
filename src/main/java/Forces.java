public class Forces {
    public static double magCOSdegree(double magnitude, double degree) {
        return magnitude * Math.cos(Math.toRadians(degree));
    }

    public static double magSINdegree(double magnitude, double degree) {
        return magnitude * Math.sin(Math.toRadians(degree));
    }

    public static double getMag(double finalX, double finalY) {
        double squareX = Math.pow(finalX, 2);
        double squareY = Math.pow(finalY, 2);
        double totalSquared = squareX + squareY;
        return Math.sqrt(totalSquared);
    }

//    public static double getMag(double finalX, double finalY) {
//        return Math.hypot(finalX, finalY);
//    }

    public static double getAngle(double finalX, double finalY) {
        double tanNum = finalY / finalX;
        double tan_result = Math.atan(tanNum);
        return Math.toDegrees(tan_result);
    }

//    public static double getAngle(double finalX, double finalY) {
//        return Math.toDegrees(Math.atan2(finalY, finalX));
//    }

    public static void main(String[] args) {
        double firstX = magCOSdegree(10, 32);
        double secondX = magCOSdegree(10, 105);
        double firstY = magSINdegree(10, 32);
        double secondY = magSINdegree(10, 105);

        double finalX = firstX + secondX;
        double finalY = firstY + secondY;

//        System.out.println("First X: " + firstX);
//        System.out.println("Second X: " + secondX);
//
//        System.out.println("First Y: " + firstY);
//        System.out.println("Second Y: " + secondY);
//
//        System.out.println("Final X: " + finalX);
//        System.out.println("Final Y: " + finalY);

        double magnitude = getMag(finalX, finalY);
        System.out.println("The resulting magnitude is: " + String.format("%.2f", magnitude));

        double finalAngle = getAngle(finalX, finalY);
        System.out.println("The resulting angle is: " + String.format("%.2f", finalAngle) + " degrees");
    }
}
package aharon.physics;

public class Degrees
{
    private double value;

    public Degrees(double value){
        this.value = value;
    }

    public double toRadians()
    {
        return Math.toRadians(value);
    }

    public double toDegrees(){
        return value;
    }
}

package aharon.physics;
/***
 * Force should have:
 * degree
 * magnitude
 * and a constructor
 * method:
 *Force add(Force f)
 */

public class Force {
    public int degrees;
    public int magnitude;

    public Force(int degrees, int magnitude) {
        this.degrees = degrees;
        this.magnitude = magnitude;
    }
}

Force add(Force f){
    // this return the third resulting force
}
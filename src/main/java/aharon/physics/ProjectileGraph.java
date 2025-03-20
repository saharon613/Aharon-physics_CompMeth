package aharon.physics;

import javax.swing.*;
import java.awt.*;

public class ProjectileGraph extends JComponent {

    private double angle;
    private double magnitude;
    private double time;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);                // this clears the super one so that you can override it w/ your own

        g.translate(0, getHeight());         // this moves the origin

        Projectile p = new Projectile(new Location(0,0), new Force(new Degrees(angle), magnitude));

        g.setColor(Color.MAGENTA);

        for (int t = 0; t < time; t++) {
            Location location1 = p.getLocation();

            p.add(Force.GRAVITY);
            p.move(1);

            Location location2 = p.getLocation();
            g.drawLine(
                    (int)location1.getX(),
                    (int)-location1.getY(),
                    (int)location2.getX(),
                    (int)-location2.getY());
        }
    }

    public void setValues(double angle, double magnitude, double time) {
        this.angle = angle;
        this.magnitude = magnitude;
        this.time = time;
        repaint();
    }
}

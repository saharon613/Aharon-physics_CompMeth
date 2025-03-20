package aharon.physics;

import javax.swing.*;

public class PhysicsController
{
    private final JSlider angleSlider;
    private final JTextField magnitudeField;
    private final JTextField timeField;
    private final JLabel locationLabel;
    private final ProjectileGraph graph;

    public PhysicsController(
            JSlider angleSlider,
            JTextField magnitudeField,
            JTextField timeField,
            JLabel locationLabel,
            ProjectileGraph graph) {

        this.angleSlider = angleSlider;
        this.magnitudeField = magnitudeField;
        this.timeField = timeField;
        this.locationLabel = locationLabel;
        this.graph = graph;
    }

    public void calculate() {
        double angle = angleSlider.getValue();
        double magnitude = Double.parseDouble(magnitudeField.getText());

        String magnitudeText = magnitudeField.getText();
        if (magnitudeText.isEmpty() || !magnitudeText.matches("\\d+")) {
            return;
        }

        Projectile p = new Projectile(new Location(0, 0), new Force(new Degrees(angle), magnitude));

        String timeText = timeField.getText();
        if (timeText.isEmpty() || !timeText.matches("\\d+")) {
            return;
        }

        double time = Double.parseDouble(timeField.getText());

        graph.setValues(angle, magnitude, time);

        for (int i = 0; i < time; i++)
        {
            p.move(1);
        }

        Location location = p.getLocation();
        String formatX = String.format("%.2f", location.getX());
        String formatY = String.format("%.2f", location.getY());
        locationLabel.setText("(" + formatX + ", " + formatY + ")");
    }
}

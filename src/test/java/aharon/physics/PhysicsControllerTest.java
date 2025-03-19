package aharon.physics;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PhysicsControllerTest {

    @Test
    void calculate() {
        JSlider angleSlider = mock();
        doReturn(52).when(angleSlider).getValue();
        JTextField magnitudeField = mock();
        doReturn("80").when(magnitudeField).getText();
        JTextField timeField = mock();
        doReturn("10").when(timeField).getText();
        JLabel locationLabel = mock();
        PhysicsController controller = new PhysicsController
                (angleSlider, magnitudeField, timeField, locationLabel);

        // when
        controller.calculate();

        // then
        verify(locationLabel).setText("(492.53, 630.41)");
    }
}
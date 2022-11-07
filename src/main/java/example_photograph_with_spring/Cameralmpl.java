package example_photograph_with_spring;

import example_photograph.CameraRoll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Cameralmpl implements Camera {

    @Autowired
    @Qualifier("cameraRoll")
    private CameraRoll cameraRoll;

    @Override
    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    @Override
    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    @Override
    public void doPhotograph() {
        System.out.println("Щелк!");
        cameraRoll.processing();
    }
}

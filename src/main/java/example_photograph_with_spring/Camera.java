package example_photograph_with_spring;

import example_photograph.CameraRoll;

public interface Camera {
    CameraRoll getCameraRoll();
    void setCameraRoll(CameraRoll cameraRoll);
    void doPhotograph();
}

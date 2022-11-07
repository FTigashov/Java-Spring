package example_photograph;

public class Assistant {
    public Camera getCamera() {
        Camera camera = new Camera();
        CameraRoll cameraRoll = new ColorCameraRoll();
        camera.setCameraRoll(cameraRoll);
        return camera;
    }
}

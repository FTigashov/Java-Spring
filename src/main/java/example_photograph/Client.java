package example_photograph;


public class Client {
    // Реализация IoC без Spring
    public static void main(String[] args) {
        Assistant assistant = new Assistant();
        Camera camera = assistant.getCamera();
        camera.doPhotograph();
    }
}

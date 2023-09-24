package homeWork1;

import homeWork1.ModelElements.Camera;
import homeWork1.ModelElements.Scene;
import homeWork1.inMemoryModel.ModelStore;

public class Main {
    public static void main(String[] args) {
        ModelStore modelstore = new ModelStore();
        modelstore.Cameras.Rotate();
        Scene scene = new Scene();

        Camera camera = new Camera();
        scene.myCamera(camera);
        scene.Cameras.Rotate();
    }
}

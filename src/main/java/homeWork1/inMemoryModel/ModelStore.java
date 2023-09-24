package homeWork1.inMemoryModel;

import homeWork1.ModelElements.*;

public class ModelStore implements IModelChanger{
    public Flash Flashes = new Flash();
    public PoligonalModel Models = new PoligonalModel();
    public Camera Cameras = new Camera();
    public Scene Scenes = new Scene();
    private void changeObserve (IModelChangedObserver im){
    }

    @Override
    public void NotifyChange() {
    }

    public Scene GetScene (int num){
        Scene scene = new Scene();
        return scene;
    }
}

package homeWork1.ModelElements;

public class Scene {
    public int id;
    public PoligonalModel Models;
    public Flash Flashes;
    public Camera Cameras;



    public void  myPM (PoligonalModel PM){
        this.Models = PM;
    }
    public void  myFlash(Flash flash){
        this.Flashes = flash;
    }
    public void myCamera (Camera camera){
        this.Cameras = camera;
    }
}

package abstractClass;

import abstractClass.camera.Camera;
import abstractClass.camera.FactoryCam;
import abstractClass.camera.SpeedCam;

public class AbstractClassPrac {
    public static void main(String[] args) {
        // 추상클래스

//        Camera camera = new Camera();

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}

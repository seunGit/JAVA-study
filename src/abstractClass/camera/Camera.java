package abstractClass.camera;

public abstract class Camera {
    public void takePicture() {
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {
        System.out.println("동영상을 녹화합니다.");
    }

    // 추상메소드 정의
    public abstract void showMainFeature();
}
